
public class Contact {

	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	
	// Constructor
	public Contact(String id, String firstName, String lastName, String phone, String address) {
		if (id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if (firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if (lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if (phone == null || phone.length()!=10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		if (address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		
	}
	
	// Get ID
	public String getId() {
		return id;
	}
	
	// Set ID
	public void setId(String id) {
		this.id = id;
	}
	
	// Get First Name
	public String getFirstName() {
		return firstName;
	}
	
	// Set First Name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// Get Last Name
	public String getLastName() {
		return lastName;
	}
	
	// Set Last Name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// Get Phone Number
	public String getPhone() {
		return phone;
	}
	
	// Set Phone Number
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// Get Address
	public String getAddress() {
		return address;
	}
	
	// Set Address
	public void setAddress(String address) {
		this.address = address;
	}
}