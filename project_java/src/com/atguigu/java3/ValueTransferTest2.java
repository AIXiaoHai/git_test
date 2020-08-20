package com.atguigu.java3;

/*
  	值传递：
  	
  	调用方法时如果传递的是引用数据类型，那么传递过去的是那个对象的地址值。
 */

class Number{
	int m;
	int n;
}


public class ValueTransferTest2 {

	public static void main(String[] args) {
		//创建对象
		ValueTransferTest2 vt = new ValueTransferTest2();
		Number number = new Number();
		number.m = 5;
		number.n = 10;
		//调用方法交换数据
		vt.swapData(number);
		System.out.println("number.m=" + number.m + " number.n=" + number.n);
	}
	
	public void swapData(Number number){
		int temp = number.m;
		number.m = number.n;
		number.n = temp;
	}
	
	
	
}
