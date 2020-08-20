package com.atguigu.java;

public class MethodTest {

	public static void main(String[] args) {
		
		MethodTest mt = new MethodTest();
		//注意 ：如果方法没有返回值下面的写法不对
		System.out.println(mt.getInfo());
		
//		mt.show();
		
		int number = mt.add(1, 2);
		System.out.println(number * 2 );
	}
	
	public int add(int a,int b){
		return a + b;
	}
	
	
	/**
	 * 定义一个方法 ：输出一句话 “小龙哥你真帅”
	 */
	public String getInfo(){
		return "小龙哥你真帅";
	}
	
	/**
	 * 如果需要方法的返回值去做其它运算那么就必须返回数据。
	 */
	public void show(){
		System.out.println("小龙哥你真帅"); 
	}
}
