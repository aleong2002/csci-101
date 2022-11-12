package midterm2.java;


public class Person {
		
		private String FirstName;
		private String LastName;
		private String Address;
		private int    PhoneNumber;
		
		
		public void setFirstName(String FirstName){
			this.FirstName = FirstName;
		}
		public String getFirstName() {
			return FirstName;
		}
		public void setLastName(String LastName) {
			this.LastName = LastName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setAddress(String Address) {
			this.Address = Address;
		}
		public String getAddress() {
			return Address;
		}
		public void setPhoneNumber(int PhoneNumber) {
			this.PhoneNumber = PhoneNumber;
		}
		public int getPhoneNumber() {
			return PhoneNumber;
		}
		
		public Person(String FirstName, String LastName, String Address, int PhoneNumber) {
			this.FirstName   = FirstName;
			this.LastName    = LastName;
			this.Address     = Address;
			this.PhoneNumber = PhoneNumber;
		}
}

