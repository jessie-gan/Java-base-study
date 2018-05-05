package com.jessie.studyjava.basement.operator;

import java.util.Scanner;

/*
 * 使用三目运算符判断奇偶性
 */
public class Practices2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input an integer:");
		long number = sc.nextLong();
		String check = (number%2==0)?"这是偶数":"这是奇数";
		System.out.println(check);
	}

}
