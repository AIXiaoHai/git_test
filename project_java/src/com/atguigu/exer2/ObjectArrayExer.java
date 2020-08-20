package com.atguigu.exer2;

/*
 * 快捷键 ： ctrl + /  单行注释、取消注释
 * 
 * 
 * 
 * 4. 对象数组题目：
定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。 创建20个学生对象，
学号为1到20，年级和成绩都由随机数确定。
问题一：打印出3年级(state值为3）的学生信息。
问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息

提示：
1) 生成随机数：Math.random()，返回值类型double;  
2) 四舍五入取整：Math.round(double d)，返回值类型long。
 */
class Student{
	int number;
	int state;
	int score;
}
public class ObjectArrayExer {

	public static void main(String[] args) {
		//创建数组
		Student[] students = new Student[20];
		
		for (int i = 0; i < students.length; i++) {
			//创建对象
			Student s = new Student();
			//给对象的属性赋值
			s.state = (int)(Math.random() * 6 + 1);//年纪
			s.number = i + 1; //number
			s.score = (int)(Math.round(Math.random() * 100));
			//将对象赋值到数组中
			students[i] = s;
		}
		
		//遍历数组中的元素
//		for (int i = 0; i < students.length; i++) {
//			Student s = students[i];
//			if(s.state == 3){
//				System.out.println(s.number + " " + s.state + " " + s.score);
//			}
//		}
		
		//问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
		//1.排序
		for (int i = 0; i < students.length - 1; i++) {
			
			for (int j = 0; j < students.length - 1 - i; j++) {
				
				//根据成绩排序
				if(students[j].score > students[j + 1].score){
					//交换 - 交换的是对象不是属性
					Student student = students[j];
					students[j] = students[j + 1];
					students[j + 1] = student;
				}
				
			}
		}
		//2.遍历数组中所有的对象
		for (int i = 0; i < students.length; i++) {
//			System.out.println(students[i].number + " " 
//						+ students[i].state + " " 
//					+ students[i].score);
			
			//下面的效率比上面的高
			Student s = students[i];
			System.out.println(s.number + " " + s.state + " " + s.score);
		}
	}
}














