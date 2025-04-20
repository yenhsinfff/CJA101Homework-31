package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//代表的檔案會複製到第二個參數代表的檔案

public class CopyFile {
	public static void main(String[] args) throws IOException {
		File inputFile = new File("C:\\CJA101_Workspace\\Homework-31\\input.txt");
		if (!inputFile.exists()) {
			inputFile.createNewFile();
		}
		File outputFile = new File("C:\\CJA101_Workspace\\Homework-31\\output.txt");
		if (!outputFile.exists()) {
			outputFile.createNewFile();
		}

		FileInputStream fis = new FileInputStream(inputFile);
		FileOutputStream fos = new FileOutputStream(outputFile);
		int c;

		while ((c = fis.read()) != -1) {
			fos.write(c);
			System.out.println((char) c);
			System.out.flush();
		}

		fis.close();
		fos.close();

	}

}
