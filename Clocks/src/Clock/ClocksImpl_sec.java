/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clock;


    abstract public class ClocksImpl_sec extends ClocksImpl {
    private int secon=0;

    
  @Override
  public void init() {
    super.init();
    secon = 0;
  }
   @Override
    abstract public int getPrice();
    @Override
    abstract public String getBrand();
  
    @Override
    public void changeS(int sec) throws ClockExp{
         if(sec<0 || sec>60)
            throw new ClockExp(3);
         secon=sec;
               
    }

    @Override
    public String toString(){
        return super.toString()+":"+secon; 
    }
}