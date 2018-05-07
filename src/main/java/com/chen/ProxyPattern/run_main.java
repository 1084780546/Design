package com.chen.ProxyPattern;

//测试类
public class run_main {  
	
	/**
	 * @Title: main 
	 * @Description: 
	 * @param args
	 * @return: void
	 * 
	 * 代理模式：
	 * 对一些对象提供代理，以限制那些对象去访问其它对象。
	 * 当一个对象需要被使用，但是其又不想被直接访问或者无法提供直接访问权限时，即可通过一个代理提供间接访问。
	 * 
	 * 静态代理:由程序员创建或工具生成代理类的源码，再编译代理类。所谓静态也就是在程序运行前就已经存在代理类的字节码文件，代理类和委托类的关系在运行前就确定了。
	 * 
	 * 动态代理:动态代理类的源码是在程序运行期间由JVM根据反射等机制动态的生成，所以不存在代理类的字节码文件。代理类和委托类的关系是在程序运行时确定。
	 * 
	 * “极品飞车”这款游戏，如果游戏者手中的金钱达到了一定的数量就可以到车店买一部性能更高的赛车，那么这个卖车的“车店”就是一个典型的“汽车厂家”的“代理”,
	 * 他为汽车厂家“提供卖车的服务”给有需求的人士。从面向对象的方面考虑，“销售汽车的代理”也是一个对象，那么这个对象也具有一定的状态，
	 * 在软件项目中这个对象也具有管理财务进销存的基本功能，那么在设计时就要以面向OOP编程的思想来考虑软件的类结构，这个销售汽车的代理也是一个类了。
	 */
  
	public static void main(String[] args) {  
	      people people_1 =new people();  
	      people_1.setCash(60000);  
	      people_1.setUsername("jeck");  
	  
	  
	      people people_2 =new people();  
	      people_2.setCash(40000);  
	      people_2.setUsername("rose");  
	       
	      people people_3 =new people();
	      people_3.setCash(0);  
	      people_3.setUsername("tom");  
	      people_3.setVip("vip");  
	       
	      proxyclass proxy_buy = new proxyclass();  
	      proxy_buy.setPeople(people_1);  
	      proxy_buy.buy_mycar();  
	       
	      proxy_buy.setPeople(people_2);  
	      proxy_buy.buy_mycar();  
	       
	      proxy_buy.setPeople(people_3);  
	      proxy_buy.buy_mycar();  
	             
	}  
  
}  