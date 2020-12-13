/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clock;

/**
 *
 * @author shurygina.a
 */
public interface Clocks { 
    public int getPrice();
    public String getBrand();    
    public void init();
    public void changeH(int h) throws Exception;
    public void changeM(int min) throws Exception;
    public void changeS(int sec) throws ClockExp;
   
//    public void SetM(int _m);
//    public void SetH(int _h);
//    public void SetS(int _s);
//   
}