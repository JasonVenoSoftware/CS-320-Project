import java.util.ArrayList;
import java.util.List;

public class ContactService{
	
	// List to hold all contacts
	public ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	// Adds contact to list with given ID
	public void addContact(ArrayList<Contact> list, String id, String firstName, String lastName, String phone, String address)  {
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		list.add(contact);
	}
	
	// Deletes contact from list with given ID
	public void deleteContact(ArrayList<Contact> list, String id) throws Exception {
		list.remove(findContact(list, id));
	}
	
	// Updates the first name of a contact with given ID
	public void updateFirstName(ArrayList<Contact> list, String id, String firstName) throws Exception{
		findContact(list, id).setFirstName(firstName);
	}
	
	// Updates the last name of a contact with given ID
	public void updateLastName(ArrayList<Contact> list, String id, String lastName) throws Exception{
		findContact(list, id).setLastName(lastName);
	}
	
	// Updates the phone number of a contact with given ID
	public void updatePhone(ArrayList<Contact> list, String id, String phone) throws Exception{
		findContact(list, id).setPhone(phone);
	}
	
	// Updates the address of a contact with given ID
	public void updateAddress(ArrayList<Contact> list, String id, String address) throws Exception{
		findContact(list, id).setAddress(address);
	}
	
	// Finds contact in list given ID
	public Contact findContact(ArrayList<Contact> list, String id) throws Exception {
		int index = 0;
		while (index < list.size()) {
			if(id.equals(list.get(index).getId())) {
				return list.get(index);
			}
			index++;
		}
		throw new Exception ("Contact does not exist");
	}
}