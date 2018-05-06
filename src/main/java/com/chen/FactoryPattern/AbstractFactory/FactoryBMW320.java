package com.chen.FactoryPattern.AbstractFactory;

import com.chen.FactoryPattern.AirconditionType.Aircondition;
import com.chen.FactoryPattern.AirconditionType.AirconditionA;
import com.chen.FactoryPattern.EngineType.Engine;
import com.chen.FactoryPattern.EngineType.EngineA;

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