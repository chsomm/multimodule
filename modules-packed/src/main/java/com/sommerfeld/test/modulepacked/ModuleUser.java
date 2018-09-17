package com.sommerfeld.test.modulepacked;

import com.sommerfeld.test.module1.impl.Module1Impl;

public class ModuleUser {

	public static void useModule1() {
		String stringWithAnA = Module1Impl.getStringWithAnA("String");
		System.out.println(stringWithAnA);
	}
	
}
