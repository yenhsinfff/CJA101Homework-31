package hw7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
//請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡(請使用
//append功能讓每次執行結果都能被保存起來)


public class Data {
	public static void main(String[] args) {
		int num = 0;
		try {

			FileOutputStream fos = new FileOutputStream("C:\\CJA101_Workspace\\Homework-31\\Data.txt", true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);

			
			for (int i = 1; i <= 10; i++) {
				num = ((int) (Math.random() * 1000) + 1);
				System.out.print(num + "  ");
				ps.print(num + "  ");
			}
			ps.print("\n");
			System.out.flush();
			ps.close();
			bos.close();
			fos.close();

			
				
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
}
