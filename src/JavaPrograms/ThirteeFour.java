package JavaPrograms;
import java.util.Scanner;

public class ThirteeFour {

    public static void main(String[] args) {

        System.out.println("Welcome to search element in 2-D array");

        int[][] arr = {
                {6, 4, 7},
                {2, 45, 75},
                {22, 56, 74}
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the element you want to search: ");
        int number = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == number) {
                    System.out.println("Element found at row " + i + " column " + j);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
