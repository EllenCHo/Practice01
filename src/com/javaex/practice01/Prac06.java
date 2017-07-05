package com.javaex.practice01;

import java.util.Scanner;

public class Prac06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		int i = sc.nextInt();
		int result = 0;

		int flag = i % 2;

		switch (flag) {
		case 0:
			for (int j = 2; j <= i; j+=2) {
				result += j;
			}
			break;

		case 1:
			for (int j = 1; j <= i; j+=2) {
				result += j;
			}
			break;
		}

		System.out.println("결과값: " + result);
		sc.close();
	}

}
