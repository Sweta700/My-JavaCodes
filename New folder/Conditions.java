 import java.util.Scanner;
 
 public class Conditions {
    public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   sc.close();

   int a = sc.nextInt();
   if(a%2==0){
    System.out.println("Even");
   } else{
    System.out.println("Odd");
   }

    }

}
