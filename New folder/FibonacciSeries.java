import java.util.*;
public class FibonacciSeries {
public static void printFibonacciSeries(int a,int b,int num){
    for(int i=1;i<=num;i++){
        int c=a+b;
        System.out.println(c);
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int num=sc.nextInt();
     
    System.out.println(a);
    System.out.println(b);
    printFibonacciSeries(a,b,num-2);
}
}
