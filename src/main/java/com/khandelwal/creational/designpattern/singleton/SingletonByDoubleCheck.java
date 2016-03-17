package com.khandelwal.creational.designpattern.singleton;

import java.io.Serializable;

/**
 * Scenarios to cater a. Reflection b. Cloning c. Serialization/Deserialization
 * d. Multithreading
 *
 */
@SuppressWarnings("serial")
public class SingletonByDoubleCheck implements Cloneable, Serializable {

	private static SingletonByDoubleCheck SINGLETON_INSTANCE;

	/* private constructor */
	private SingletonByDoubleCheck() {

	}

	/* method to get instance */
	public static SingletonByDoubleCheck getInstance() {

		if (SINGLETON_INSTANCE == null) {
			SINGLETON_INSTANCE = new SingletonByDoubleCheck();
		}

		return SINGLETON_INSTANCE;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		throw new CloneNotSupportedException();
	}
}