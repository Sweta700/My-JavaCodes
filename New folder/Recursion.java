public class Recursion {
public static void printSeries(int a,int b, int n){
    if(n==0){
        return;
    }
    System.out.print(a+" ");
    printSeries(b,a+b,n-1);
}
public static void main(String[] args) {
    printSeries(0,1,10);
}
}
