package oops.Inheritence;

public class Laptop {
    //create object of os
    Os os = new Os();
    //method to connect with
    void hasA(Charger ch) {
        ch.color = "Grey";
        ch.charge();
    }
}
