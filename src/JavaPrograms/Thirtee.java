package JavaPrograms;
import java.util.Scanner;
import java.util.Arrays;

public class Thirtee{
    static int[] deleteElement(int[] arr, int deleteEle){
        int index=-1;
        for (int i=0; i<arr.length; i++){
            if (deleteEle==arr[i]){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("Element not found:");
            return arr;
        }
        int[] newArray= new int[arr.length-1];
        for(int i=0, j=0; i<newArray.length; i++){
            if(index==i){
                continue;
            }
            newArray[j]=arr[i];
            j++;
        }
        return newArray;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to delete element in array and return new array");
        System.out.print("please enter size of array: ");
        int size= sc.nextInt();
        int[] arr= new int[size];

        System.out.println("please enter the elements");
        for(int i=0; i<arr.length; i++){
            System.out.printf("enter %d th index element: ", i);
            arr[i]= sc.nextInt();

        }
        System.out.print("please enter the element you want to delete: ");
        int deleteEle=sc.nextInt();
        System.out.print("array elements are: ");
        System.out.println(Arrays.toString(arr));
        int[] arr2= deleteElement(arr,deleteEle );
        System.out.println("new array: "+ Arrays.toString(arr2));

    }

}