package com.chen.FactoryPattern.simpleFactory;

import com.chen.FactoryPattern.CarType.BMW;

public class SimpleFactory {
	
	/**
	 * 简单工厂模式 
	 * 建立一个工厂（一个函数或一个类方法）来制造新的对象。
	 * 
	 * 客户调用工厂并给出车型的参数,工厂根据车型的参数制造汽车
	 */
	
	/*客户方法：*/
	@SuppressWarnings("unused")//此注解是为了不报黄线,没有其他用途
	public static void main(String[] args) {  
        Factory factory = new Factory();  
        BMW bmw320 = factory.createBMW(320);  
        BMW bmw523 = factory.createBMW(523);  
        BMW bmw123 = factory.createBMW(123); 
    }  

}
