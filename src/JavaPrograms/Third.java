package JavaPrograms;
import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("please enter first number: ");
        int firstNum= sc.nextInt();
        System.out.print("please enter second number: ");
        int secondNUm= sc.nextInt();
        System.out.printf("your sum is : %d", firstNum+secondNUm);
    }

}
