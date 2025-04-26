package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestTrain {
	public static void main(String[] args) {
		Train train1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train train2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train train3 = new Train(118, "自強", "高雄", "台北", 500);
		Train train4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train train5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train train6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train train7 = new Train(1254, "區間", "屏東", "基隆", 700);

		// 請寫一隻程式，能印出不重複的Train物件

		Set set = new HashSet();
		set.add(train1);
		set.add(train2);
		set.add(train3);
		set.add(train4);
		set.add(train5);
		set.add(train6);
		set.add(train7);

		Iterator objs = set.iterator();
		while (objs.hasNext()) {
			System.out.println(objs.next());
		}
		
		System.out.println("-------------------------------------");
		//• 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
		
		List<Train> list = new ArrayList<Train>();
		list.add(train1);
		list.add(train2);
		list.add(train3);
		list.add(train4);
		list.add(train5);
		list.add(train6);
		list.add(train7);
		
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			Train t = list.get(i);
			System.out.println(t);
		}
		System.out.println("-------------------------------------");
		//承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
		Set<Train> set2 = new TreeSet<Train>();
		set2.add(train1);
		set2.add(train2);
		set2.add(train3);
		set2.add(train4);
		set2.add(train5);
		set2.add(train6);
		set2.add(train7);
		
		for(Train t: set2) {
			System.out.println(t);
		}
	}
}
