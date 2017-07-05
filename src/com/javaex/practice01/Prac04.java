package com.javaex.practice01;

public class Prac04 {

	public static void main(String[] args) {
		for(int i=1; i<11; i++) {
			for(int j=i; j<10+i; j++) {
				System.out.print(j+"\t");
			}
			
			System.out.println();
		}
		
	}
}
