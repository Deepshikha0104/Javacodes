package dsa.practice;
import java.util.*;

public class ListvsSet {

	public static void main(String[] args) {
		List<String> lst = new LinkedList<String>();
		lst.add("red");
		lst.add("black");
		lst.add("white");
		lst.add("yellow");
		lst.add(null);
		lst.add("orange");
		lst.add(null);
		System.out.println("List"+ " "+lst);
		Set<String> set = new HashSet<String>();
		set.add("Red");
		lst.add("White");
		lst.add("black");
		lst.add("yellow");
		lst.add(null);
		lst.add("orange");
		lst.add(null);
		System.out.println("Set"+ " "+set);
	}
}
