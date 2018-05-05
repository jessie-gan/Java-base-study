package com.jessie.studyjava.basement.operator;

import java.util.Scanner;

/*
 * 不用中间变量实现两变量的互换：使用异或运算符进行互换
 */
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		System.out.println("input A:"+A);
		long B = sc.nextLong();
		System.out.println("input B:"+B);
		System.out.println("A="+A+'\t'+"B="+B);
		System.out.println("excute exchange....");
		A = A ^ B;
		B = B ^ A;
		A = A ^ B;
		System.out.println("A="+A+'\t'+"B="+B);
	}

}
