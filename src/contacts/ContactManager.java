package contacts;

import java.util.*;

public class ContactManager {

    // 1) Instance Variables
    private List<Contact> contactList;

    // 2) Class Constructor
    public ContactManager(){
        this.contactList = new ArrayList<Contact>();
    }


    // 3) Implementing Concrete Methods

    public void add(Person person, ContactInfo contactInfo){
        Contact newContact = new Contact(person,contactInfo);
        this.contactList.add(newContact);
    }

    public List<ContactInfo> contactDetails(Person person){
        List<ContactInfo> outputList = new ArrayList<ContactInfo>();
        for (Contact eachContact : contactList) {
            Person selectedPerson = eachContact.person;
            ContactInfo selectedContactInfo = eachContact.contactInfo;
            if(selectedPerson.equals(person)){
                outputList.add(selectedContactInfo);
            }
        }
        return outputList;
    }

    public void spam(String msg){
        for (Contact eachContact : contactList) {
            ContactInfo selectedContactInfo = eachContact.contactInfo;
            selectedContactInfo.sendMessage(msg);
        }
    }
}
