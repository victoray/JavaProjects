
public class Contacts {
	
	public String  name;
	public String phoneNumber;
	
	
	
	public Contacts(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getContact() {
		return "Name: " + this.name + " " + " || Phone: " + this.phoneNumber;
	}
	
	

}
