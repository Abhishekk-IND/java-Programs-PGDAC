package JavaPrograms;
import java.util.Scanner;
public class Fourth {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("please enter the first number: ");
        int first= sc.nextInt();
        System.out.print("please enter the second number: ");
        int second = sc.nextInt();
        System.out.print("please enter the operation symbol + , - , *, /  =   ");
        char symbol= sc.next().charAt(0);

            if (symbol == '+') {
                System.out.printf("%d + %d= %d", first, second, (first + second));
            } else if (symbol == '-') {
                System.out.printf("%d - %d = %d", first, second, (first - second));
            } else if (symbol == '/') {
                System.out.printf("%d / %d = %d", first, second, (first / second));
            } else if (symbol == '*') {
                System.out.printf("%d * %d = %d", first, second, (first * second));
            } else {
                System.out.print("you entered wrong symbol , please check once");
            }


    }

}
