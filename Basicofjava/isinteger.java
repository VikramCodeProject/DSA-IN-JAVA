import java.util.Scanner;

public class isinteger {
       public static void main(String[] args) {
        System.out.println("ENTER NUMBER: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int x=(int)a;
        if(a-x==0){
            System.out.println("Is an integer");
        }else{
            System.out.println("Not an integer");
        }
    
            
        }
    
}
