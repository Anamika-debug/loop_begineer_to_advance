import java.io.*;
import java.util.Arrays;
public class SecLargeSmall{
    if (n == 0 || n==1)
	{
		System.out.print(-1);
		System.out.print(" ");
		System.out.print(-1);
		System.out.print("\n");
	}


    static private void getElement(int arr[] ,int n){
        Arrays.sort(arr);
        int small = arr[1];
        int sec = arr[n-1];
        System.out.println("2nd smallest element is"+ small + "2nd largest element is" + sec);

    }
    public static void main(String[] args){
        int[] arr = {2,5,6,7,9,3};

        int n = arr.length;
        getElement(arr, n);
    }
}