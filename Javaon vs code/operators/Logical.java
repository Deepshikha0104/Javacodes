package operators;

public class Logical {
    public static void main(String[] args) {
    //_____________ first_________________
        var hasFuel = true;
        var isWeatherGood = true;
        var canGoForDrive = hasFuel && isWeatherGood;
        System.out.println("Can we go for a drive? " + canGoForDrive);  // true
//    __________2nd___________________
        var isWeekend = true;
        var isHoliday = false;
        var canRelax = isWeekend || isHoliday;
        System.out.println("Can I Relax today? " + canRelax); //true
        // _______________3rd______________________

        var isRaining = false;
        var isNotRaining = !isRaining;
        System.out.println("Is it not raining? " + isNotRaining);
        // ____________________4th___________________
        // var hasFue = true;
        // var isWeatherGoo  = true;
        // var hasTime = false;
        // var canGoForDriv = hasFue && isWeatherGoo && hasTime;
        // System.out.println(canGoForDriv);
        // ________________________5th______________
        // int x = 5;
        // boolean result = !(x > 10);
        // System.out.println(result); //true
        // ___________________6th___________________
        // boolean a = true;
        // boolean b = false;
        // boolean c = a || b;
        // System.out.println(c); //true
        // _____________________7th_______________
        // boolean a = false;
        // boolean b = false;
        // boolean c = a && (b = true);
        // System.out.println(c + ", " + b);  //false, false
// ____________________________-8th_________________
//        System.out.println(true && false); //false
//    System.out.println(true || false);      //true

    }
}
