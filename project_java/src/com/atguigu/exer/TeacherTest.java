package com.atguigu.exer;


class Teacher{
	/*
	 *  name:String
		age:int
		teachAge:int
		course:String

	 */
	public String name;
	public int age;
	public int teachAge;
	public String course;
	
	public void say(){
		System.out.println(name + " - " + age + " - " + teachAge + " - " + course);
	}
}
public class TeacherTest {

	public static void main(String[] args) {
		//对象是由类派生出来的
		Teacher teacher = new Teacher();
		//给属性赋值
		teacher.name = "小苍老师";
		teacher.age = 20;
		teacher.teachAge = 2;
		teacher.course = "表演";
		
		teacher.say();
	}
}
















