package com.chen.AdapterPattern.classAdapter;

import com.chen.AdapterPattern.model.ConcreteTarget;
import com.chen.AdapterPattern.model.Target;

public class Client {
	
	/**
	 * @Title: main 
	 * @Description: TODO
	 * @param args
	 * @return: void
	 * 
	 * 适配器模式：
	 * 将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以在一起工作。
	 * 
	 *  模式中的角色
	 *  	1.目标接口（Target）：客户所期待的接口。目标可以是具体的或抽象的类，也可以是接口。
	 *  	2.需要适配的类（Adaptee）：需要适配的类或适配者类。
	 *  	3.适配器（Adapter）：通过包装一个需要适配的对象，把原接口转换成目标接口。
	 *  
	 *  Adapter 类既继承了 Adaptee （被适配类），也实现了 Target 接口（因为 Java 不支持多继承，所以这样来实现）
	 */
	
	// 类的适配器模式 测试
    public static void main(String[] args) {  
        // 使用普通功能类  
        Target concreteTarget = new ConcreteTarget();  
        concreteTarget.request();  
          
        // 使用特殊功能类，即适配类  
        Target adapter = new Adapter();  
        adapter.request();  
        
        concreteTarget.say("你好");
        adapter.say("您好");
        
    }  
}

