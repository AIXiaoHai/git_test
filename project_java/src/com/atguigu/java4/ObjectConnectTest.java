package com.atguigu.java4;

/*
 * 对象的关联
 */
class Teacher{
	String name;
	Dog dog;
}

class Dog{
	String name;
	int age;
}


public class ObjectConnectTest {

	public static void main(String[] args) {
		//创建一个老师的对象
		Teacher teacher = new Teacher();
		//给老师的属性赋值
		teacher.name = "苍老师";
		
		//创建一只狗
		Dog dog = new Dog();
		//给狗的属性赋值
		dog.name = "泰迪";
		dog.age = 2;
		
		//让老师的对象和狗的对象关联起来
		teacher.dog = dog;
		
		System.out.println("----------------------------------------");
		
		//输出苍老师的狗的名字
		System.out.println(teacher.dog.name); //语义更容易理解
		System.out.println(teacher.dog.age);
		
		
		//下面的效率比上面更高一些
		Dog d = teacher.dog;//获取苍老师的狗的对象
		//获取狗的名字
		System.out.println(d.name);
		System.out.println(d.age);
		
		System.out.println("---------------------------");
		//修改苍老师狗的名字
		teacher.dog.name = "藏獒";
		//输出苍老师狗的名字
		System.out.println(teacher.dog.name);
	}
}








