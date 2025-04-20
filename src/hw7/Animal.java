package hw7;

import java.io.*;

//請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料

//承上題，請寫一個程式，能讀取Object.ser這兩個物件，並執行speak()方法觀察結果如何(請利用多
//型簡化本題的程式設計)

public class Animal implements Serializable{
	private String name;
	
	public Animal() {
		
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void speak() {
	}
	
	public static void main(String[] args) throws Exception {
		File dir = new File("C:\\data"); //建立資料夾
		if(!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File("C:\\data\\Object.ser"); //建立Object.ser
		Animal[] animals = new Animal[2];
		animals[0] = new Dog("狗");
		animals[1] = new Cat("貓");

		// 輸出物件
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < animals.length; i++) {
			oos.writeObject(animals[i]);
		}
		oos.close();
		fos.close();
		
		//輸入(讀取)
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			while (true) {
				((Animal)ois.readObject()).speak();
			}
		}catch(EOFException e) {
			System.out.println("資料讀取完畢");
		}
		ois.close();
		fis.close();
	}
	
}
