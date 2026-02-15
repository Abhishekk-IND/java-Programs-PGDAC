package JavaPrograms;
import java.util.Scanner;
public class Eight {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to find odd even number programm");

        System.out.print("please enter the number: ");
        int number= sc.nextInt();

        if (number%2 ==0){
            System.out.println("your number is even");
        } else {
            System.out.println("your number is odd");
        }
    }
}
