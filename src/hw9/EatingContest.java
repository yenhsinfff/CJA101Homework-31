package hw9;

//開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//競賽過程。
public class EatingContest implements Runnable {
	String name;
	int counter = 1;

	public EatingContest(String name) {
		this.name = name;
	}

	public void run() {
		while (counter <= 10) {
			System.out.println(name + "吃第"+ counter + "碗飯");
			counter++;
			
			try {
				Thread.sleep((int) (Math.random() * (3000 - 500)) + 500);

			} catch (Exception e) {

			}
		}
		System.out.println(name + "吃完了！");
		
	}

	public static void main(String[] args) {
		System.out.println("-----大胃王快食比賽開始!-----");
		EatingContest e1 = new EatingContest("饅頭人");
		Thread player1 = new Thread(e1);
		EatingContest e2 = new EatingContest("詹姆士");
		Thread player2 = new Thread(e2);
		player1.start();
		player2.start();
			
		try {
			player1.join();
			player2.join();
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		System.out.println("-----大胃王快食比賽結束!-----");

	}
	
}
