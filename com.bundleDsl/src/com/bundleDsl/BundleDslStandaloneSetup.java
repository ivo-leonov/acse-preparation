/*
 * generated by Xtext
 */
package com.bundleDsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class BundleDslStandaloneSetup extends BundleDslStandaloneSetupGenerated{

	public static void doSetup() {
		new BundleDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

