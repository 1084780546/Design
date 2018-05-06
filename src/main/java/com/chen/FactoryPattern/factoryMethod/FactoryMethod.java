package com.chen.FactoryPattern.factoryMethod;

import com.chen.FactoryPattern.model.BMW320;
import com.chen.FactoryPattern.model.BMW523;

public class FactoryMethod {
	
	/**
	 * 工厂模式：
	 * 工厂方法模式去掉了简单工厂模式中工厂方法的静态属性，使得它可以被子类继承。
	 * 这样在简单工厂模式里集中在工厂方法上的压力可以由工厂方法模式里不同的工厂子类来分担。 
	 * 
	 * 简单工厂每没添加一个新产品,都要在其工厂类中添加新内容,而工厂模式则是有一个固定的主工厂,新添加产品时,
	 * 新建子工厂并继承主工厂,这样就不用每次都去修改主工厂
	 */
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {  
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();  
        BMW320 bmw320 = factoryBMW320.createBMW();  
  
        FactoryBMW523 factoryBMW523 = new FactoryBMW523();  
        BMW523 bmw523 = factoryBMW523.createBMW();  
        
        FactoryBMW123 factoryBMW123 = new FactoryBMW123();  
        BMW523 bmw123 = factoryBMW523.createBMW();  
    }  

}
