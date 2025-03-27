//package ha;
public class Information {
	int stdid;
	String name;
	int age;
	public Information() {
	}
	public Information(int stdid) {
		this.stdid = stdid;
	}
	public Information(int stdid,String name) {
		this.stdid = stdid;
		this.name = name;
	}
	public Information(int stdid,String name,int age) {
		this.stdid = stdid;
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Information S = new Information();
		Information S1 = new Information(1245);
		Information S2 = new Information(1245,"Shikha",15);
	}
}
