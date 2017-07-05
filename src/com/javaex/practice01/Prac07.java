package com.javaex.practice01;

import java.util.Scanner;

public class Prac07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = (int)(Math.random()*100)+1;
		int num=0;
		
		System.out.println("===============================");
		System.out.println("\t[숫자맞추기게임 시작]\t");
		System.out.println("===============================");
		while(true) {
			System.out.print(">>");
			num=sc.nextInt();
			
			if(num<ans) {
				System.out.println("더 높게");
			} else if(num>ans) {
				System.out.println("더 낮게");
			} else {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				
				String flag = sc.next();
				
				if(flag.equals("y")) {
					break;
				}
				
				ans = (int)(Math.random()*100)+1;
			}
		}
		
		System.out.println("===============================");
		System.out.println("\t[숫자맞추기게임 종료]\t");
		System.out.println("===============================");
		
		sc.close();
	}

}
