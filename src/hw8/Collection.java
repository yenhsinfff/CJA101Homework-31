package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//請建立一個Collection物件並將以下資料加入：
//Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//Object物件、“Snoopy”、BigInteger(“1000”)

//• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//• 移除不是java.lang.Number相關的物件
//• 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
public class Collection {
	public static void main(String[] args) {
		List<Object> collection = new ArrayList<>();
		collection.add(new Integer(100));
		collection.add(new Double(3.14));
		collection.add(new Long(21L));
		collection.add(new Short("100"));
		collection.add(new Double(5.1));
		collection.add("Kitty");
		collection.add(new Integer(100));
		collection.add(new Object());
		collection.add("Snoopy");
		collection.add(new BigInteger("1000"));

		// • 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		Iterator objs1 = collection.iterator();
		while (objs1.hasNext())
			System.out.print(objs1.next() + " ");

		System.out.println("");
		System.out.println("----------------------------------------------------------------------------");

		for (int i = 0; i < collection.size(); i++) {
			Object obj1 = collection.get(i);
			System.out.print(obj1 + " ");
		}

		System.out.println("");
		System.out.println("----------------------------------------------------------------------------");

		for (Object obj2 : collection) {
			System.out.print(obj2 + " ");
		}

		System.out.println("");
		System.out.println("----------------------------------------------------------------------------");

		// • 移除不是java.lang.Number相關的物件
		Iterator objs2 = collection.iterator();
		while (objs2.hasNext()) {
			Object obj3 = objs2.next();
			if (obj3 instanceof Number) {
				objs2.remove();
			} else {
				System.out.print(obj3 + " ");
			}

		}

	}

}
