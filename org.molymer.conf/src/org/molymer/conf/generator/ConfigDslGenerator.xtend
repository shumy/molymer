/*
 * generated by Xtext
 */
package org.molymer.conf.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.molymer.conf.configDsl.Config
import org.eclipse.core.runtime.Platform

class ConfigDslGenerator implements IGenerator {

	def void doGenerate(Config config, Resource res, IFileSystemAccess fsa) {
		config.generators.filter[
			if(config.selectors.empty) 
				return true
			config.selectors.contains(name)
		].forEach[
			val bundleInst = Platform.getBundle(bundle)
			val genClassInst = bundleInst.loadClass(genClass)
			
			val genMethod = genClassInst.getMethod("doGenerate", Resource, IFileSystemAccess)
			val genInst = genClassInst.newInstance
		
			genMethod.invoke(genInst, res, fsa)
		]
	}
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException()
	}
}