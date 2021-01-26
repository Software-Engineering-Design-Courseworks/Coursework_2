/* -------------------------------------------------------------------------+
| Institution:    Imperial College London                                   |
| Programme:      MSc in Computing Science                                  |
| Course:         70055 - Software Engineering Design                       |
|                                                                           |
| Assignment:     Coursework 2 - Contact Manager                            |
| File Name:      AudioMessageEnabled.java                                  |
| Authors:        Samuel Valdes Gutierrez  (sv1220)                         |
|                 Pongsakorn Siripornpitak  (ps2520)                        |
| Last Version:   25th January 2020                                         |
| Description:    Interface AudioMessageEnabled with signature method       |
|                 sendAudioMessage(String msg)                              |
----------------------------------------------------------------------------+*/

package contacts;

public interface AudioMessageEnabled {

  void sendAudioMessage(Audio msg);
}
