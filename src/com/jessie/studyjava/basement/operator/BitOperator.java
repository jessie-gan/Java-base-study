package com.jessie.studyjava.basement.operator;
/*
 * 位运算：~ & | ^ << >> >>>
 * 移位运算能够实现整除 或乘以2倍的效果
 */
public class BitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=46;
		int j = 97;
		System.out.println("46&97:"+(i&j));
		System.out.println("46^97:"+(i^j));
		System.out.println("46右移1位："+(i>>1));
	}

}
