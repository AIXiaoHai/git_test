package com.atguigu.exer2;

/*
 * 3.定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方法求两个double值中的最大值，
 * 第三个方法求三个double值中的最大值，并分别调用三个方法。
 */
public class OverloadExer2 {

	public int max(int a, int b) {
		return (a > b)? a : b;
	}

	public double max(double a, double b) {
		/*
		 * max(double a,double b) : 求两个数中的最大值
		 */
		return Math.max(a, b);
	}

	public double max(double a, double b, double c) {
		//第一种方式
//		double maxNumber = Math.max(a, b);
//		return Math.max(maxNumber, c);
		
		//第二种方式
		return Math.max(max(a,b), c);
	}

	public static void main(String[] args) {

		OverloadExer2 oe = new OverloadExer2();
		System.out.println(oe.max(10.5, 12.3, 9.8));
	}
}
