package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Sample {
	public static void main(String[] args) {

		String	str;
		int countLine = 0;
		int countChars = 0;
		File sample = new File ("C:\\CJA101_Workspace\\Homework-31\\Sample.txt");

		try {
			
			FileReader fr = new FileReader("C:\\CJA101_Workspace\\Homework-31\\Sample.txt");
			BufferedReader br = new BufferedReader(fr);
			while ((str = br.readLine()) != null) {
				countLine++;
				countChars += str.length();
			}
			System.out.println("Sample.txt檔案共有" + sample.length() + "個位元組，" + countChars + "字元，" + countLine + "列資料");			
			br.close();
			fr.close();

		} catch (IOException e) {
			System.out.println(e);
		}

	}
}
