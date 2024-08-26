package com.project.lodgemanagment.customerentity;


	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;

	public class Customer {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long customerid;
	    private String firstName;
	    private String lastName;
	    private String dateOfBirth;
	    private String email;
	    private String password;
		public Long getCustomerid() {
			return customerid;
		}
		public void setCustomerid(Long customerid) {
			this.customerid = customerid;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}

	}


