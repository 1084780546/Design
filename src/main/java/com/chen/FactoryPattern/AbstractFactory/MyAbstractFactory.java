package com.chen.FactoryPattern.AbstractFactory;

public class MyAbstractFactory {
	
	/**
	 * 抽象工厂：
	 * 抽象工厂模式是工厂方法模式的升级版本，他用来创建一组相关或者相互依赖的对象。比如宝马320系列使用空调型号A和发动机型号A，
	 * 而宝马230系列使用空调型号B和发动机型号B，那么使用抽象工厂模式，在为320系列生产相关配件时，就无需制定配件的型号，它会自动
	 * 根据车型生产对应的配件型号A。
	 */
	
	 public static void main(String[] args){    
	        //生产宝马320系列配件  
	        FactoryBMW320 factoryBMW320 = new FactoryBMW320();    
	        factoryBMW320.createEngine();  
	        factoryBMW320.createAircondition();  
	            
	        //生产宝马523系列配件    
	        FactoryBMW523 factoryBMW523 = new FactoryBMW523();    
	        factoryBMW523.createEngine();  
	        factoryBMW523.createAircondition();  
	    }    

}
