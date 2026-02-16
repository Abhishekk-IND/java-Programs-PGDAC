package JavaPrograms;
import java.util.Scanner;

public class Twenty {

    static void fun(int number){
        int newNum=0;
        while(number>0){
            int factor= number%10;
            number /=10;
            newNum = newNum * 10 +factor;

        }
        System.out.println("your reverse number is : "+ newNum);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to reverse the digits of a number");
        System.out.print("please enter the numberr: ");

        int number= sc.nextInt();
        fun(number);
    }
}
