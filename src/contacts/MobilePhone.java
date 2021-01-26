/* -------------------------------------------------------------------------+
| Institution:    Imperial College London                                   |
| Programme:      MSc in Computing Science                                  |
| Course:         70055 - Software Engineering Design                       |
|                                                                           |
| Assignment:     Coursework 2 - Contact Manager                            |
| File Name:      MobilePhone.java                                          |
| Authors:        Samuel Valdes Gutierrez  (sv1220)                         |
|                 Pongsakorn Siripornpitak  (ps2520)                        |
| Last Version:   25th January 2020                                         |
| Description:    Class MobilePhone for modelling a mobile phone (inherit   |
|                 Phone class and implements TextMessageEnabled and         |
|                 AudioMessageEnabled interfaces)                           |
----------------------------------------------------------------------------+*/

package contacts;

public class MobilePhone extends Phone implements TextMessageEnabled, AudioMessageEnabled {

  // 1) Class Constructor
  public MobilePhone(String phone) {
    super(phone);
  }

  // 2) Instance Methods

  // 2.1) Overriding Parent Methods
  @Override
  public void sendMessage(String msg) {
    this.sendTextMessage(msg);
  }
  // 2.2) Implementing Interface Methods

  /* ----------------------------- Notes ---------------------------------
  - Method in TextMessageEnable Interface (sendTextEnabled) from parent
  class is overrided
  - Method in AudioMessageEnable (sendTextEnabled) from parent
  class is inherited
  -----------------------------------------------------------------------*/
  @Override
  public void sendTextMessage(String msg) {
    System.out.println("Message from " + this.phone + ": " + msg);
  }
}
