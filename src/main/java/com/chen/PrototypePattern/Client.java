package com.chen.PrototypePattern;

public class Client {    
	
	/**
	 * @Title: main 
	 * @Description: TODO
	 * @param args
	 * @return: void
	 * 
	 * 原型模式：
	 * 实现一个接口，重写一个方法即完成了原型模式。在实际应用中，原型模式很少单独出现。
	 * 经常与其他模式混用，他的原型类Prototype也常用抽象类来替代。
	 * 
	 * 原型模式主要用于对象的复制，它的核心是就是类图中的原型类Prototype。Prototype类需要具备以下两个条件：
	 * 		1.实现Cloneable接口。在java语言有一个Cloneable接口，它的作用只有一个，就是在运行时通知虚拟机可以安全地在实现了此接口的类上使用clone方法。
	 * 	在java虚拟机中，只有实现了这个接口的类才可以被拷贝，否则在运行时会抛出CloneNotSupportedException异常。
	 * 		2.重写Object类中的clone方法。Java中，所有类的父类都是Object类，Object类中有一个clone方法，
	 * 	作用是返回对象的一个拷贝，但是其作用域protected类型的，一般的类无法调用，因此，Prototype类需要将clone方法的作用域修改为public类型。
	 * 
	 * 原型类类似于提供一个模板,供其使用
	 */
	
    public static void main(String[] args){    
        ConcretePrototype cp = new ConcretePrototype();    
        for(int i=0; i< 10; i++){    
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();    
            clonecp.show();    
        }    
    }   
    
}    