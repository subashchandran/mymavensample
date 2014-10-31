/* Copyright 2014 Amazon.com, Inc. or its affiliates. All Rights Reserved. */

package com.subash.mavensample;

import junit.framework.TestCase;

public class FooTest extends TestCase {

	public void testFooMethod() throws InterruptedException {
		Thread.sleep(5000);
		assertEquals("Test failed", Foo.fooMethod(), Foo.FOO_MESSAGE);
	}
}
