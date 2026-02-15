package JavaPrograms;
import java.util.Scanner;
public class Sixth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to simple inetest programm");
        System.out.print("please enter the principle amount : ");
        long p = sc.nextInt();
        System.out.print("please enter the time in year: ");
        int t= sc.nextInt();
        System.out.print("please enter the Rate value: ");
        int r= sc.nextInt();

        long simpleInterest = (p*t*r)/100;

        System.out.printf("simple interest is : %d", simpleInterest);
    }
}
