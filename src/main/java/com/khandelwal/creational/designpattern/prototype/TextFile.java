package com.khandelwal.creational.designpattern.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextFile implements File {

	Logger log = LoggerFactory.getLogger(TextFile.class);

	public TextFile() {
		log.info("TextFile constructor");
	}

	public File makeClone() throws CloneNotSupportedException {

		log.info("TextFile makeClone method");
		return (TextFile) super.clone();
	}

}
