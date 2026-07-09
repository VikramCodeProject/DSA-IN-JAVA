package arrayss;

public class Ques1 {
    public static void main(String[]args){
        int[] arr={1,23,4,5,66,3};
        for(int i=0;i<arr.length;i++){
            if(i%2==1) arr[i]=arr[i]*2;
            else arr[i]=arr[i]+10;
            System.out.print(arr[i]+" ");
          
            }
        }

    }


