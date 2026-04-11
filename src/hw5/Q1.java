package hw5;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		/*
			請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如圖:
			請輸入寬高：
			5 4
			*****
			*****
			*****
			*****
		*/
		
		Q1 obj = new Q1();
		System.out.println("請輸入寬高：");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()) {
			int width = sc.nextInt();
			int height = sc.nextInt();
			obj.starSquare(width, height);
		}
	}
	
	
	public void starSquare(int width, int height) {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
