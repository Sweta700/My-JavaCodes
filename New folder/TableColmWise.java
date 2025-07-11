public class TableColmWise {
public static void main(String[] args) {
    System.out.println("The table of 2 to 20");
for(int i=1;i<=10;i++){
    for(int j=2;j<=20;j++){
        System.out.printf("%-6d",j*i);
    }
    System.out.println();
}
}
}
