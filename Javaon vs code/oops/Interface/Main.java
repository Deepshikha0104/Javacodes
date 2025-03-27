package oops.Interface;

public class Main {
    public static void main(String[] args) {
        robotMethods(new TeacherRobot());
        robotMethods(new DoctorRobot());
    }
    static void robotMethods(Robot robo) {
        robo.work();
        robo.charge();
    }
}
