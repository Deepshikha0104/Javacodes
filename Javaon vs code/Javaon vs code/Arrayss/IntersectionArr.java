

package Arrayss;

public class IntersectionArr {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,5,6,7};
        int[] arr2 = {2,3,5};
        System.out.println("Intersection: ");

        int i=0;
        int j=0;

        while (i<arr1.length && j<arr2.length) {
            if(arr1[i]==arr2[j]){
                System.out.println(arr1[i]+ " ");
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
            
        }
    }
}
