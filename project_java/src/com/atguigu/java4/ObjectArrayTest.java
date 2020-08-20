package com.atguigu.java4;

/*
 * 对象数组 ：数组中存储的是对象
 * 
 * 要求：
 * 	1.给数组中的元素赋值对象
 *  2.获取数组中存储的对象
 *  3.数组中所有的元素都是同一个对象
 *  4.数组中所有的元素都是不同的对象
 */

class Computer{
	String type;
}

public class ObjectArrayTest {

	public static void main(String[] args) {
		
		ObjectArrayTest ot = new ObjectArrayTest();
//		ot.demo1();
//		ot.demo2();
		ot.demo3();
		
	}
	/**
	 * 数组中所有的元素存储不同的对象
	 */
	public void demo3(){
		//创建数组
		Computer[] cs = new Computer[3];
		//给数组中的元素赋值
		for (int i = 0; i < cs.length; i++) {
			Computer c = new Computer();
			c.type = "小龙哥";
			cs[i] = c;
		}
		
		//给数组索引值为0的对象的属性赋值
		cs[0].type = "清华同方";
		
		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i].type);
		}
	}
	/**
	 * 数组中所有元素存储同一个对象
	 */
	public void demo2(){
		//创建数组
		Computer[] cs = new Computer[3];
		//创建对象
		Computer computer = new Computer();
		computer.type = "拯救者";
		//遍历数组给数组赋值
		for (int i = 0; i < cs.length; i++) {
			cs[i] = computer;
		}
		//修改索引值为0的对象的属性
		cs[0].type = "雷神";
		
		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i].type);
		}
		
	}
	
	/**
	 * 给数组中赋值对象，获取数组中的对象，修改数组中的对象的属性值
	 */
	public void demo1(){
		String[] ps = new String[3];
		ps[0] = "ccc";//在java中把所有双引号引起来的都看成是String的对象（实例）
		ps[1] = new String("aaa");
		
		System.out.println("------------------");
		
		Computer[] cs = new Computer[3];
		//向数组中存放对象
		//1.创建对象
		Computer c = new Computer();
		c.type = "联想Y700";
		//2.将对象放入数组中
		cs[0] = c;
		
		
		Computer c2 = new Computer();
		cs[1] = c2;
		//通过获取数组中的元素给属性赋值
//		Computer computer = cs[1];
//		computer.type = "外星人";
		
		cs[1].type = "外星人";
	}
}
















