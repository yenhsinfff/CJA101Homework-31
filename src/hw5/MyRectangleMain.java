package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle r1 = new MyRectangle();
		r1.setWidth(10);
		r1.setDepth(20);
		System.out.println(r1.getArea());
		
		MyRectangle r2 = new MyRectangle(10, 20);
		System.out.println(r2.getArea());
		
	}
}
