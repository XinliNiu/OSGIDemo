package com.ifool.osgidemo.keepsayinghelloworld;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.ifool.osgidemo.ihelloworld.ISayHello;

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
		ServiceReference<ISayHello> ref = context.getServiceReference(ISayHello.class);
		ISayHello sayHello = context.getService(ref);
		KeepSaying keepSaying = new KeepSaying();
		keepSaying.setSayHello(sayHello);
		new Thread(keepSaying).start();
		System.out.println("keep saying");
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
