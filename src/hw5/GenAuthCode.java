package hw5;

public class GenAuthCode {
//	 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//	 genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//	 與數字的亂數組合，如圖：
	public void genAuthCode() {
		char c = 0;
		for (int i = 1; i <= 8; i++) {
			int type = (int) (Math.random() * 3 + 1);
			
			
			switch(type){
			case 1:
				c = (char) (Math.random()*26 + 'A');
				System.out.print(c);
				break;
			case 2:
				c = (char) (Math.random()*26 + 'a');
				System.out.print(c);
				break;
			case 3: 
				c = (char)(Math.random()*10 + '0');
				System.out.print(c);
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		GenAuthCode code = new GenAuthCode();
		code.genAuthCode();
	}
}
