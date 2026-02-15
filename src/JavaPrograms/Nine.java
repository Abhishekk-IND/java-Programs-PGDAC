package JavaPrograms;
import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to fing greatest of three numbers");

        System.out.print("please enter the first number: ");
        int first= sc.nextInt();

        System.out.print("please enter the second number: ");
        int second= sc.nextInt();

        System.out.print("please enter the third number: ");
        int third= sc.nextInt();

        if (first > second && first > third){
            System.out.printf("the first number %d is greatest number", first);
        } else if(second>first & second >third){
            System.out.printf("the second number %d is greatest number", second);
        } else {
            System.out.printf("the third number % d is greatest number", third);
        }
    }
}
