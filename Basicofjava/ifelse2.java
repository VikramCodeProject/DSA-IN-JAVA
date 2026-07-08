import java.util.Scanner;

public class ifelse2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER: ");
        int a = sc.nextInt();
        if(a>=0){
            System.out.println(a);
        }else{
            System.out.println(-a);
        }

    }
}
