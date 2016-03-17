package com.khandelwal.creational.designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.khandelwal.creational.designpattern.singleton.SingletonByDoubleCheck;

import org.junit.Test;

public class SingletonByDoubleCheckJunit {

	@Test
	public void testAgainstReflection() throws ClassNotFoundException,
			NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {

		Class reflectiveClass = Class.forName("SingletonByDoubleCheck");
		@SuppressWarnings("rawtypes")
		Constructor[] constructor = reflectiveClass.getConstructors();
		for (Constructor cons: constructor) {
			cons.setAccessible(true);
			SingletonByDoubleCheck singletonByDoubleCheckInstanceOne = (SingletonByDoubleCheck) cons
					.newInstance();
			System.out.println("" + singletonByDoubleCheckInstanceOne.hashCode());
		}

		SingletonByDoubleCheck singletonByDoubleCheckInstanceTwo = SingletonByDoubleCheck
				.getInstance();
		System.out.println("" + singletonByDoubleCheckInstanceTwo.hashCode());
	}

	@Test(expected = CloneNotSupportedException.class)
	public void testAgainstCloning() throws CloneNotSupportedException {

		SingletonByDoubleCheck singletonByDoubleCheckInstanceOne = SingletonByDoubleCheck
				.getInstance();
		SingletonByDoubleCheck singletonByDoubleCheckInstanceTwo = (SingletonByDoubleCheck) singletonByDoubleCheckInstanceOne
				.clone();
	}

	@Test
	public void testAgainstSerializationDesrialization() {

	}

	@Test
	public void testAgainstMultithreading() {

	}
	
	
}
