package com.doku.training.batch4;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * User: valentinussilalahi
 * Date: 2019-11-12
 * Time: 11:11
 * To change this template use File | Settings | File and Code Templates.
 */
public class AnatomiJavaSample {
	
	String name;
	static int age;
	String address;
	
	void konstruktorDefault(){
		System.out.println("ini adalah konstruktor dari AnatomiJavaSample.java");
	}

	public AnatomiJavaSample() {
		konstruktorDefault();
	}
	
	
}
