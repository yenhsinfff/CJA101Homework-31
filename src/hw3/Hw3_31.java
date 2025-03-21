package hw3;


import java.util.Arrays;
import java.util.Scanner;

public class Hw3_31 {
//	請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形。
//	(提示：Scanner，三角形成立條件，判斷式if else)
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int[] triangle= new int[]{a,b,c};
		Arrays.sort(triangle);

		if ((triangle[0] + triangle[1]) > triangle[2]) {
			if (triangle[0] == triangle[1]) {
				if (triangle[1] == triangle[2]) {
					System.out.println("正三角形");
				} 
				else {
					System.out.println("等腰三角形");
				}
			} else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("不是三角形");
		}
//	
//		請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//		對則顯示正確訊息。
//		(提示：Scanner，亂數方法，無窮迴圈)

		int i = (int) (Math.random() * 10);
		System.out.println("開始猜數字吧!");
		int num = sc.nextInt();
		while (i != num) {
			System.out.println("猜錯囉");
			num = sc.nextInt();
		}
		System.out.println("答對了!答案就是" + num);

//		阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//		厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//		的號碼與總數	
		System.out.println("阿文...請輸入你討厭哪個數字?");
		int dislike = sc.nextInt();
		int count = 0;
		for(int r = 1; r < 50; r++) {
			if(r % 10 == dislike || r / 10 == dislike ) {
				continue;
			}
			else {
				System.out.print(r + "  ");
				count++;
				if(count % 6 == 0) {
					System.out.println( );
				}
			}			
		}
		System.out.println("總共有"+ count + "個數字可選");
		sc.close();
	}
}
