import java.util.Scanner;

public class User_Defined_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no");
        int n=sc.nextInt();
        int[]num= new int[n];

        //user input;
        for(int i=0;i<n;i++){
            System.out.println("Enter thr value of" + i +"th index");
            int x =sc.nextInt();
            num[i]=x;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]+' ');
            
        }
    }
    
}
