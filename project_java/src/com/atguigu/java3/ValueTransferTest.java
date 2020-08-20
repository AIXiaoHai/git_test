package com.atguigu.java3;

/*
          形参：方法声明时的参数
	实参：方法调用时实际传给形参的参数值
	
	值传递：调用方法时传递的数据的方式
	1.在调用方法时，如果传递的是基本数据类型，那么传过去的是具体的值。
	2.在调用方法时，如果传递的是引用数据类型，那么传过去的是该对象的地址值。
	

 */
public class ValueTransferTest {

	public static void main(String[] args) {
		//创建对象
		ValueTransferTest vt = new ValueTransferTest();
		//需求：交换两个变量中的值
		int m = 5,n = 10;
		//调用方法交换数据
		vt.swapData(m, n);
		System.out.println("m=" + m + " n=" + n);
	}
	
	/*
	 * 值传递 ： 调用方法时传递数据
	 * 
	 * 值传递 ：调用方法传递的是基本数据类型
	 */
	public void swapData(int m,int n){
		System.out.println("sd交换之前 m=" + m + " n=" + n);
		//交数数据
		int temp = m;
		m = n;
		n = temp;
		System.out.println("sd交换之后 m=" + m + " n=" + n);
	}
}
