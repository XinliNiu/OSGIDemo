package com.ifool.osgidemo.ihelloworldimpl;

import com.ifool.osgidemo.ihelloworld.ISayHello;

public class SayHello implements ISayHello {

	@Override
	public void sayHello() {
		System.out.println("Hello World");
		
	}

}
