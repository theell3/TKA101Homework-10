package hw2;

public class TestHw2 {
	public static void main(String args[]) {
		//	• 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		getSumOfEven();
		//	• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		getProuductWithFor();
		//	• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		getProuductWithWhile();
		//	• 請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100
		printPower();
		System.out.println();
		
		/*
		• 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		*/
		printNumWithoutFour();
		System.out.println();
		
		/*
		• 請設計一隻Java程式，輸出結果為以下：
		1 2 3 4 5 6 7 8 9 10
		1 2 3 4 5 6 7 8 9
		1 2 3 4 5 6 7 8
		1 2 3 4 5 6 7
		1 2 3 4 5 6
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1
		*/
		printNumbers();
		System.out.println();
		
		/*
		• 請設計一隻Java程式，輸出結果為以下：
		A
		BB
		CCC
		DDDD
		EEEEE
		FFFFFF
		*/
		printAlphabet();
	}
	
		//	• 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		public static void getSumOfEven() {
			int total = 0;
			for(int i = 2; i<=1000; i+=2) {
				total += i;
			}
			System.out.println("1～1000的偶數和是 "+ total);
		}
		
		//	• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		public static void getProuductWithFor() {
			int result = 1;
			for(int i = 1; i <= 10; i++) {
				result *= i;
			}
			System.out.println("1～10的連乘積 (1*2*3*…*10) (用for迴圈)為 " + result);
			
		}
		//	• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		public static void getProuductWithWhile() {
			int currentNum = 2;
			int result = 1;
			while(currentNum <=10) {
				result *= currentNum;
				currentNum++;
			}
			System.out.println("1～10的連乘積 (1*2*3*…*10) (用while迴圈)為 " + result);
		}
		
		//	• 請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100
		public static void printPower() {
			for(int i = 1; i <= 10; i++) {
				double result = Math.pow(i, 2);
				System.out.printf("%.0f ", result);
			}
			System.out.println();
		}
		
		/*
		• 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		*/
		public static void printNumWithoutFour() {
			int count = 0;
			System.out.print("阿文可以選擇的數字有: ");
			
			for(int i = 1; i <= 49; i++) {
				if((i%10 != 4) && (i/10 != 4)) {
					System.out.printf("%d ", i);
					count++;
				}
			}
			System.out.println();
			System.out.printf("總共有 %d 個 \n", count);	
		}
		
		/*
		• 請設計一隻Java程式，輸出結果為以下：
		1 2 3 4 5 6 7 8 9 10
		1 2 3 4 5 6 7 8 9
		1 2 3 4 5 6 7 8
		1 2 3 4 5 6 7
		1 2 3 4 5 6
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1
		*/
		public static void printNumbers() {
			for(int i = 10; i >= 1; i--) {
				for(int j = 1; j <= i; j++) {
					System.out.printf("%d ", j);
				}
				System.out.println();
			}
		}
		
		/*
		• 請設計一隻Java程式，輸出結果為以下：
		A
		BB
		CCC
		DDDD
		EEEEE
		FFFFFF
		*/
		public static void printAlphabet(){
			int length = (int)('F'-'A');
			for(int i = 0; i <= length; i++) {
				char ch = (char)('A' + i);
				for(int j = 0; j <= i; j++) {
					System.out.printf("%c", ch);
				}
				System.out.println();
			}
		}
	
}
