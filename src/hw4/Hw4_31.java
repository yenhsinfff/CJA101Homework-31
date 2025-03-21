package hw4;

import java.time.LocalDate;
import java.util.Scanner;

public class Hw4_31 {

//	有個一維陣列如下：
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示：陣列，length屬性)	
	public static void main(String[] args) {
		int[] array = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		for (int i1 = 0; i1 < array.length; i1++) {
			sum += array[i1];
		}
		int average = sum / array.length;
		System.out.println("平均值為" + average);
		for (int i2 = 0; i2 < array.length; i2++) {
			if (array[i2] > average) {
				System.out.print(array[i2] + " ");
			}
		}
		System.out.println("");
		System.out.println("===========");
//	請建立一個字串，經過程式執行後，輸入結果是反過來的
//	例如String s = “Hello World”，執行結果即為dlroW olleH
//	(提示：String方法，陣列)	
		String s1 = "Hello World";
		String s2 = "";

		for (int i3 = s1.length() - 1; i3 >= 0; i3--) {
			s2 += s1.charAt(i3);
		}
		System.out.println(s2);

		System.out.println("===========");
//	有個字串陣列如下(八大行星)：
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
//	(提示：字元比對，String方法)
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		String vowels = "aeiou";
		int countvowels = 0; // 母音出現次數

		for (int p = 0; p < planets.length; p++) { // 輪流看每個元素中的字串
			String planet = planets[p]; // 取出對應字串
			int count3 = 0; // 紀錄字串內母音數量

			for (int i = 0; i < planet.length(); i++) {
				char ch = planet.charAt(i); // 取出字元
				if (vowels.indexOf(ch) != -1) { // 檢查字元是否為母音，使用indexOf，若不在比對字串中會回傳-1，
					count3++;
				}
			}
			System.out.println(planet + "中的母音數量:" + count3);
			countvowels += count3;
		}
		System.out.println("八大行星中的母音總數為" + countvowels);

		
		System.out.println("===========");
//	阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5 個,其員工編號與身上現金列
//	表如下：
//	請設計一個程式,可以讓阿文輸入欲借的金額後,便會顯示哪些員工編號的同事
//	有錢可借他;並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的
//	員工編號: 25 19 27 共3 人!」
//	(提示：Scanner，二維陣列	)
		int colleague[][] = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		System.out.println("請輸入想借的金額");
		Scanner sc = new Scanner(System.in);
		int borrow = sc.nextInt();

		int count = 0;
		System.out.print("有錢可借的員工編號: ");
		for (int i3 = 0; i3 < colleague.length; i3++) {
			for (int i4 = 0; i4 < colleague[i3].length; i4++) {
				if (colleague[i3][i4] >= borrow) {
					count++;
					System.out.print(colleague[0][i4] + " ");
				}
			}
		}
		System.out.println("共" + count + "人!");
		System.out.println("===========");
//	請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//	例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//	(提示1：Scanner，陣列)
//	(提示2：需將閏年條件加入)
//	(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
		
		System.out.println("請輸入三個整數");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();

		int normal[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int leap[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		
		if (month >= 1 || month <= 12) {
			if (year % 4 == 0 && year % 100 != 0) {
				if (day > leap[month - 1]) {
					System.out.println("錯誤輸入");
					return;
				}
			} else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
				if (day > leap[month - 1]) {
					System.out.println("錯誤輸入");
					return;
				}
			} else {
				if (day > normal[month - 1]) {
					System.out.println("錯誤輸入");
					return;
				}
			}

		} else {
			System.out.println("錯誤輸入");
			return;
		}
		
		LocalDate date = LocalDate.of(year, month, day);
		int dayOfYear = date.getDayOfYear();
		System.out.println("輸入的日期為該年第"+ dayOfYear + "天");

		System.out.println("===========");
//		班上有8位同學，他們進行了6次考試結果如下：
//		請算出每位同學考最高分的次數
//		(提示：二維陣列)
		int student[][] = { { 10, 37, 100, 77, 98, 90 }, //1號成績
							{ 35, 75, 70, 95, 70, 80 },  //2號成績
							{ 40, 77, 79, 70, 89, 100 }, //3號成績
							{ 100, 89, 90, 89, 90, 75 },  //4號成績
							{ 90, 64, 75, 60, 75, 50 },  //5號成績
							{ 85, 75, 70, 75, 90, 20 }, //6號成績
							{ 75, 70, 79, 85, 89, 99 },  //7號成績
							{ 70, 95, 90, 89, 90, 75 } }; //8號成績
// student[座號][第幾次考試]
		int number;
		int test;
		
		int testCount = student[0].length; //考試次數。使用陣列的陣列 的長度
		int studentCount = student.length;
		
		int [] highestScoreCount =  new int [studentCount]; //記錄學生考最高的次數
		
		for(test = 0;  test < testCount; test++ ) {
			int top = student[0][test]; //預設每次考試1號同學的分數為最高
			int topStudent = 0; //預設每次考次1號同學為最高分
			for(number = 1; number < studentCount; number++) {
				if( student[number][test] > top) {
					top = student[number][test]; //更新最大值
					topStudent = number; //紀錄分數最高者是誰
				}				
			}
			
			highestScoreCount[topStudent]++;
			System.out.println("第"+ (test+1) + "次考試分數最高者為" + (topStudent+1));
		}
		System.out.println("");
		System.out.println("每位學生最高分的次數為: ");
		for(int TopCount = 0; TopCount < studentCount; TopCount++) {
			System.out.println((TopCount+1)+"學生考最高分的次數為"+ highestScoreCount[TopCount]);
		}	
		sc.close();
	}

}
