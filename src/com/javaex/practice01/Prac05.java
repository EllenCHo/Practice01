package com.javaex.practice01;

import java.util.Scanner;

public class Prac05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		
		System.out.println("숫자를 입력하세요");
		
		for(int i=0; i<5; i++) {
			System.out.print("숫자: ");
			nums[i] = sc.nextInt();
		}
		
		int max = nums[0];
		
		for(int j=0; j<5; j++) {
			if(max<nums[j]) {
				max = nums[j];
			}
		}
		
		System.out.println("최대값은 "+max+"입니다.");
		
		sc.close();

	}

}
