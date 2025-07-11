import java.util.Scanner;
public class Fact {
public static void calculateFact(int a){
    int fact=1;
    for(int i=a;i>=1;i--){
      fact=fact*i;
    }
   System.out.println(fact);
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     sc.close();
    int a=sc.nextInt(); 
   calculateFact(a);
   
}
}
