package hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TestHw3 {
		public static void main(String args[]) {
			/*
			• 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
			三角形、其它三角形或不是三角形 
			*/
			getTriangleType();
			
			/*
			• 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
			對則顯示正確訊息
			*/
			guessNumber();
			
			/*
			阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
			厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
			的號碼與總數
			
			呈上題，進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複
			*/
			filterNumber();
		}
		
		/*
		• 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
		三角形、其它三角形或不是三角形 
		*/
		public static void getTriangleType() {
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入： ");
			if(sc.hasNextInt()) {	
				int[] sides = new int[3];
				sides[0] = sc.nextInt();
				sides[1] = sc.nextInt();
				sides[2] = sc.nextInt();
				
				// 先按照順序排，由小至大
				Arrays.sort(sides);
				int num1 = sides[0];  // 長度最短
				int num2 = sides[1];
				int num3 = sides[2];  // 長度最長
				// System.out.println("num1 == "+ num1);
				// System.out.println("num2 == "+ num2);
				// System.out.println("num3 == "+ num3);
				
				
				if(num1 + num2 <= num3) {
					// 不是三角形 => 兩邊和未大於第三邊
					System.out.println("不是三角形");
				}else if(num1 == num2 && num2 == num3) {
					// 正三角形 => 三邊相等
					System.out.println("正三角形");
				}else if(num1 == num2 || num2 == num3 || num1 == num3) {
					// 等腰三角形 => 任兩邊相等
					System.out.println("等腰三角形");
				}else if(num1 * num1 + num2 * num2 == num3 * num3) {
					// 直角三角形 => num1 平方 + num2 平方 = num3 平方
					System.out.println("直角三角形");
				}else {
					// 其他三角形
					System.out.println("其他三角形");
				}
			}
			
			
		}
		
		/*
		• 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
		對則顯示正確訊息
		*/
		public static void guessNumber() {
			int targetNum = (int)(Math.random() * 10);
			int guessNum;
			boolean isWrongAns = true; // 用於猜對或猜錯
			// System.out.println("targetNum = " + targetNum);
			Scanner sc = new Scanner(System.in);
			System.out.println("開始猜數字吧！ ");
			while(isWrongAns){				
				if(sc.hasNext()) {
					guessNum = sc.nextInt();
					// System.out.println("guessNum = " + guessNum);
					if(guessNum == targetNum) {
						isWrongAns = false;
						System.out.println("答對了！答案就是"+ guessNum);
					}else {
						System.out.println("猜錯囉 ");
					}
				}
			}
		}
		
		/*
		阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
		厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
		的號碼與總數
		
		呈上題，進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複
		=> // 先存放篩選後的數字，亂數後再選前六個打印
		*/
		public static void filterNumber() {
			Scanner sc = new Scanner(System.in);
			System.out.println("阿文...請輸入你討厭哪個數字？");
			if(sc.hasNextInt()) {
				int targetNum = sc.nextInt();
				int count = 0;
				// 存放篩選後的數字
				ArrayList<Integer> newArr = new ArrayList<Integer>(); 
				for(int i = 1; i <= 49; i++) {
					if((i%10!=targetNum) && (i/10!=targetNum)) {
						System.out.printf("%d \t", i);
						newArr.add(i);
						count++;
						if(count%6 == 0) {
							System.out.println();
						}
					}
				}
				System.out.println();
				System.out.printf("總共有 %d 個數字可選 \n", count);
				
				// 隨機打亂
				Collections.shuffle(newArr);  
				// 取出前六個隨機數字
				if(newArr.size() >= 6) {
					System.out.print("亂數印出6個號碼且不得重複：");
					for(int i = 0; i < 6; i++) {
						System.out.printf("%d ", newArr.get(i));
					}
				}
			}
		}

}
