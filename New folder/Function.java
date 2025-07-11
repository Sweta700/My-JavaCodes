import java.util.Scanner;
public class Function {
    public static void myName(String name){
        System.out.println(name);
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        sc.close();

        String name=sc.nextLine();
        myName(name);

    }
}
