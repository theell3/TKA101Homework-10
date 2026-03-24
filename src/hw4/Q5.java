package hw4;

import java.util.Scanner;

public class Q5 {
	/*
		請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
		例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
		
		// 將閏年條件加入 => (被 4 整除且不被 100 整除）或 （被 400 整除）
		// 擋下錯誤輸入：例如月份輸入為2，則日期不該超過29
	*/
	
	public static void main(String[] args) {
		System.out.printf("請輸入三個整數，分別代表西元yyyy年，mm月，dd日\n");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()) {
			int year = sc.nextInt();
			int month = sc.nextInt();
			int day = sc.nextInt();
			
			// 每個月有幾天，第一列是平年，第二列是閏年
			int[][] daysInMonth = {
					{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31},
					{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31}
			};
			
			// 該年月份天數陣列
			int[] currentYearDays;
			
			// 比對是否是閏年
			if(isLeapYear(year)) {
				currentYearDays = daysInMonth[1];
			}else {
				currentYearDays = daysInMonth[0];
			}
			
			// 檢查輸入是否有錯
			boolean isValid = isValidDate(currentYearDays, month, day);
			
			if(isValid) {				
				int dayOfYear = calculateTotalDays(currentYearDays, month, day );
				System.out.printf("輸入的日期為該年第%d天", dayOfYear);
			}else {
				System.out.printf("日期輸入有錯哦\n");
			}
		}
	}
	
	// 檢查輸入是否有錯
	public static boolean isValidDate(int[] currentYearDays, int month, int day) {
		if(month <= 0 || month > 12) {
			return false;
		}
		if(day <= 0 || day > currentYearDays[month -1]) {
			return false;
		}
		return true;
	}
	
	// 是否為閏年
	public static boolean isLeapYear(int year) {
		if((year%4 == 0 && year%100 !=0) || (year % 400 == 0)) {
			return true;
		}else {
			return false;
		}	
	}
	
	// 計算是該年的第幾天
	public static int calculateTotalDays(int[] currentYearDays, int month, int day) {
		int total = 0;
		for(int i = 0; i < month-1; i++) {
			total += currentYearDays[i];
		}
		total += day;
		return total;
	}
}
