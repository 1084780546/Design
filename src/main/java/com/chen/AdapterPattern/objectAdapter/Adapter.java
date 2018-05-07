package com.chen.AdapterPattern.objectAdapter;

import com.chen.AdapterPattern.model.Adaptee;
import com.chen.AdapterPattern.model.Target;

//对象适配器
class Adapter implements Target{  
    // 直接关联被适配类  
    private Adaptee adaptee;  
      
    // 可以通过构造函数传入具体需要适配的被适配类对象  
    public Adapter (Adaptee adaptee) {  
        this.adaptee = adaptee;  
    }  
      
    public void request() {  
        // 这里是使用委托的方式完成特殊功能  
        this.adaptee.specificRequest();  
    }

	@Override
	public void say(String word) {
		System.out.println("Hello");
		
	}  
}  