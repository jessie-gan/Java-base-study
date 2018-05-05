package com.jessie.studyjava.basement.dataType;


public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte mybyte = 124;
		short myshort = 32564;
		int myint=456789;
		long mylong = 45678908L;
		long result = mybyte+myshort+myint+mylong;
		System.out.println("四种类型相加结果："+result);
		
		/* 越界处理 ：小于下边界强转后会等于上边界值，大于上边界强转后会等于下边界+1*/
		byte mybyte1 = (byte) -129;
		byte mybyte2 = (byte)129;
		System.out.println("超出下界后强转byte："+mybyte1+"    超出上界后强转byte："+mybyte2);
		
		short myshort1 = (short)-32769;
		short myshort2 = (short)32769;
		System.out.println("超出下界后强转short："+myshort1+"    超出上界后强转short："+myshort2);
	}

}
