package com.chen.BuilderPattern;

//角色Builder：
public interface PersonBuilder {  
	
     void buildHead();  
     void buildBody();  
     void buildFoot();  
     Person buildPerson();  
     
}  