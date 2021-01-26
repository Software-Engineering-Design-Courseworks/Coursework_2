/* -------------------------------------------------------------------------+
| Institution:    Imperial College London                                   |
| Programme:      MSc in Computing Science                                  |
| Course:         70055 - Software Engineering Design                       |
|                                                                           |
| Assignment:     Coursework 2 - Contact Manager                            |
| File Name:      Email.java                                                |
| Authors:        Samuel Valdes Gutierrez  (sv1220)                         |
|                 Pongsakorn Siripornpitak  (ps2520)                        |
| Last Version:   25th January 2020                                         |
| Description:    Class Email for modelling an email (inherit ContactInfo   |
|                 class and implements TextMessageEnabled interface)        |
----------------------------------------------------------------------------+*/

package contacts;

public class Email extends ContactInfo implements TextMessageEnabled {

  // 1) Instance Variables
  protected String email;

  // 2) Class Constructor
  public Email(String email) {
    this.email = email;
  }

  // 3) Instance Methods

  // 3.1) Implementing Abstract Methods
  @Override
  public String contactInfo() {
    return this.email;
  }

  @Override
  public String contactInfoType() {
    return "e-mail";
  }

  @Override
  public void sendMessage(String msg) {
    this.sendTextMessage(msg);
  }

  // 3.2) Implementing Interface Methods
  @Override
  public void sendTextMessage(String msg) {
    System.out.println("Message from " + this.email + ": " + msg);
  }
}
