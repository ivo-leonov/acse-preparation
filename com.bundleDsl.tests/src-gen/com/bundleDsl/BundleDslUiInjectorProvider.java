/*
 * generated by Xtext
 */
package com.bundleDsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class BundleDslUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return com.bundleDsl.ui.internal.BundleDslActivator.getInstance().getInjector("com.bundleDsl.BundleDsl");
	}
	
}
