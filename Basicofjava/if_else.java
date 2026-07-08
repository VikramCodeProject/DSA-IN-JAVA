import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        System.out.println("ENTER NUMBER: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("EVEN NUMBER");
        }else{
            System.out.println("ODD NUMBER");
        }
    }
    
}
