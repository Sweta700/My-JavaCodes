import java.util.Scanner;
public class TwoDArray {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int rows=sc.nextInt();
    int cols=sc.nextInt();
        sc.close();


    int[][] a = new int[rows][cols];
    for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
   a[i][j]=sc.nextInt();
    }
    }
   int x=sc.nextInt();
    for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
    if(a[i][j]==x)
    System.out.println("x found at location ("+ i + "," + j + ")");
    }
    }
}
}
