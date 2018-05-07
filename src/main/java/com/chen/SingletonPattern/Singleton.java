package com.chen.SingletonPattern;

//懒汉式单例类.在第一次调用的时候实例化自己   
public class Singleton {  
	
	/**
	 * 1、单例类只能有一个实例。
	 * 2、单例类必须自己创建自己的唯一实例。
	 * 3、单例类必须给所有其他对象提供这一实例。
	 * 
	 * 懒汉式单例：
	 * Singleton通过将构造方法限定为private避免了类在外部被实例化，在同一个虚拟机范围内，Singleton的唯一实例只能通过getInstance()方法访问。
	 * 
	 */
	
    private Singleton() {}  
    
    private static Singleton single = null;  
    
    //静态工厂方法   
    public static Singleton getInstance() {  
         if (single == null) {    
             single = new Singleton();  
         }    
        return single;  
    }  
    
    /**
     * 但是以上懒汉式单例的实现没有考虑线程安全问题，它是线程不安全的，并发环境下很可能出现多个Singleton实例，
	 * 要实现线程安全，有以下三种方式，都是对getInstance这个方法改造，保证了懒汉式单例的线程安全
	 */
    
    //1、在getInstance方法上加同步
    public static synchronized Singleton getInstance1() {  
        if (single == null) {    
            single = new Singleton();  
        }    
       return single;  
    }  
    
    //2、双重检查锁定
    public static Singleton getInstance2() {  
        if (single == null) {    
            synchronized (Singleton.class) {    
               if (single == null) {    
            	   single = new Singleton();   
               }    
            }    
        }    
        return single;   
    }  
    
    //3、静态内部类	这种比上面1、2都好一些，既实现了线程安全，又避免了同步带来的性能影响。
    private static class LazyHolder {    
        private static final Singleton INSTANCE = new Singleton();    
    }      
    public static final Singleton getInstance3() {    
        return LazyHolder.INSTANCE;    
    }    

}  