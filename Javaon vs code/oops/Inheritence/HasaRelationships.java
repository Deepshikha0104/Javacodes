package oops.Inheritence;

public class HasaRelationships {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        lap.os.osWork();
        Charger chgr = new Charger();
        lap.hasA(chgr);
        chgr.color = "Balck";
        chgr.charge(); 
    }
}
