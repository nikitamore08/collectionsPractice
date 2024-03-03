package list;

import java.util.*;

public class demo1 {

	public static void main(String args[]) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "niki");
		map.put(2, "jaya");
		map.put(3, "geeta");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {

			System.out.println(entry.getKey());

		}
	}

}
