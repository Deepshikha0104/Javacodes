package Arrayss;

public class UnionArr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,6,7,8,9};

        int i=0;
        int j=0;
        while (i<arr1.length && j<arr2.length) {
            if(arr1[i]==arr2[j]){
                System.out.println(arr1[i] + " , ");
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                System.out.println(arr1[i] + " , ");
                i++;
            }
            else{
                System.out.println(arr2[j] + " , ");
                j++;
            }
        }
        while(j<arr2.length){
            System.out.print(arr2[j] + " , ");
            j++;
        }
    }
}
