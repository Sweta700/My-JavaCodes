import java.util.Scanner;
public class Array {
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("Enter the size of array");
int size =sc.nextInt();
int a[]=new int[size];
System.out.println("Enter the index value of array");
for(int i=0;i<size;i++){
     a[i]=sc.nextInt();
}
System.out.println("Enter the index value for search index");
int x=sc.nextInt();
for(int i=0;i<size;i++){
    if(a[i]==x){
    System.out.println("x found at index :" +i);
    sc.close();
    }
}
}
}
