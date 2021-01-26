/* -------------------------------------------------------------------------+
| Institution:    Imperial College London                                   |
| Programme:      MSc in Computing Science                                  |
| Course:         70055 - Software Engineering Design                       |
|                                                                           |
| Assignment:     Coursework 2 - Contact Manager                            |
| File Name:      Contact.java                                              |
| Authors:        Samuel Valdes Gutierrez  (sv1220)                         |
|                 Pongsakorn Siripornpitak  (ps2520)                        |
| Last Version:   25th January 2020                                         |
| Description:    Class for Contact object having as instance variables a   |
|                 Person and a ContactInfo object                           |
----------------------------------------------------------------------------+*/

package contacts;

public class Contact {

  // 1) Instance Variables
  protected Person person;
  protected ContactInfo contactInfo;

  // 2) Class Constructor
  public Contact(Person person, ContactInfo contactInfo) {
    this.person = person;
    this.contactInfo = contactInfo;
  }
}
