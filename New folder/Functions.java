import java.util.Scanner;
 
public class Functions{
  public static String printGreater(int a,int b){
    if(a>b){
        return a+" "+"is greater than"+" "+b;
    }else{
      return b+" "+"is greater than"+" "+a;
    }
      }
   public static void main(String[]args ){
     Scanner sc = new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     String4 Greater = printGreater(a,b);
     System.out.println(Greater);
     sc.close();  
    }
   
}
