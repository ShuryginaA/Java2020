/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Анна
 */
public class Store {
    Iterator<Clocks> i; 
    ArrayList<Clocks> store = new ArrayList<>();

 
    public void addClock(Clocks cl){
        store.add(cl);
         }
    public void getTopPr() throws Exception{
        if(store.isEmpty())
          throw new ClockExp(5);
        Comparator<Clocks> comp;
        comp = new Comparator<Clocks>() {
            @Override
            public int compare( Clocks o1, Clocks o2) {
                 if(o1.getPrice()>o2.getPrice())
                     return 1;
                 else return 0;
            } 
        };
        Collections.max(store,comp).toString();
 
    }
    
    public int retQuan(){return store.size();}
    public ArrayList<Clocks> getAll(){return store; }
        
    public void setHour(int h)throws Exception{   
         if(h<0)
            throw new ClockExp(1);    
        i=store.iterator();
        while(i.hasNext()){
            i.next().changeH(h);   }
//           for(Clocks cl:store)
//               cl.changeH(h);
    }
    public void setM(int m)throws Exception{   
        if(m<0)
            throw new ClockExp(2);
        i=store.iterator();
        while(i.hasNext())
            i.next().changeM(m);       
    }
    
     public void setS(int s)throws Exception{
          if(s<0)
            throw new ClockExp(2);
          for(Clocks cl: store){
              if("HMS-Clocks".equals(cl.getBrand())){
                  cl.changeS(s);
                  }}
//        i=store.iterator();
//        while(i.hasNext()){
//            if("ClockHMS".equals(i.next().getBrand()))
//            i.next().changeS(s);    }
         
     }

     
      public String MCommBrand() throws ClockExp{
        
        HashMap<String,Integer> map= new HashMap<>();     
        for(Clocks c:store){
            if(map.containsKey(c.getBrand()))
                map.put(c.getBrand(), map.get(c.getBrand()+1));
            else map.put(c.getBrand(),1);
            }         
        int max=0;
        for(Integer m: map.values()){
            if (m>max)
                max=m;            
        }
        System.out.print(max);
        for(String s: map.keySet())
            if(map.get(s)==max)
                return s;       
        return "No most common brand"; 
      }
     
     public void printBran(){
         TreeSet<String> br=new TreeSet<>();            
         for(Clocks c: store)
         {
              String e=c.getBrand();
              br.add(e);       
         }          
         for(String s:br){
             System.out.print(s);
             System.out.println();
         }
     }
     
     
        
        
                
            
        
        
       
        
        
    
    }
    
    
    

