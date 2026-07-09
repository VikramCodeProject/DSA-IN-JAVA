package arrayss;

public class prooductofarr {
    
    public static void main(String[]args){
        int[] arr ={2,3,6,7};
       int product = 1;
       for(int i=0;i<arr.length;i++){
        product*=arr[i];
        
       }
      System.out.print(product+" ");



    
}
}