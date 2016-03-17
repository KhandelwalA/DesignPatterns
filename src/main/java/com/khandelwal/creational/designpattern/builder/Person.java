package com.khandelwal.creational.designpattern.builder;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private MaritalStatusEnum maritalStatus;
	private String homeAddress;
	private String businessAddress;
	private long mobile;
	private String emailAddress;

	private Person(PersonBuilder personBuilder) {

		firstName = personBuilder.firstName;
		lastName = personBuilder.lastName;
		age = personBuilder.age;
		maritalStatus = personBuilder.maritalStatus;
		homeAddress = personBuilder.homeAddress;
		businessAddress = personBuilder.businessAddress;
		mobile = personBuilder.mobile;
		emailAddress = personBuilder.emailAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public MaritalStatusEnum getMaritalStatus() {
		return maritalStatus;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public String getBusinessAddress() {
		return businessAddress;
	}

	public long getMobile() {
		return mobile;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public static class PersonBuilder {

		private String firstName;
		private String lastName;
		private int age;
		private MaritalStatusEnum maritalStatus;
		private String homeAddress;
		private String businessAddress;
		private long mobile;
		private String emailAddress;

		public PersonBuilder firstName(String aFirstName) {
			this.firstName = aFirstName;
			return this;
		}

		public PersonBuilder lastName(String aLastName) {
			this.lastName = aLastName;
			return this;
		}

		public PersonBuilder age(int aAge) {
			this.age = aAge;
			return this;
		}

		public PersonBuilder maritalStatus(MaritalStatusEnum aMaritalStatus) {
			this.maritalStatus = aMaritalStatus;
			return this;
		}

		public PersonBuilder homeAddress(String aHomeAddress) {
			this.homeAddress = aHomeAddress;
			return this;
		}

		public PersonBuilder businessAddress(String aBusinessAddress) {
			this.businessAddress = aBusinessAddress;
			return this;
		}

		public PersonBuilder mobile(long aMobile) {
			this.mobile = aMobile;
			return this;
		}

		public PersonBuilder emailAddress(String aEmailAddress) {
			this.emailAddress = aEmailAddress;
			return this;
		}

		public Person build() {

			return new Person(this);
		}

	}
}
