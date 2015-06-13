package com.ifool.osgidemo.keepsayinghelloworld;

import com.ifool.osgidemo.ihelloworld.ISayHello;

public class KeepSaying implements Runnable{
	
	private ISayHello sayHello;

	public ISayHello getSayHello() {
		return sayHello;
	}

	public void setSayHello(ISayHello sayHello) {
		this.sayHello = sayHello;
	}

	@Override
	public void run() {
		
		while(true) {
			sayHello.sayHello();
			try {
				Thread.currentThread().sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
