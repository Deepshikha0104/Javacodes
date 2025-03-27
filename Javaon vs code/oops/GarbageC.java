package oops;

class GarbageC {
    static int x,y;
    static {
        System.out.println("Inside Static Block");
        x =10;
        y =20;
    }
    static void display1() {
        System.out.println("Inside static method");
        System.out.println(x);
        System.out.println(y);
    }
    int p, q;
    {
    System.out.println("inside not static block");
    x = 111;
    y = 222;
    p = 232;
    q  = 434;
    }
    void display2() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(p);
        System.out.println(q);
    }
    public static void main(String[] args) {
        GarbageC.display1();
        GarbageC pr = new GarbageC();
        pr.display1();

    }

}
