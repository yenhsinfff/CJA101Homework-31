package hw5;

public class Overloading {

//	利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//	可以找出二維陣列的最大值並回傳

	public void maxElement(int x[][]) {
		int intMax = 0;
		for (int i = 0; i < x.length; i++) {
			for (int i2 = 0; i2 < x[i].length; i2++) {
				if (x[i][i2] > intMax) {
					intMax = x[i][i2];
				}

			}
		}
		System.out.println(intMax);
	}

	public void maxElement(double x[][]) {
		double doubleMax = 0;
		for (int i = 0; i < x.length; i++) {
			for (int i2 = 0; i2 < x[i].length; i2++) {
				if (x[i][i2] > doubleMax) {
					doubleMax = x[i][i2];
				}

			}
		}
		System.out.println(doubleMax);
	}

	public static void main(String[] args) {
		Overloading o = new Overloading();
		int intArray[][] = { { 2, 3, 8 }, { 5, 12, 7 } };
		o.maxElement(intArray);
		double doubleArray[][] = { { 2.1, 3.3, 4.5 }, { 5.6, 9, 7.3 } };
		o.maxElement(doubleArray);
	}
}
