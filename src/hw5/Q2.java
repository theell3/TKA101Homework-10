package hw5;

public class Q2 {
	public static void main(String[] args) {
		/*
		• 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
		本次亂數結果：
		32 35 15 12 81 28 20 45 40 21
		32
		*/
		Q2 obj = new Q2();
		obj.randAvg();
	}
	
	public void randAvg() {
		System.out.println("本次亂數結果：");
		int total = 0;
		for(int i = 0; i < 10; i++) {
			int currentNum = (int)Math.floor(Math.random() * 101);
			System.out.printf("%d ", currentNum);
			total += currentNum;
		}
		System.out.println();
		System.out.printf("%d ", (int)Math.floor(total/10));
	}
}
