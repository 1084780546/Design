package com.chen.CompositePattern.CompositePattern2;
  
public class PayDemo {  
	
	/**
	 * @Title: main 
	 * @param args
	 * @return: void
	 * 
	 * 当发现需求中是体现部分与整体层次结构时，以及你希望用户可以忽略组合对象与单个对象的不同，统一地使用组合结构中的所有对象时，就应该考虑组合模式了
	 * 
	 * 首先：
	 * 		1.我们的部件有，总店，分店，加盟店！
	 * 		2.我们的部件共有的行为是：刷会员卡
	 * 		3.部件之间的层次关系，也就是店面的层次关系是，总店下有分店、分店下可以拥有加盟店。
	 * 
	 * 有了我们这几个必要条件后，我的要求就是目前店面搞活动当我在总店刷卡后，就可以累积相当于在所有下级店面刷卡的积分总额
	 * 
	 * 相互嵌套,用一个接口实现 ‘部分-整体’的层次结构 
	 */
  
    public static void main(String[] args) {  
          
        MarketBranch rootBranch = new MarketBranch("总店");  
        MarketBranch qhdBranch = new MarketBranch("秦皇岛分店");  
        MarketJoin hgqJoin = new MarketJoin("秦皇岛分店一海港区加盟店");  
        MarketJoin btlJoin = new MarketJoin("秦皇岛分店二白塔岭加盟店");  
          
        qhdBranch.add(hgqJoin);  
        qhdBranch.add(btlJoin);  
        rootBranch.add(qhdBranch);  
        rootBranch.PayByCard();  
    }  
}  