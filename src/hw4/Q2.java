package hw4;

public class Q2 {
	public static void main(String[] args) {
		/*
			請建立一個字串，經過程式執行後，輸入結果是反過來的
			例如String s = “Hello World”，執行結果即為dlroW olleH
		*/
		String s = "Hello World";
		for(int i = s.length()-1; i >=0; i--) {
			System.out.printf("%c", s.charAt(i));
		}
	}
}
