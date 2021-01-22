/* -------------------------------------------------------------------------+
| Institution:    Imperial College London                                   |
| Programme:      MSc in Computing Science                                  |
| Course:         70055 - Software Engineering Design                       |
|                                                                           |
| Assignment:     Coursework 1 - Contact Manager                            |
| File Name:      PictureProcessor.java                                     |
| Authors:        Samuel Valdes Gutierrez  (sv1220)                         |
|                 Pongsakorn Siripornpitak  (ps2520)                        |
| Last Version:   16th November 2020                                        |
| Description:    Abstract Class for contact Info that implements three     |
|                 abstract methods                                          |
----------------------------------------------------------------------------+*/


package contacts;

public abstract class ContactInfo{

    protected String info;
    protected String type;

    abstract String contactInfo();
    abstract String contactInfoType();
    abstract void sendMessage(String msg);


}
