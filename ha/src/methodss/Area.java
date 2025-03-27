package methodss;

public class Area {
	int l;
	int b;
	public Area(int l,int b){
		this.l = l;
		this.b=b;
	}
	public int Area() {
		return l*b;
	}
	public static int Area(int l,int b) {
		return l*b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a1= new Area(45,70);
		System.out.println(a1.Area(a1.l,a1.b));
		Area a2 = new Area(2,6);
		System.out.println(a2.Area(a2.l,a2.b));
		System.out.println(a1.Area());
		System.out.println(a2.Area());
	}
}
