package com.khandelwal.creational.designpattern.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CSVFile implements File {

	//Logger log = LoggerFactory.getLogger(CSVFile.class);

	public CSVFile() {
		System.out.println("CSVFile constructor");
	}

	public File makeClone() throws CloneNotSupportedException {

		System.out.println("CSVFile makeClone method");
		return (CSVFile) super.clone();
	}

}
