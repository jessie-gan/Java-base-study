package com.jessie.studyjava.basement.dataType;
/*
 * 转义字符
 */
public class ESC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = '\\';//双引号要报错；
		char c2 = '\u2605';
		int i = '\123';
		System.out.println("反斜杠："+c1+"   五角星号："+c2+"  八进制转十进制数："+i);
	}

}
