	package com.chen.FactoryPattern.factoryMethod;

import com.chen.FactoryPattern.model.BMW320;

public class FactoryBMW320 implements FactoryBMW{  
  
    @Override  
    public BMW320 createBMW() {  
  
        return new BMW320();  
    }  
  
}  