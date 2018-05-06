package com.chen.FactoryPattern.AbstractFactory;

import com.chen.FactoryPattern.AbstractFactory.AirconditionType.Aircondition;
import com.chen.FactoryPattern.AbstractFactory.AirconditionType.AirconditionB;
import com.chen.FactoryPattern.AbstractFactory.EngineType.Engine;
import com.chen.FactoryPattern.AbstractFactory.EngineType.EngineB;

//宝马523系列  
public class FactoryBMW523 implements AbstractFactory {    
    
     @Override    
    public Engine createEngine() {      
        return new EngineB();    
    }    
    @Override    
    public Aircondition createAircondition() {    
        return new AirconditionB();    
    }    
  
}   