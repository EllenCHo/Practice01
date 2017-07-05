package com.javaex.practice01;

import java.util.Scanner;

public class Prac06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		int i = sc.nextInt();
		int result = 0;

		int flag = i % 2;			//짝수인 지 홀수인 지 플래그

		switch (flag) {
		case 0:						//짝수일 경우
			for (int j = 2; j <= i; j+=2) {			//2부터 입력한 수까지 +2
				result += j;
			}
			break;

		case 1:						//홀수일 경우
			for (int j = 1; j <= i; j+=2) {			//1부터 입력한 수까지 +2
				result += j;
			}
			break;
		}

		System.out.println("결과값: " + result);
		sc.close();
	}

}
