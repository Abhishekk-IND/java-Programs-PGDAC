package JavaPrograms;
import java.util.*;

public class TwentyTwo {
    static int power(int last, int length){
        int result =1;
        for (int i=1; i<=length; i++){
            result = result *last;
        }
        return result;
    }
    static int armstrong(int number){
        int length=len(number);
        int total=0;
        for (int i=1; i<=length; i++){
           int last = number % 10;
           total= total +power(last, length);
           number = number/10;
        }
        return total;


    }
    static int len(int number){
        int num=0;
        while(number >0){
            number = number / 10;
            num ++;
        }
        return num;
    }


    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to find armstrong number");
        System.out.print("please enter the number: ");
        int number= sc.nextInt();
        int result = armstrong(number);

        if (result== number){
            System.out.println("the number is armstrong nubmer");

        }else {
            System.out.println("not armstrong number");
        }
    }

}
