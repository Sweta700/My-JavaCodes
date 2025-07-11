import java.util.Scanner;
 
public class Average {
  public static float printAverage(int a , int b, int c){
    float avg = (a+b+c)/3;
    return avg;
  }
   public static void main(String[]args ){
     Scanner sc = new Scanner(System.in);
     sc.close();  

     int a = sc.nextInt();
     int b =sc.nextInt();
     int c =sc.nextInt();
     float avg =printAverage(a,b,c);
     System.out.println("The avarage of a,b & c is: "+avg);
    }
   
}
