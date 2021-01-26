/* -------------------------------------------------------------------------+
| Institution:    Imperial College London                                   |
| Programme:      MSc in Computing Science                                  |
| Course:         70055 - Software Engineering Design                       |
|                                                                           |
| Assignment:     Coursework 2 - Contact Manager                            |
| File Name:      Phone.java                                                |
| Authors:        Samuel Valdes Gutierrez  (sv1220)                         |
|                 Pongsakorn Siripornpitak  (ps2520)                        |
| Last Version:   25th January 2020                                         |
| Description:    Class Phone for modelling a phone  (inherit ContactInfo   |
|                 class and implements AudioMessageEnabled interface)       |
----------------------------------------------------------------------------+*/

package contacts;

public class Phone extends ContactInfo implements AudioMessageEnabled {

  // 1) Instance Variables
  protected String phone;

  // 2) Class Constructor
  public Phone(String phone) {
    this.phone = phone;
  }

  // 3) Instance Methods

  // 3.1) Implementing Abstract Methods
  @Override
  public String contactInfo() {
    return this.phone;
  }

  @Override
  public String contactInfoType() {
    return "phone";
  }

  @Override
  public void sendMessage(String msg) {
    this.sendAudioMessage(new Audio(msg));
  }

  // 3.2) Implementing Interface Methods
  @Override
  public void sendAudioMessage(Audio msg) {
    System.out.println("Message from " + this.phone + ": " + msg.toString());
  }
}
