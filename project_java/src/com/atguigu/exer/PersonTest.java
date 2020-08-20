package com.atguigu.exer;

/*
 * windows系统的快捷键 ：alt + tab - 切换打开的程序
 */
class Person{
	String name;
	int age;
	int sex;
	
	/*
	 * +study():void
+showAge():void
+addAge(int i):int

	 */
	public void study(){
		System.out.println("studying");
	}
	
	//哪个对象调用的showAge显示的就是谁的age的值
	public void showAge(){
		System.out.println("age=" + age);
	}
	
	
	public int addAge(int i){
		return age + i; //没有改变age的值
		
//		return age += i; //改变了age的值
	}
}
public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "小龙哥";
		person.age = 18;
		person.sex = 1;
		
		//调用方法
		person.study();
		person.showAge();
		int age = person.addAge(2);
		System.out.println("age=====================" + age);
		person.showAge();
		
		
		System.out.println("---------------------------------------------");
		
		
		Person p = new Person();
		p.name = "斯哥";
		p.age = 20;
		p.sex = 1;
		
		//调用方法
		p.study();
		p.showAge();
		int a = p.addAge(2);
		System.out.println("a=====================" + a);
		p.showAge();
	}
}










