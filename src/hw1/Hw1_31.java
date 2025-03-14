package hw1;

public class Hw1_31 {
	public static void main(String[] args) {
		// 請設計一隻Java程式，計算12，6這兩個數值的和與積
		int a = 12, b = 6;
		System.out.println(a + b);
		System.out.println(a * b);

		// 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)
		int egg = 200, doz = 12;
		System.out.println(egg + "顆蛋是" + (egg / doz) + "打" + (egg % doz) + "顆");
		// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int s = 256559, d = 3600 * 24;
		int day = s / d;
		int hr = (s % d) / 3600;
		int min = ((s % d) % 3600) / 60;
		int sec = ((s % d) % 60) % 60;
		System.out.println(s + "秒= " + day + "天" + hr + "小時" + min + "分" + sec + "秒");

		// 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		final double pi = 3.1415;
		int r = 5;
		double area = Math.pow(r, 2) * pi;
		double circumference = r * 2 * pi;
		// System.out.println("圓面積= " + area);
		// System.out.println("圓周長= " + circumference);
		System.out.printf("圓面積= %.4f%n", area);
		System.out.printf("圓周長= %.4f%n", circumference);

		/*
		 * 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本 金加利息共有多少錢 (用複利計算，公式請自行google)
		 */
		int pv = 1500000, n = 10;
		double rate = 0.02;
		double fv = pv * Math.pow((1 + rate), n);
		System.out.println("本金加利率= " + fv);

		/*
		 * 請寫一隻程式，利用System.out.println()印出以下三個運算式結果： 5 + 5 5 + ‘5’ 5 + “5”
		 * 並請用註解各別說明答案的產生原因
		 */
		System.out.println(5 + 5);
		// 兩值預設為整數，數值相加為10
		System.out.println(5 + '5');
		// 第一個5預設為整數，'5'視為字元，Unicode編碼為0035並轉換為十進位制53，兩值再相加
		System.out.println(5 + "5");
		// 第一個5預設為整數，"5"視為String，因此為串接相加

	}
}
