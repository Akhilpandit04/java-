//wap to intialise and print the array.
import java.util.*;
public class ArrayDisplay{
public static void main(String[] args){
   int n;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the range of an array:    ");
   n=sc.nextInt();
   int a[]=new int[n];
   for(int i=0;i<n;i++){
       a[i]=i;
       System.out.print(a[i]+" ");
   }
   
}
}