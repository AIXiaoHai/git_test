package com.atguigu.java;

/**
	匿名对象 ： 没有名字的对象
	
	特点 ： 1.只能调用一次
	
	作用 ：往往将匿名对象作为实参进行传递
 */
class Person{
	String name;
	int age;
	
	public void info(){
		System.out.println("name=" + name + " age=" + age);
	}
}

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "aa";
		p.age = 18;
		p.info();
		
		System.out.println("---------匿名对象--------------");
		//匿名对象
		/*
		     匿名对象的特点：
		  1.只能调用一次
		  
		   作用 ：往往作为实参进行传递
		 */
		new Person().name = "无名";
		new Person().age = 20;
		new Person().info();
		
		//调用方法
		PersonTest pt = new PersonTest();
		/*
		 * 类似于 ：Person p =  new Person();
		 */
		pt.setPerson(new Person());
		
		Person p2 = new Person();
		/*
		 * 类似于 ： Person p2 = new Person();
		 * 		  Person p = p2;
		 */
		pt.setPerson(p2);
	}
	
	/*
	 * 给引用数据类型的变量赋值只能赋值该类型的对象
	 */
	public void setPerson(Person p){
		
	}
}
