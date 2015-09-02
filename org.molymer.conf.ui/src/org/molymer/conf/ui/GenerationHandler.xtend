package org.molymer.conf.ui

import org.eclipse.core.commands.IHandler
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.core.resources.IFile
import com.google.inject.Provider
import com.google.inject.Inject
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.core.resources.IProject
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.ui.resource.IResourceSetProvider
import org.eclipse.xtext.generator.IFileSystemAccess
import org.molymer.conf.configDsl.Config
import org.molymer.conf.generator.ConfigDslGenerator

class GenerationHandler extends AbstractHandler implements IHandler {
	@Inject ConfigDslGenerator generator
	@Inject Provider<EclipseResourceFileSystemAccess2> fileAccessProvider
	@Inject IResourceSetProvider resourceSetProvider
	
	override execute(ExecutionEvent event) throws ExecutionException {
		val file = event.configFile
		val project = file.project
		
		val res = project.getResourceOf(file.fullPath.toString)
		val config = res.contents.head as Config
		
		val fsa = project.getGenFileSystemAccess(config.outFolder)
		
		generate(project, config, fsa)
		return null
	}
	
	def generate(IProject project, Config config, IFileSystemAccess fsa) {
		val srcFolder = project.getFolder(config.srcFolder)
		srcFolder.accept[
			val path = fullPath.toString
			if(path.endsWith(".mdsl")) {
				println("Invoke generator for: " + path)
				val res = project.getResourceOf(path)
				
				try {
					generator.doGenerate(config, res, fsa)
				} catch(Exception e) {
					e.printStackTrace
				}
			}
			return true
		]
	}
	
	def getResourceOf(IProject project, String fileName) {
		val resourceSet = resourceSetProvider.get(project)
		
		val uri = URI.createPlatformResourceURI(fileName, true)
		return resourceSet.getResource(uri, true)
	}
	
	def getGenFileSystemAccess(IProject proj, String folder) {
		println('OUTPUT: ' + folder)
		
		val fsa = fileAccessProvider.get
		fsa => [
			monitor = new NullProgressMonitor
			project = proj
			outputPath = "/" + folder
		]

		val outConf = fsa.outputConfigurations.get(IFileSystemAccess.DEFAULT_OUTPUT)
		outConf => [
			createOutputDirectory = true
			canClearOutputDirectory = true
			overrideExistingResources = true
		]

		return fsa as IFileSystemAccess
	}
	
	def getConfigFile(ExecutionEvent event) {
		val selection = HandlerUtil.getCurrentSelection(event)
		if(selection instanceof IStructuredSelection) {
			val firstElement = selection.firstElement
			if(firstElement instanceof IFile) {
				return firstElement as IFile
			}
		}
	}
}