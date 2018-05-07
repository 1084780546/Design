package com.chen.AdapterPattern.classAdapter;

import com.chen.AdapterPattern.model.Adaptee;
import com.chen.AdapterPattern.model.Target;

// 适配器类，继承了被适配类，同时实现标准接口  
public class Adapter extends Adaptee implements Target{  
	
    public void request() {  
        super.specificRequest();  
    }

	@Override
	public void say(String word) {
		super.sayHello();
		
	}
    
}  