package com.company;

<<<<<<< HEAD
import java.lang.reflect.Array;
=======
>>>>>>> fa271ac (Initial commit)
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] numArray = new String[6][];
        int largestSum = 0;
        for(int i=0; i<6; i++){
            numArray[i]=sc.nextLine().split(" ");
            System.out.println(Arrays.deepToString(numArray));
        }

        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
<<<<<<< HEAD
                //0 0 0 1 1 1   0+0+0 1
                //0 1 0 1 0 1
                //2 2 2 1 1 1
                //2 2 1 1 2 2
                //0 2 0 1 0 1
                //1 1 2 2 3 1
                int sum = Integer.parseInt(numArray[i][j])+Integer.parseInt(numArray[i][j+1])
                        +Integer.parseInt(numArray[i][j+2])+Integer.parseInt(numArray[i+1][j+1])
                        +Integer.parseInt(numArray[i+2][j])+Integer.parseInt(numArray[i+2][j+1])
                        +Integer.parseInt(numArray[i+2][j+2]);
=======
                int sum = Integer.parseInt(numArray[i][j])+Integer.parseInt(numArray[i][j+1])+
                        Integer.parseInt(numArray[i][j+2])+Integer.parseInt(numArray[i+1][j+1])+
                        Integer.parseInt(numArray[i+2][j])+Integer.parseInt(numArray[i+2][j+1])+
                        Integer.parseInt(numArray[i+2][j+2]);
>>>>>>> fa271ac (Initial commit)
                if(i==0 && j==0){
                    largestSum=sum;
                }else{
                    if(sum>largestSum){
                        largestSum=sum;
                    }
                }
            }
        }
        System.out.println(largestSum);
    }
}









