package chapter6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex6_1 {
	public static void main(String args[]) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(3));
		list1.add(new Integer(2));
		list1.add(new Integer(1));

		ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(2, 4));
		System.out.println("1 : " + list1);
		System.out.println("1 : " + list2);

		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println("2 : " + list1);
		System.out.println("2 : " + list2);
		System.out.println(list1.containsAll(list2));
		System.out.println(list2.containsAll(list1));
		list2.add(4);
		list2.add(7);
		System.out.println("3 : " + list1);
		System.out.println("3 : " + list2);

		list2.add(2, 11);
		System.out.println("4 : " + list1);
		System.out.println("4 : " + list2);

		list2.set(2, 33);
		System.out.println("5 : " + list1);
		System.out.println("5 : " + list2);


		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(new Integer(5));
		set1.add(new Integer(4));
		set1.add(new Integer(3));
		set1.add(new Integer(2));
		set1.add(new Integer(1));
		for (Iterator iterator = set1.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
		}
		Iterator<Integer> iterator = set1.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			
		}
		for (Integer integer : set1) {
			
		}
		
		
	}

}
