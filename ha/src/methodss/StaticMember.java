package methodss;

public class StaticMember {
	public static void test() {
		System.out.println("From-Test()");
	}
	public static int sum(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println("main starte");
		test();
		System.out.println(sum(20,10));
		System.out.println("Main End");
	}
}


