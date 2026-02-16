package JavaPrograms;
import java.util.Scanner;

public class TwentyThree {
    static int palindrome(int number){
        int newNum=0;
        while(number>0){
            int factor= number %10;
            newNum= newNum*10 + factor;
            number /= 10;
        }
        return newNum;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to check the palindrome of a number");
        System.out.print("please enter the number: ");
        int number= sc.nextInt();
        int result = palindrome(number);
        if (result == number ){
            System.out.println("the number is paildrome ");

        } else{
            System.out.println("the number is not palindrome");
        }
    }

}
