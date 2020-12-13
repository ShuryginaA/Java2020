/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clock;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Evgeny Kozinov <evgeny.kozinov@itmm.unn.ru>
 */
public class Test {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws Exception {
    Clocks timeA = null,timeA1 = null, timeB = null, timeC = null;
    
    try {
      timeA = Factory.build("ClockHM");
      System.out.println(timeA);
    } catch (ClockExp ex) {
      System.out.println(ex);
    }
     try {
      timeA1 = Factory.build("ClockHM");
      System.out.println(timeA1);
    } catch (ClockExp ex) {
      System.out.println(ex);
    }
    
    try {
      timeB = Factory.build("ClockHMS");  
      timeB.changeH(11);
      timeB.changeS(30);
      System.out.println(timeB);
    } catch (ClockExp ex) {
      System.out.println(ex);
    }

    try {
      timeC = Factory.build("C");
      System.out.println(timeC);
    } catch (ClockExp ex) {
      System.out.println(ex);
    }
    try {
      timeA.changeH(10);
      timeA.changeM(33);  
      System.out.println(timeA);
    } catch (ClockExp ex) {
      System.out.println("w нет секундной стрелки");
    }
    
    try{
        Store s=new Store();
        s.addClock(timeA);
        s.addClock(timeA1);       
        s.addClock(timeB);
        s.setHour(17);
        s.printBran();
//        System.out.println(s.MCommBrand());
       
    } catch(ClockExp ex){
    
        System.out.println("Incorrect");
    }
    
  }
  
}
