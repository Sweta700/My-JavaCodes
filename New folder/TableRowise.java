public class TableRowise{
public static void main(String[] args) {
    int num=2;
    System.out.println("The table of 1 to 100");
    for(int i=1;i<=99;i++){
        for(int j=1;j<=10;j++){
       System.out.printf("%5d",num*j);
        }  
        num++; 
        System.out.println();
        
    }
}
}
