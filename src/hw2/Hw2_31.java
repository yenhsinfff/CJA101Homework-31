package hw2;

public class Hw2_31 {
	public static void main(String[] args) {
		// • 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int count = 0;
		int sum = 0;
		while (count <= 1000) {
			sum += count;
			count += 2;
		}
		System.out.println(sum);

		// • 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)

		int j = 1;
		for (int i = 1; i <= 10; i++) {
			j *= i;
		}

		System.out.println(j);

		// • 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)

		int k = 1, l = 1;
		while (k <= 10) {
			l *= k;
			k++;
		}
		System.out.println(l);

		// • 請設計一隻Java程式，輸出結果為以下：
		// 1 4 9 16 25 36 49 64 81 100
		int n = 1;
		for (int m = 1; m <= 10; m++) {
			n = m * m;
			System.out.print(n + " ");
		}
		System.out.println();


//		阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		
		System.out.print("可選擇的數字:");
		int count2 = 0;
		for (int num = 1; num <= 49; num++) {
			if(num % 10 == 4 || num / 10 == 4) {
			continue;
			}
			else {
				System.out.print(num+" ");
				count2++;
			}
			
		}
		System.out.println();
		System.out.println("總共有" + count2 + "個");
		
//		請設計一隻Java程式，輸出結果為以下：
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
		char a = 'A';
		for(int o = 1; o <= 6; o++) {
			for (int p = 1; p <= o ; p++) {
				System.out.print(a);
			}
			System.out.println();
		a++;
		}


			
		

	}
}

