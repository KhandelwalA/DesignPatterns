package com.khandelwal.creational.designpattern.prototype;

public class PrototypeFactory {

	public static File getClone (File aFile) throws CloneNotSupportedException  {
		
		return aFile.makeClone();
	}
}
