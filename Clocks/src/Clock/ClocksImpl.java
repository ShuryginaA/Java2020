/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clock;


   public abstract class ClocksImpl implements Clocks {
   private int hour;
   private int minut;
   
   
   @Override
    public String toString(){
        if(minut<10)
           return hour +":"+'0'+minut; 
        else 
           return hour +":"+minut; 
            
 } 
   @Override
    abstract public int getPrice();
   @Override
    abstract public String getBrand(); 

    @Override
    public void init() {
        hour=0;
        minut=0;
             
    }
    @Override
    public void changeH(int h) throws Exception {
        if(h<0)
            throw new ClockExp(1);
        hour=h;
        
    }

    @Override
    public void changeM(int min) throws Exception{
        minut=min;  
        }
   @Override
    public void changeS(int s) throws ClockExp{throw new ClockExp(10);};

        
    }


   

