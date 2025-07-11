import java.util.*;
public class Sort {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int fact=1;
    int m=sc.nextInt();
   for(int i=m;m>=i;i--){
   fact*=i;
   System.out.println("the factorial of 1 to m is: "+fact);
   sc.close();
   } 
}
}
