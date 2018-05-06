	package com.chen.FactoryPattern.factoryMethod;

import com.chen.FactoryPattern.model.BMW123;

public class FactoryBMW123 implements FactoryBMW{  
  
    @Override  
    public BMW123 createBMW() {  
  
        return new BMW123();  
    }  
  
}  