package com.chen.FactoryPattern.AbstractFactory;

import com.chen.FactoryPattern.AbstractFactory.AirconditionType.Aircondition;
import com.chen.FactoryPattern.AbstractFactory.AirconditionType.AirconditionA;
import com.chen.FactoryPattern.AbstractFactory.EngineType.Engine;
import com.chen.FactoryPattern.AbstractFactory.EngineType.EngineA;

//为宝马320系列生产配件    
public class FactoryBMW320 implements AbstractFactory{    
        
    @Override    
    public Engine createEngine() {      
        return new EngineA();    
    }    
    @Override    
    public Aircondition createAircondition() {    
        return new AirconditionA();    
    }
    
}    