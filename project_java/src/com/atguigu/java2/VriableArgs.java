package com.atguigu.java2;

/**
	可变形参 ：
	
	格式 ： 变量的类型 ... 变量名
	
	说明：
		1.可变形参的个数可以是0个1个或多个
		2.和可变形参相同类型的数组不构成重载(可变形参其实就是数组)
		3.可变形参只能放在形参列表的最后一个。
		4.在一个形参列表中最多只能有一个可变形参
 */
public class VriableArgs {

	public static void main(String[] args) {
		
		//创建对象
		VriableArgs va = new VriableArgs();
		
//		int[] numbers = {1,2,3,4,5};
//		va.add(numbers);
		
//		va.add(new int[]{1,2,3,4,5,6});
		
		//错误的写法
//		va.add({1,2,3,4,5,6});
		
		va.add(1);
		va.add(1,2,3,4,5);
		va.add(2,3);
	}
	
	//可变形参的底层就是一个数组
//	public void add(int ... numbers){//可变形参
//		int sum = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			sum += numbers[i];
//		}
//		System.out.println(sum);
//	}
	
	
	public void add(int a,int ... numbers){//可变形参
		System.out.println("a==" + a);
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println(sum);
	}
	/*
	 * 和可变形参相同类型的数组不构成重载
	public void add(int[] numbers){
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println(sum);
	}
	*/
	
	
	//需求：求两个数的和

	//需求：求3个数的和

	//需求：求30/5/6/900/856......个数的和
}
