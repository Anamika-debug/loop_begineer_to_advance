import java.util.* ;

public class Anam{

    public static void main(String args[]){
        int arr1[] = {1,4,4,7,9};
        System.out.println("largest element is" + findTheLargest(arr1));
        int arr2[] = {1,8,9,10,12}; 
        System.out.println("largest element is" + findTheLargest(arr2));

    }

    static int findTheLargest(int arr[]){
        int max = arr[0];

        for (int i = 0 ; i < arr.length ; i++){
            max = arr[i];
        }
        return max; 
    }
}