package JavaPrograms;

import java.util.Scanner;
public class TwentySix {
    static int average(int s, int[] arr){
        int ave= s / arr.length;
        return ave;

    }

    static int sum(int[] arr){
        int total=0;
        for (int i=0; i<arr.length; i++){
            total = total +arr[i];
        }
        return total;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to print sum and average of all element of an array");
        int[] arr= {10, 2,6, 18, 11, 26,37};
        int s=sum(arr);
        int a= average(s, arr);
        System.out.println("your sum is : "+ s);
        System.out.println("average is : "+ a);
    }
}
