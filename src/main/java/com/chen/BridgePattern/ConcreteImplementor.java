package com.chen.BridgePattern;

public class ConcreteImplementor implements Implementor  
{  
    public void operationImpl()  //operation操作，运算
    {  
        System.out.println("ConcreteImplementor执行运算");
    }

	@Override
	public void test() {
		System.out.println("ConcreteImplementor测试");
		
	}  
}  