package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public final class Exercise1 {

	public final static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		
		public Person(Set<String> phoneNumbers, String firstName,String lastName) {
			Set<String> tempPhoneNumber = new HashSet();
			for (String s: phoneNumbers ){
				tempPhoneNumber.add(s);
			}
			
			this.phoneNumbers = tempPhoneNumber;
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		
		
		public  String getFirstName() {
			return firstName;
		}
		
		
		public String getLastName() {
			return lastName;
		}
		
	}
}