package JavaPrograms;
import java.util.Scanner;

public class TwentyEight{
    static int min(int[] arr){
        int minimumElement=10000;
        for (int i=0; i<arr.length; i++){
            if (arr[i]<minimumElement){
                minimumElement=arr[i];
            }
        }
        return minimumElement;
    }
    static int max(int[] arr){
        int maximumElement=0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>maximumElement){
                maximumElement=arr[i];
            }
        }
        return maximumElement;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to print max and min with arrays");
        System.out.print("enter array size: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        for (int i=0; i<n; i++){
            System.out.printf("please enter the %d th index element: ", i);
            arr[i]=sc.nextInt();
        }
        System.out.print("your array elements : ");
        for (int newArray: arr){
            System.out.print(newArray + " ");
        }
        System.out.println();
        int maximumElement= max(arr);
        int minimumElement= min(arr);

        System.out.println("maximum element of the array is : "+ maximumElement);
        System.out.println("minimum element of the array is : "+ minimumElement);

    }
}