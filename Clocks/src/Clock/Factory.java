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
public class Factory {
    
    static public Clocks build(String br) throws Exception   {
        if("ClockHM".equals(br))
        return new ClockHM();
        if("ClockHMS".equals(br))
            return new ClocksHMS();
        throw new ClockExp(-100);
        
        
    }
    
}
