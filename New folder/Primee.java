import java.util.Scanner;
public class Primee {
public static void checkPrime(int n){
int count=0;
 for(int i=2;i<=n;i++){
    if(n%i==0)
    count++;
 }
 if(count==1){
 System.out.println("Prime");
 }
 else{
 System.out.println("Not prime");
 }
 }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    
    checkPrime(n);
    sc.close();
}
}
