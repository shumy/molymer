/*
 * generated by Xtext
 */
package org.molymer;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ModelDslStandaloneSetup extends ModelDslStandaloneSetupGenerated{

	public static void doSetup() {
		new ModelDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
