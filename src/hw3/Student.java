package hw3;

public class Student {
	int score = 90;
	
	public void play(int hours) {
		score -= hours;
	}
	public void study(int hours) {
		score += hours;
	}
	
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		System.out.println(student1.score);
		System.out.println(student2.score);
		
		student1.play(2);
		student1.study(6);
		
		student2.play(5);
		student2.study(2);
		
		System.out.println("=========");
		
		System.out.println(student1.score);
		System.out.println(student2.score);
	}
}
