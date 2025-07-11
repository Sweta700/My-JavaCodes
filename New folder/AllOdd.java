import java.util.Scanner;
 
public class AllOdd{
  public static void printAllOdd(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
      
      if(i%2==1){
        sum=sum+i;
      }
    }
         System.out.println("The sum of all 1 to n odd no. :"+sum);

  }
   public static void main(String[]args ){
     Scanner sc = new Scanner(System.in);
     sc.close();  

     int n=sc.nextInt();
     printAllOdd(n);
    }
   
}
