package com.atguigu.exer;

/*
 * 利用面向对象的编程方法，设计类Circle计算圆的面积。
 */
class Circle{
	
	int radius = 1;//半径
	
	/*
	 * 计算面积
	 * 1.要不要返回值
	 * 2.要不要形参
	 */
	//下面的方法设计的不合理
	public void findArea(int c){ //c半径
		System.out.println(Math.PI * c * c);
	}
	
	
	public void findArea2(){
		System.out.println(Math.PI * radius * radius);
	}
}


public class CircleTest {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.radius = 1;
		
		c.findArea(5); //传递的半径的值
		
		c.findArea2();//使用的属性的值
	}
}
