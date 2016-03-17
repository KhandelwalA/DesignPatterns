package com.khandelwal.creational.designpattern.builder;

import static org.junit.Assert.*;

import org.junit.Test;

import com.khandelwal.creational.designpattern.builder.MaritalStatusEnum;
import com.khandelwal.creational.designpattern.builder.Person;

public class BuilderJunit {

	@Test
	public void personTest() {

		Person person = new Person.PersonBuilder().firstName("Abhishek")
				.lastName("Khandelwal").age(10)
				.homeAddress("Patel Nagar India").businessAddress("Crawley UK")
				.emailAddress("ak@email.com")
				.maritalStatus(MaritalStatusEnum.MARRIED).mobile(234334232)
				.build();

		assertEquals("Abhishek", person.getFirstName());
		assertEquals("Khandelwal", person.getLastName());
		assertEquals(10, person.getAge());
		assertEquals("Patel Nagar India", person.getHomeAddress().trim());
		assertEquals("Crawley UK", person.getBusinessAddress());
		assertEquals("ak@email.com", person.getEmailAddress());
		assertEquals(MaritalStatusEnum.MARRIED, person.getMaritalStatus());
		assertEquals(234334232, person.getMobile());
	}

}
