package com.atguigu.java3;

/*
  	值传递：
  
 */
class Person{
	String name;
}
public class ValueTransferTest3 {

	public static void main(String[] args) {
		
		int m = 5;
		int n = m;
		n = 10;
		System.out.println("m=" + m + " n=" + n);//m=5 n=10

		
		System.out.println("-------------------------");
		
		Person person = new Person();
		person.name = "小龙哥";
		
		Person person2 = person;
		person2.name = "小泽姐";
		
		System.out.println(person.name); //小泽姐
		System.out.println(person2.name);//小泽姐
	}
	
	
}
