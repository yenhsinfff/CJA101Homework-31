package hw2;

public class TestNine {
	public static void main(String[] args) {

		// 使用for迴圈+while迴圈

		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				int sum = i * j;
				System.out.print(j + "*" + i + "=" + sum + "\t");
				j++;
			}
			System.out.println();
		}
		System.out.println();

		// 使用for迴圈+do while迴圈

		for (int i = 1; i <= 9; i++) {
			int j = 1;
			do {
				int sum = i * j;
				System.out.print(j + "*" + i + "=" + sum + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
		}
		
		System.out.println();
		
		// 使用while迴圈+do while迴圈

		int i = 0; 
		while (i <= 8) {
			++i;
			int j = 1;
			while (j <= 9) {
				int sum = i * j;
				System.out.print(j + "*" + i + "=" + sum + "\t");
				j++;
			}
			System.out.println();
		}		
	}
}
