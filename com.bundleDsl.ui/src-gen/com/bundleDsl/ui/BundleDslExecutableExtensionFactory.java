/*
 * generated by Xtext
 */
package com.bundleDsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import com.bundleDsl.ui.internal.BundleDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class BundleDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return BundleDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return BundleDslActivator.getInstance().getInjector(BundleDslActivator.COM_BUNDLEDSL_BUNDLEDSL);
	}
	
}
