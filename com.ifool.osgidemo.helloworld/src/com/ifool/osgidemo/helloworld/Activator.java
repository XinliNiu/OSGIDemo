package com.ifool.osgidemo.helloworld;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.ifool.osgidemo.ihelloworld.ISayHello;
import com.ifool.osgidemo.ihelloworldimpl.SayHello;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		//System.out.println("Hello World");
		context.registerService(ISayHello.class.getName(), new SayHello(), null);
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("Goodbye World");
	}

}
