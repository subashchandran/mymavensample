/* Copyright 2014 Amazon.com, Inc. or its affiliates. All Rights Reserved. */

package com.subash.mavensample;

public class Foo {
	
	protected static final String FOO_MESSAGE = "Hello maven";
	
	protected static String fooMethod() {
		return FOO_MESSAGE;
	}
	
	public static void main(String[] args) {
		System.out.println(fooMethod());
	}
}
