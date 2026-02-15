package JavaPrograms;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Fifth {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to area of a triangle programm");

        System.out.print("please enter the Breadth : ");
        int breadth= sc.nextInt();

        System.out.print("please enter the width : ");
        int width= sc.nextInt();

        int areaOfTriangle= 1* breadth*width/2;
        System.out.printf("area of triangle is: %d", areaOfTriangle);


    }
}
