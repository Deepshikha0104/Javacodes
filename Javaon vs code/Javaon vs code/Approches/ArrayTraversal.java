package Approches;
import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args) {
        // int[] n = {1,2,3,4,5};
        // for(int i =0;i<n.length;i++) {
        //     System.out.print(n[i]);
        // }
        // using java streams_________
        int[] n  = {1,2,3,4,5};
        Arrays.stream(n)
        .forEach(System.out::println);

        // __________________for Each
        // String[] fruits = {"Apple","Banana", "Cherry"};
        // for (String fruit : fruits) {
        //     System.out.println(fruit);
        // }
    }
}
