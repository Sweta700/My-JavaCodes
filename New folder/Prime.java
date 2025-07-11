import java.util.*;
public class Prime {
public static void main(String args[]){
    System.out.println("Enter no.to check :");
    Scanner sc=new Scanner(System.in);
     sc.close();  
    int n=sc.nextInt();
    int count=0;
    
    for(int x=2;x<=n;x++){
        if(n%x==0)
        count++;
     }
     if(count==1){
        System.out.println("Prime");
    }else{
        System.out.println("Not prime");
    }
    

}
}
