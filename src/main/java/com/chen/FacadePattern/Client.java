package com.chen.FacadePattern;

//测试类
public class Client {  
	
	/**
	 * @Title: main 
	 * @param args
	 * @return: void
	 * 
	 * 外观模式(门面模式)：
	 * 	门面模式的结构图过于抽象，因此把它稍稍具体点。假设子系统内有三个模块，分别是ModuleA、ModuleB和ModuleC，它们分别有一个示例方法，还有一个汇总的模块Facade
	 * 
	 * 		门面(Facade)角色 ：客户端可以调用这个角色的方法。此角色知晓相关的（一个或者多个）子系统的功能和责任。
	 * 	在正常情况下，本角色会将所有从客户端发来的请求委派到相应的子系统去。
	 * 
	 * 		子系统(SubSystem)角色 ：可以同时有一个或者多个子系统。每个子系统都不是一个单独的类，
	 * 	而是一个类的集合（如上面的子系统就是由ModuleA、ModuleB、ModuleC三个类组合而成）。每个子系统都可以被客户端直接调用，或者被门面角色调用。
	 * 	子系统并不知道门面的存在，对于子系统而言，门面仅仅是另外一个客户端而已。
	 */
  
    public static void main(String[] args) {  
          
        Facade facade = new Facade();  
        facade.test();  
    }  
  
}  