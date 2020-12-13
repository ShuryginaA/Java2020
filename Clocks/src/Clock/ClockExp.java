/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clock;

/**
 *
 * @author Анна
 */
public class ClockExp extends Exception {
    int code;
  public ClockExp(int code){
    this.code = code;
  }
  
   @Override
  public String toString() {
    return "Timer error ("+code+")";
  } 
    
}
