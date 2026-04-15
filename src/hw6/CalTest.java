package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		
		while(true) {
			try {
				System.out.println("請輸入x的值：");
				int x = sc.nextInt();
				System.out.println("請輸入y的值：");
				int y = sc.nextInt();
				int result = cal.powerXY(x, y);
				System.out.printf("%d的%d次方等於%d", x, y, result);
				break;
			}catch(CalException e) {
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}catch(InputMismatchException e) {
				System.out.println("輸入格式不正確");
				sc.next(); // 清除錯誤input
			}
		}
		
	}
}
