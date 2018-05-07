package com.chen.SingletonPattern;

//饿汉式单例类.在类初始化时，已经自行实例化   
public class Singleton2 {  
	
	/**
	 * 1、单例类只能有一个实例。
	 * 2、单例类必须自己创建自己的唯一实例。
	 * 3、单例类必须给所有其他对象提供这一实例。
	 * 
	 * 饿汉式单例：
	 * 饿汉式在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的。
	 * 
	 */
	
    private Singleton2() {}  
    
    private static final Singleton2 single = new Singleton2();  
    //静态工厂方法   
    public static Singleton2 getInstance() {  
        return single;  
    }  

}  