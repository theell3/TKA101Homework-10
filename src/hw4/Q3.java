package hw4;

public class Q3 {
	public static void main(String[] args) {
		/*
			有個字串陣列如下 (八大行星)：
			{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
			請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		*/
		
		int count = 0;
		String[] arr = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		// 取陣列的字串
		for(int i = 0; i < arr.length; i++) {
			// 取字串的字元
			for(int j = 0; j < arr[i].length(); j++) {
				char c = arr[i].charAt(j);
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					count++;
				}
			}
		}
		System.out.printf("這陣列裡面共有 %d 個母音", count);
		
		
	}
}
