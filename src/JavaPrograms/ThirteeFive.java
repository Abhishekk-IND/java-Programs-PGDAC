package JavaPrograms;

public class ThirteeFive {
    static void sumAndAverage(int[][] arr){
        int sum=0;
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){

                sum = sum+ arr[i][j];
                count++;

            }
        }
        int average= sum/count;
        System.out.printf("sum is : %d \n", sum);
        System.out.printf("average is: %d", average);


    }

    public static void main(String[] args){
        System.out.println("welcome to sum and average in 2-d array");
        int[][] arr= {{3,5,7},{65,22,55},{36,76,32}};
        sumAndAverage(arr);

    }

}
