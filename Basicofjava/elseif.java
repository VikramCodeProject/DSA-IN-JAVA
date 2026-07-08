import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No: ");
        int n = sc.nextInt();
        
        if(n%5==0){
            System.out.println("Riya");
        }else if(n%3==0){
            System.out.println("Banu");          //isme jo condition pehle aayegi uske hisab se output aayega, agar 5 se divisible hoga to Riya print hoga, agar 3 se divisible hoga to Banu print hoga, agar dono se divisible hoga to Apurva print hoga, agar dono se divisible nahi hoga to Isha print hoga, aur agar koi bhi condition satisfy nahi hoti hai to Invalid program print hoga  
        }else if(n%5==0&&n%3==0){
            System.out.println("Apurva");
        }else if(n%5 !=0 && n%3 != 0){
            System.out.println("Isha");
        }else
        System.out.println("Ivalid program");
    }
}