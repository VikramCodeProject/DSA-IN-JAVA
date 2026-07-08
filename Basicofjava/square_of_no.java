import java.util.Scanner;
public class square_of_no {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int a=sc.nextInt();
        a = a*a;
        System.out.println("Square of no: ");
        System.out.println(a);
    }
}

