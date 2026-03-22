package hw4;

import java.util.Scanner;

public class Q4 {
	/*
		 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
		 表如下：   
		 編號：   25    32     8     19      27
		 現金： 2500   800   500   1000    1200
		 
		 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
		 有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
		 員工編號: 25 19 27 共 3 人!」
		 // 這題要用二維陣列寫，先不要用物件來做
	 */
	
	public static void main(String[] args) {
		
		int[][] employees = {
				{25, 32, 8, 19, 27},
				{2500, 800, 500, 1000, 1200}
		};
		System.out.printf("請輸入小華想借的錢:");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()) {
			// 想要借的錢
			int target = sc.nextInt();
			int count = 0;
			System.out.printf("有錢可借的員工編號:");
			
			for(int i = 0; i < employees[1].length; i++) {
				if(employees[1][i] >= target) {
					System.out.printf("%d ", employees[0][i]);
					count++;
				}
			}
			System.out.printf("共 %d 人\n", count);			
		}
	}
}
