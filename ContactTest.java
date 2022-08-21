import org.junit.Assert;
import org.junit.Test;

public class ContactTest {
	
	// ID not null and not more than 10 characters
	@Test
	public void contactIdTest() {
		Contact contact = new Contact("111", "Walter", "White", "1234567890", "308 Negra Arroyo Lane");
		Assert.assertEquals("111", contact.getId());
	}
	
	// First name not null and not more than 10 characters
	@Test
	public void contactFirstNameTest() {
		Contact contact = new Contact("111", "Walter", "White", "1234567890", "308 Negra Arroyo Lane");
		Assert.assertEquals("Walter", contact.getFirstName());
	}
	
	// Last name not null and not more than 10 characters
	@Test
	public void contactLastNameTest() {
		Contact contact = new Contact("111", "Walter", "White", "1234567890", "308 Negra Arroyo Lane");
		Assert.assertEquals("White", contact.getLastName());
	}
	
	// Phone number not null and exactly 10 characters
	@Test
	public void contactPhoneTest() {
		Contact contact = new Contact("111", "Walter", "White", "1234567890", "308 Negra Arroyo Lane");
		Assert.assertEquals("1234567890", contact.getPhone());
	}
	
	// Address not null and not more than 30 characters
	@Test
	public void contactAddressTest() {
		Contact contact = new Contact("111", "Walter", "White", "1234567890", "308 Negra Arroyo Lane");
		Assert.assertEquals("308 Negra Arroyo Lane", contact.getAddress());
	}
}
