package hw5;

public class RandAvg {
//	 請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
	public void randAvg() {
		int min = 10;
		int max = 50;
		int sum = 0;
		int avg = 0;
		
		System.out.println("本次亂數結果:");
		for(int i = 1; i <= 10; i++) {
			int random = (int)(Math.random() * (max - min + 1) + min);
			System.out.print(random + " ");
			sum += random;
		}
		
		avg = sum/10;
		System.out.println();
		System.out.println(avg);
	}
	public static void main(String[] args) {
		RandAvg random = new RandAvg();
		random.randAvg();
	}
}
