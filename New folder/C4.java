import java.util.Scanner;
 
public class C4{
  public static double circleFormulla(int r){
   double c=2*3.14*r;
   return c;
      }
   public static void main(String[]args ){
     Scanner sc = new Scanner(System.in);
     int r=sc.nextInt();
     double c=circleFormulla(r);
     System.out.println("Circumference of circle"+" "+c);
     sc.close();  

    }
   
}
