import java.util.*;
public class Anam{
public static void main(String args[]){

     
     int arr1[] = {1,4,7,8,10};
     System.out.println("The Largest element in the array is: " + sort(arr1));
     int arr2[] = {10,5,9,2,20};
   System.out.println("The Largest element in the array is: " + sort(arr2));
}
     static int sort(int arr[]){
        Arrays.sort(arr);

        return arr[arr.length - 1];
     }
}
