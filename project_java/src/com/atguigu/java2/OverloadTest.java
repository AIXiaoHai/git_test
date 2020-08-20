package com.atguigu.java2;

/**
	方法的重载 ：在同一个类中相同的方法名不同的形参列表构成方法的重载
	
	两同一不同 ： 同一个类，同一个方法名，不同的形参列表
	
	形参列表不同 ：类型，个数，顺序不同
	
	注意：方法的重载和权限修饰符，返回值类型，形参的名字无关
	
	思考 ：如何确定调用的是哪个方法？ 方法名 +　形参列表
	
 */
public class OverloadTest {

	public static void main(String[] args) {
		
		//思考 ：如何确定调用的是哪个方法？ 方法名 +　形参列表
		OverloadTest ot = new OverloadTest();
		ot.add(12,12);
	}
	
	//需求:设计一个方法求两个int类型数据的和
	public void add(int a,int b){
		System.out.println("int int");
	}
		
	public void add(int a,int b,int c){
			
	}
	//需求:设计一个方法求两个double类型数据的和
	public void add(double a,double b){
			
	}
	
	/*
	 * 方法的重载和权限修饰符无关
	 
	private void add(int a,int b){
		
	}
	*/
	
	/*
	 * 方法的重载和形参的名字没有关系
	public void add(int aa,int bb){
		
	}
	*/
	
	/*
	 * 方法的重载和返回值类型无关
	public int add(int a,int b){
		return 0;
	}
	*/
	

}
