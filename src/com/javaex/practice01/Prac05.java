package com.javaex.practice01;

import java.util.Scanner;

public class Prac05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		int max = 0;
		System.out.println("숫자를 입력하세요");
		
		for(int i=0; i<5; i++) {
			System.out.print("숫자: ");
			nums[i] = sc.nextInt();
			
			if(nums[i]>max) {
				max = nums[i];
			}
		}
		
		System.out.println("최대값은 "+max+"입니다.");
		
		sc.close();

	}

}
