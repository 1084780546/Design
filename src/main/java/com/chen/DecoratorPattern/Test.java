package com.chen.DecoratorPattern;

//测试类，看一下你就会发现，跟java的I/O操作有多么相似  
public class Test {  
	
	/**
	 * 装饰器模式:
	 *  装饰模式能够实现动态的为对象添加功能，是从一个对象外部来给对象添加功能。
	 *  通常给对象添加功能，要么直接修改对象添加相应的功能，要么派生对应的子类来扩展，抑或是使用对象组合的方式。
	 *  显然，直接修改对应的类这种方式并不可取。在面向对象的设计中，而我们也应该尽量使用对象组合，而不是对象继承来扩展和复用功能。
	 *  装饰器模式就是基于对象组合的方式，可以很灵活的给对象添加所需要的功能。装饰器模式的本质就是动态组合。动态是手段，组合才是目的。
	 *  总之，装饰模式是通过把复杂的功能简单化，分散化，然后再运行期间，根据需要来动态组合的这样一个模式。
	 *  
	 *  
	 *  动态给一个对象添加一些额外的职责,就象在墙上刷油漆.使用Decorator模式相比用生成子类方式达到功能的扩充显得更为灵活。
	 *  
	 *  设计初衷:通常可以使用继承来实现功能的拓展,如果这些需要拓展的功能的种类很繁多,那么势必生成很多子类,
	 *  增加系统的复杂性,同时,使用继承实现功能拓展,我们必须可预见这些拓展功能,这些功能是编译时就确定了,是静态的。
	 *  
	 *  (重要因素)在以下两种情况下可以考虑使用装饰器模式：
	 *  	(1)需要在不影响其他对象的情况下，以动态、透明的方式给对象添加职责。
	 *  	(2)如果不适合使用子类来进行扩展的时候，可以考虑使用装饰器模式。
	 */
	
    public static void main(String[] args) {  
        Human person = new Person();  
        Decorator decorator = new Decorator_two(new Decorator_first(  
                new Decorator_zero(person)));  
        decorator.wearClothes();  
        decorator.walkToWhere();  
    }  
    
    /**
     * 关键点：
     * 	1.Decorator抽象类中，持有Human接口，方法全部委托给该接口调用，目的是交给该接口的实现类即子类进行调用。
     * 	2.Decorator抽象类的子类（具体装饰者），里面都有一个构造方法调用super(human),这一句就体现了抽象类依赖于子类实现即抽象依赖于实现的原则。
     * 		因为构造里面参数都是Human接口，只要是该Human的实现类都可以传递进去，即
     * 		表现出Decorator dt = new Decorator_second(new Decorator_first(new Decorator_zero(human)));这种结构的样子。
     * 		所以当调用dt.wearClothes();dt.walkToWhere()的时候，又因为每个具体装饰者类中，都先调用super.wearClothes和super.walkToWhere()方法，
     * 		而该super已经由构造传递并指向了具体的某一个装饰者类（这个可以根据需要调换顺序），那么调用的即为装饰类的方法，然后才调用自身的装饰方法，
     * 		即表现出一种装饰、链式的类似于过滤的行为。
     * 	3.具体被装饰者类，可以定义初始的状态或者初始的自己的装饰，后面的装饰行为都在此基础上一步一步进行点缀、装饰。
     * 	4.装饰者模式的设计原则为：对扩展开放、对修改关闭，这句话体现在我如果想扩展被装饰者类的行为，无须修改装饰者抽象类，
     * 		，只需继承装饰者抽象类，实现额外的一些装饰或者叫行为即可对被装饰者进行包装。
     * 		所以：扩展体现在继承、修改体现在子类中，而不是具体的抽象类，这充分体现了依赖倒置原则，这是自己理解的装饰者模式。
     */
    
}  