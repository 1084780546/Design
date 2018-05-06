package com.chen.FactoryPattern.factoryMethod;

import com.chen.FactoryPattern.model.BMW523;

public class FactoryBMW523 implements FactoryBMW {  
	
    @Override  
    public BMW523 createBMW() {  
  
        return new BMW523();  
    }  
    
}  