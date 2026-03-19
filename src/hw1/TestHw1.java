package hw1;

public class TestHw1 {
	
	public static void main(String args[]) {
		//	• 請設計一隻Java程式，計算12，6這兩個數值的和與積
		getSumAndProduct(12, 6);
		
		//	• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		getQuantityOfEggs(200);
		
		//	• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		parseSeconds(256559);
		
		//	• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		getCircleAreaAndCircumference(5);
		
		/*
		• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
		金加利息共有多少錢 (用複利計算，公式請自行google)
		*/
		getCompoundInterest(1500000);
		
		/*
		• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
		5 + 5
		5 + ‘5’
		5 + “5”
		並請用註解各別說明答案的產生原因
		*/
		printResult();
	}
	
	
	//	• 請設計一隻Java程式，計算12，6這兩個數值的和與積
	public static void getSumAndProduct(int firstNum, int secondNum) {
		int sum = firstNum + secondNum;
		int product = firstNum * secondNum;
		System.out.printf("%d 和 %d 的和：%d，積：%d \n", firstNum, secondNum, sum, product);
	}
	
	//	• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
	public static void getQuantityOfEggs(int eggs) {
		int dozen = eggs / 12;
		int remain = eggs % 12;
		System.out.printf("%d 顆蛋是 %d 打 %d 顆 \n", eggs, dozen, remain);
	} 
	
	
	//	• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	public static void parseSeconds(int seconds) {
		int remain = seconds % 60;
		int minute = seconds / 60 % 60;
		int hours = seconds / 60 / 60 % 24;
		int days = seconds / 60 / 60 / 24;
		System.out.printf("%d 是 %d 天 %d 時 %d 分 %d 秒 \n", seconds, days, hours, minute, remain);
				
	}
	
	//	• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
	public static void getCircleAreaAndCircumference(double radius) {
		final double PI = 3.1415;
		double circleArea = radius * radius * PI;
		double circumference = 2 * radius * PI;
		//System.out.printf("半徑為 %f 的圓面積：%f，圓周長：%f \n", radius, circleArea, circumference);
		System.out.printf("半徑為 %.2f 的圓面積：%.2f，圓周長：%.2f \n", radius, circleArea, circumference);
	} 
	
	/*
	• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
	金加利息共有多少錢 (用複利計算，公式請自行google)
	*/
	public static void getCompoundInterest(double saving) {
		double total = saving * Math.pow(1+0.2, 10);
		System.out.printf("%f 的10年複利是 %f \n",saving, total);
		System.out.printf("%.0f 的10年複利是 %.0f \n",saving, total);
	} 
		
	
	/*
	• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
	5 + 5
	5 + ‘5’
	5 + “5”
	並請用註解各別說明答案的產生原因
	*/
	public static void printResult() {
		// 兩者都是數字，相加後印出10
		System.out.println("5 + 5 = " +  (5 + 5));
		// '5'轉成數字後為53，再加上數字5，相加後印出58
		System.out.println("5 + '5' = " + (5 + '5') );
		// 數字＋字串會直接將數字轉成字串，再利用字串串接的方式呈現，故印出55
		System.out.println("5 + “5” = " + (5 + "5"));
	} 
}
