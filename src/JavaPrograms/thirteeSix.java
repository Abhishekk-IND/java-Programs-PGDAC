package JavaPrograms;
import java.util.Scanner;

public class thirteeSix {
    static int fib(int n){
        if (n==1){
            return 0;
        }
        if (n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to print fibonacci series with recursion");
        System.out.print("please enter the number of elements to be printed: ");
        int n= sc.nextInt();
        System.out.print("Fibonacci series is : ");
        for (int i=1; i<=n; i++){
            System.out.print(fib(i) + " ");
        }

    }

}
