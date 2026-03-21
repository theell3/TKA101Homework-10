package hw4;

public class Q1 {
	
	public static void main(String[] args) {
		/*
			有個一維陣列如下：
			{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
			請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素 
		*/
		
		int[] arr = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		int average = total / arr.length;
		System.out.printf("平均值：%d \n", average);
		System.out.printf("大於平均值：");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > average) {
				System.out.printf("%d ", arr[i]);
			}
		}
		
	}
}
