
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class ContactServiceTest {
	
	public ArrayList<Contact> testList = new ArrayList<Contact>();


	// Contacts can be added to list
	@Test
	public void addContactTest() {
		Contact contact1 = new Contact("111", "Walter", "White", "1234567890", "308 Negra Arroyo Lane");
		Contact contact2 = new Contact("112", "Skyler", "White", "1234567890", "308 Negra Arroyo Lane");
		testList.add(contact1);
		testList.add(contact2);
		Assert.assertTrue(testList.contains(contact1));
		Assert.assertTrue(testList.contains(contact2));
	}
	
	// Contacts can be deleted from list
	@Test
	public void deleteContactTest() {
		Contact contact3 = new Contact("113", "Holly", "White", "1234567890", "308 Negra Arroyo Lane");
		testList.remove(contact3);
		Assert.assertTrue(!testList.contains(contact3));
	}
	
	// Contact's first name in list can be updated
	@Test 
	public void updateFirstNameTest() {
		Contact contact4 = new Contact ("114", "Walter", "White Jr", "1234567890", "308 Negra Arroyo Lane");
		contact4.setFirstName("Flynn");
		Assert.assertEquals("Flynn", contact4.getFirstName());
	}
	
	// Contact's last name in list can be updated
	@Test 
	public void updateLastNameTest() {
		Contact contact4 = new Contact ("114", "Walter", "White Jr", "1234567890", "308 Negra Arroyo Lane");
		contact4.setLastName("Smith");
		Assert.assertEquals("Smith", contact4.getLastName());
	}
		
	// Contact's phone number in list can be updated
	@Test 
	public void updatePhoneTest() {
		Contact contact4 = new Contact ("114", "Walter", "White Jr", "1234567890", "308 Negra Arroyo Lane");
		contact4.setPhone("1234567891");
		Assert.assertEquals("1234567891", contact4.getPhone());
	}
	
	// Contact's address in list can be updated
	@Test 
	public void updateAddressTest() {
		Contact contact4 = new Contact ("114", "Walter", "White Jr", "1234567890", "308 Negra Arroyo Lane");
		contact4.setAddress("309 Negra Arroyo Lane");
		Assert.assertEquals("309 Negra Arroyo Lane", contact4.getAddress());
	}
}
