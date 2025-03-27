package hw5;

import java.util.Scanner;

//• 請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如
//圖：

public class StarSquare {
	public void starSquare(int width, int height) {
		for (int h = 1; h <= height; h++) {
			for (int w = 1; w <= width; w++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		System.out.println("請輸入寬與高:");
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		StarSquare square = new StarSquare();
		square.starSquare(w, h);
		sc.close();
	}
}
