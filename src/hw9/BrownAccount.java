package hw9;

class Account {
	private int balance = 0;

	synchronized public void deposit(int ntd) {
		while (balance > 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("因為熊大領10次了，媽媽讓帳戶餘額維持3000以上");
				break;
			}
		}

		balance += ntd;
		System.out.println("媽媽存了" + ntd + "，帳戶共有: " + balance);
		notifyAll();
	}

	synchronized public void withdraw(int ntd) {
		while (balance < ntd) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		balance -= ntd;
		System.out.println("熊大領了" + ntd + "，帳戶共有: " + balance);

		if (balance < 2000) { // 使用while，喚醒後再確認條件
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notifyAll();// 喚醒要存錢的人
		}

	}

}

class Mom extends Thread {
	Account account;

	public Mom(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (Thread.interrupted()) {
				System.out.println("媽媽發現熊大領10次了，不再繼續匯款");
				break;
			} else {
				account.deposit(2000);
			}
		}
	}
}

class Brown extends Thread {
	Account account;

	public Brown(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			account.withdraw(1000);
		}
		System.out.println("熊大領完10次了!");
	}
}

public class BrownAccount {
	public static void main(String[] args) {
		Account account = new Account();
		Mom mom = new Mom(account);
		Brown brown = new Brown(account);

		mom.start();
		brown.start();

		try {
			brown.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		synchronized (account) {
			account.notifyAll(); 
		}

		mom.interrupt();

	}
}
