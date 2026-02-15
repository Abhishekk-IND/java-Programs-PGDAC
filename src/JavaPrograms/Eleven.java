package JavaPrograms;
import java.util.Scanner;
public class Eleven {
    public static void main(String[] args) {
        System.out.println("welcome to shows bitwise compliment of a numbers");
        Scanner sc= new Scanner(System.in);

        System.out.print("please enter the first number= ");
        int first= sc.nextInt();



        int result = ~first;
        System.out.printf("the compliment of this %d number is : %d", first, result);



    }
}
