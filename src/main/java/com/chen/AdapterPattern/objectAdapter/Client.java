package com.chen.AdapterPattern.objectAdapter;

import com.chen.AdapterPattern.model.Adaptee;
import com.chen.AdapterPattern.model.ConcreteTarget;
import com.chen.AdapterPattern.model.Target;

// 测试类  
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
	 *  它不是使用多继承或继承再实现的方式，而是使用直接关联，或者称为委托的方式
	 *  以被适配对象为参数直接与适配对象关联
	 */
	
	//对象适配器 测试
    public static void main(String[] args) {  
        // 使用普通功能类  
        Target concreteTarget = new ConcreteTarget();  
        concreteTarget.request();  
          
        // 使用特殊功能类，即适配类，  
        // 需要先创建一个被适配类的对象作为参数  
        Target adapter = new Adapter(new Adaptee());  
        adapter.request();  
        
        concreteTarget.say("你好");
        adapter.say("你好");
    }  
    
}  