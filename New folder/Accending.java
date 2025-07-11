import java.util.Scanner;

public class Accending {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the size of array : ");
    int size=sc.nextInt();
    int a[]=new int[size];
    System.out.println("Enter the index value of array");
    for(int i=0;i<size;i++){
        a[i]=sc.nextInt(); 
    }
    for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
        if(a[i]>a[j]){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        }
    }
    }
    System.out.println("Your element in accending order");
    for(int i=0;i<size;i++){
        System.out.print(a[i]+" ");
             sc.close();
   
    }
    }
    }