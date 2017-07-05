package com.javaex.practice01;

import java.util.Scanner;

public class Prac08 {

	public static void main(String[] args) {
		boolean flag = true;
		int account = 0;
		int money=0;
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택>");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1: 
					System.out.print("예금액>");
					money = sc.nextInt();
					account += money;
					break;
				case 2:
					System.out.print("출금액>");
					money = sc.nextInt();
					if(money<=account) {
						account -= money;
					} else {
						System.out.println("잔고가 부족합니다.");
						System.out.println("잔고액 : "+account);
					}
					break;
				case 3:
					System.out.println("잔고액>"+account);
					break;
				case 4:
					flag = false;
					System.out.println("프로그램 종료");
					break;
				default:
					System.out.println("다시 입력해주세요");
				
			}
		}
		sc.close();
	}
}
