package com.chen.FactoryPattern.simpleFactory;

import com.chen.FactoryPattern.CarType.BMW;
import com.chen.FactoryPattern.model.BMW320;
import com.chen.FactoryPattern.model.BMW523;

/*工厂类：*/
public class Factory {  
	
    public BMW createBMW(int type) {  
        switch (type) {  
          
        case 320:  
            return new BMW320();  
  
        case 523:  
            return new BMW523();  
  
        default:  
            break;  
        }  
        return null;  
    }  
    
}  