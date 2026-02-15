package JavaPrograms;
import java.util.Scanner;
public class Sixteen {

    static void fun(long number){
        long sum= 0;
        while(number !=0){
            sum = sum + number % 10;

            number = number /10;
        }
        System.out.println("the sum of diigits of a number is "+ sum    );
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("welcome to sum of digits of a number");
        System.out.print("please enter the number: ");

        long number= sc.nextInt();

        fun(number);
    }
}
