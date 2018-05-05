package com.jessie.studyjava.basement.variable;

/*
 * 常量用final关键字限定，不能被修改
 */
public class ConstantVal {
	static final double PI = 3.1415926F;
	final boolean FLAG = true;// 定义为成员变量必须赋初值
	static int age = 24;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int num;// 可以不赋初值，但后面只能赋值一次
		num = 1234;
		System.out.println("PI:" + PI);
		System.out.println("赋值后的num：" + num);
		age = 22;
		System.out.println("修改成员变量age后的值：" + age);

		int age = 23;
		System.out.println("age的值：" + age);// 覆盖掉成员变量的值
		System.out.println("成员变量中的age：" + ConstantVal.age);// 用类名.成员变量名来调用
	}

}
