package arrayss;

import java.util.Scanner;

public class Inputinarrays {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner
        System.out.println("Enter the elements of array: ");

        int vikram[]=new int[5]; //Array of size 5

        for(int i=0;i<5;i++){  //input in array
            vikram[i] =sc.nextInt();

        }
            //Know printing the array
            for(int i=0;i<5;i++){
                System.out.print(vikram[i]+" ");
            }


        }
    
}
