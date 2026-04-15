package hw5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q5 {
	
	public static void main(String[] args) {
		/*
		 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
		 genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
		 與數字的亂數組合
		*/
		System.out.println("本次隨機產生的驗證碼為：");
		Q5 obj = new Q5();
		System.out.println(obj.genAuthCode());
	}
	
	public String genAuthCode() {
		List<Character> letters = new ArrayList<>();
		
		for(char c = '0'; c <= '9'; c++) { letters.add(c); }
		for(char c = 'A'; c <= 'Z'; c++) { letters.add(c); }
		for(char c = 'a'; c <= 'z'; c++) { letters.add(c); }
		
		// 打亂
		Collections.shuffle(letters);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 8; i++) {
			sb.append(letters.get(i));
		}
		
		return sb.toString();
	}
}
