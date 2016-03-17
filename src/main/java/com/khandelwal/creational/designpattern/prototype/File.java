package com.khandelwal.creational.designpattern.prototype;

public interface File extends Cloneable {

	File makeClone () throws CloneNotSupportedException;
}
