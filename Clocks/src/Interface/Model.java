/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Clock.Clocks;
import Clock.Factory;
import Clock.Store;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Анна
 */
public class Model implements Observers{
    ArrayList<Observers> arr_observer = new ArrayList<>();
    Store store = new Store();
    @Override
  public void refresh(){
   for(Observers iObserver: arr_observer)
       iObserver.refresh();
       
  }
  public void addOb(Observers o)
  {
      arr_observer.add(o);
      
  }
    
    public void addWatch(String s){
        try {
               
                Clocks cl= Factory.build(s); 
                store.addClock(cl);
                 } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Ex");
               
            }
    
    }
    public void SetTime(int h,int m, int s) throws Exception{
    store.setHour(h);
    store.setM(m);
    store.setS(s);

//    System.out.println();
    
     for(Clocks c:store.getAll()){
             System.out.print(c);
         }
//    store.setS(s);

    }
   public  ArrayList<Clocks> getAllM(){return store.getAll(); }
    

    
    
}
