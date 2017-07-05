package com.javaex.practice01;

import java.util.Scanner;

public class Prac05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int max = 0;
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		
		max = sc.nextInt();					//처음 숫자를 최대값을 저장
		
		for(int i=0; i<4; i++) {
			System.out.print("숫자: ");
			num = sc.nextInt();
				
			if(num>max) {					//입력받은 숫자가 저장된 최대값보다 클 경우 최대값 갱신
				max = num;
			}
		}
		
		System.out.println("최대값은 "+max+"입니다.");
		
		sc.close();

	}

}
