/* -------------------------------------------------------------------------+
| Institution:    Imperial College London                                   |
| Programme:      MSc in Computing Science                                  |
| Course:         70055 - Software Engineering Design                       |
|                                                                           |
| Assignment:     Coursework 2 - Contact Manager                            |
| File Name:      ContactManager.java                                       |
| Authors:        Samuel Valdes Gutierrez  (sv1220)                         |
|                 Pongsakorn Siripornpitak  (ps2520)                        |
| Last Version:   25th January 2020                                         |
| Description:    Class ContactManager for modelling a contact manager      |
|                 agenda.                                                   |
----------------------------------------------------------------------------+*/

package contacts;

import java.util.List;
import java.util.ArrayList;

public class ContactManager {

  // 1) Instance Variables
  private List<Contact> contactList;

  // 2) Class Constructor
  public ContactManager() {
    this.contactList = new ArrayList<>();
  }

  // 3) Implementing Concrete Methods

  public void add(Person person, ContactInfo contactInfo) {
    Contact newContact = new Contact(person, contactInfo);
    this.contactList.add(newContact);
  }

  public List<ContactInfo> contactDetails(Person person) {
    List<ContactInfo> outputList = new ArrayList<>();
    for (Contact eachContact : contactList) {
      Person selectedPerson = eachContact.person;
      ContactInfo selectedContactInfo = eachContact.contactInfo;
      if (selectedPerson.equals(person)) {
        outputList.add(selectedContactInfo);
      }
    }
    return outputList;
  }

  public void spam(String msg) {
    for (Contact eachContact : contactList) {
      ContactInfo selectedContactInfo = eachContact.contactInfo;
      selectedContactInfo.sendMessage(msg);
    }
  }
}
