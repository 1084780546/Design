package com.chen.FactoryPattern.AbstractFactory;

import com.chen.FactoryPattern.AbstractFactory.AirconditionType.Aircondition;
import com.chen.FactoryPattern.AbstractFactory.EngineType.Engine;

//创建工厂的接口    
public interface AbstractFactory {    
    //制造发动机  
    public Engine createEngine();  
    //制造空调   
    public Aircondition createAircondition();   
}    