package exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ConcurrentModificationException;
public class Demo2 {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> al=new CopyOnWriteArrayList<String>();
		al.add("abcd");
		al.add("adbcv");
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			al.add("ass");
			System.out.println(itr.next());
		}
		
//		for(String s:al)
//		{
//			al.remove(0)
//			System.out.println(s);
//		}

	}

}
