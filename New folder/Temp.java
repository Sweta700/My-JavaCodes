 
 import java.util.*;
 public class Temp {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int a=0,b=1;
   int n=sc.nextInt();
   do{
      for(int i=1;i<=n;i++){
    System.out.print(a+" ");
  int temp =a;
   a=b;
   b=temp+a;
      }
   } while(a>b);
   sc.close();
}
}
