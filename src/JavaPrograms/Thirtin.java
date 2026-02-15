package JavaPrograms;
import java.util.Scanner;

 class Multiplication{

    public void fun(int num){
        for(int i =1; i<=10; i++){
            System.out.printf("%d X %d = %d ", num, i, num*i);
            System.out.println();
        }
    }
        }
public class Thirtin {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        Multiplication ml= new Multiplication();
        System.out.println("welcome to multiplication table programm ");
        System.out.print("please enter the number: ");

        int num= sc.nextInt();
        ml.fun(num);
    }


}
