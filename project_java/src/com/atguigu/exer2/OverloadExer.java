package com.atguigu.exer2;
/*
 * 2.编写程序，定义三个重载方法并调用。方法名为mOL。
三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
在主类的main ()方法中分别用参数区别调用三个方法。



 */
public class OverloadExer {
	
	public void mOL(int a){
		System.out.println(a * a);
	}
	
	public void mOL(int a,int b){
		System.out.println(a * b);
	}
	
	public void mOL(String str){
		System.out.println(str);
	}

	public static void main(String[] args) {
		//创建对象
		OverloadExer oe = new OverloadExer();
		oe.mOL(10);
		oe.mOL(5, 10);
		oe.mOL("好好学习天天向上");
	}
	
	

}
