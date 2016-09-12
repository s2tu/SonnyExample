package com.training.domains;

public class Address {
		private String street;
		private String city;
		private String pinCode;
		/**
		 * @return the street
		 */
		public String getStreet() {
			return street;
		}
		/**
		 * @param street the street to set
		 */
		public void setStreet(String street) {
			this.street = street;
		}
		/**
		 * @return the city
		 */
		public String getCity() {
			return city;
		}
		/**
		 * @param city the city to set
		 */
		public void setCity(String city) {
			this.city = city;
		}
		/**
		 * @return the pinCode
		 */
		public String getPinCode() {
			return pinCode;
		}
		/**
		 * @param pinCode the pinCode to set
		 */
		public void setPinCode(String pinCode) {
			this.pinCode = pinCode;
		}
		/**
		 * @param street
		 * @param city
		 * @param pinCode
		 */
		public Address(String street, String city, String pinCode) {
			super();
			this.street = street;
			this.city = city;
			this.pinCode = pinCode;
		}
		/**
		 * 
		 */
		public Address() {
			super();
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Address [street=" + street + ", city=" + city + ", pinCode=" + pinCode + "]";
		}
		
}
