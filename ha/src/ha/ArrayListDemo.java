package ha;
import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add("Deep");
		a1.add(true);
		a1.add(5.36);
		a1.add(99);
		System.out.println(a1);
//		System.out.println(a1.get(2));
		
		a1.add(2,"Alia");
		System.out.println(a1);
		
		a1.set(3,false);
		System.out.println(a1);
		
	}

}
