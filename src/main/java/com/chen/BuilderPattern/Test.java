package com.chen.BuilderPattern;

//测试
public class Test{  
	
	/**
	 * 建造者模式：
	 * 将一个复杂的对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
	 * 
	 * 实用范围:
	 * 1、当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时。
	 * 2、当构造过程必须允许被构造的对象有不同表示时。
	 * 
	 * 在这样的设计模式中，有以下几个角色：
	 * 1、Builder(生成器)：为创建一个产品对象的各个部件指定抽象接口。
	 * 2、ConcreteBuilder(具体生成器)：实现Builder的接口以构造和装配该产品的各个部件，定义并明确它所创建的表示，并提供一个检索产品的接口。
	 * 3、Director(指挥器,导引器)：构造一个使用Builder接口的对象，指导构建过程。
	 * 4、Product(产品)：表示被构造的复杂对象。ConcreteBuilder创建该产品的内部表示并定义它的装配过程，包含定义组成部件的类，包括将这些部件装配成最终产品的接口。
	 * 
	 * PersonBuilder接口定义建造类目,ManBuilder和WomanBuilder实现PersonBuilder
	 * 新建PersonDirector引导Person创建过程,再将ManBuilder和WomanBuilder放入PersonDirector的constructPerson方法去具体实现Person的创建
	 * 将建造类的过程独立出来,不放于类中
	 */
	
    @SuppressWarnings("unused")
	public static void main(String[] args) {  
          PersonDirector pd = new PersonDirector();  
          Person manPerson = pd.constructPerson(new ManBuilder());  
          Woman womanPerson = (Woman) pd.constructPerson(new WomanBuilder());  
     }  
     
}  