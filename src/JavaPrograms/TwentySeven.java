package JavaPrograms;
import java.util.Scanner;
public class TwentySeven {
    static int findElement(int[] arr, int element){
        int total=0;
        for (int i=0; i<arr.length; i++){
            if (element == arr[i]){
                total ++;
            }
        }
        return total;
    }
    public static void main(String[] args){
        System.out.println("welcome to print no of orrurences of an element in array");
        int[] arr= {2, 6, 1, 3,6,7,5,3,2,6,8,9,1,1,4,2,1,1,1};
        int element = 1;
        int total =findElement(arr, element);
        System.out.printf("%d time the number %d occur in this array", total, element);
    }
}
