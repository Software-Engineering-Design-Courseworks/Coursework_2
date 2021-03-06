/* -------------------------------------------------------------------------+
| Institution:    Imperial College London                                   |
| Programme:      MSc in Computing Science                                  |
| Course:         70055 - Software Engineering Design                       |
|                                                                           |
| Assignment:     Coursework 2 - Contact Manager                            |
| File Name:      ContactInfo.java                                          |
| Authors:        Samuel Valdes Gutierrez  (sv1220)                         |
|                 Pongsakorn Siripornpitak  (ps2520)                        |
| Last Version:   25th January 2020                                         |
| Description:    Abstract Class for contact Info that implements three     |
|                 abstract methods                                          |
----------------------------------------------------------------------------+*/

package contacts;

public abstract class ContactInfo {

  abstract String contactInfo();

  abstract String contactInfoType();

  abstract void sendMessage(String msg);
}
