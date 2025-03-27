//package ha;

class Student{
	int roll;
	char grade;
	double per;
}
public class Methodds {
	public static void main(String[] args) {

		Student s = new Student();
		s.roll=10;
		s.grade = 'A';
		s.per  = 56.4;
		System.out.println(s.roll+" "+s.grade+" "+ s.per);
	}
}
