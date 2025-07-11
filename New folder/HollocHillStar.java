public class HollocHillStar{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){ 
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){if(i==n || j==6-i)
        System.out.print("* ");
        else
     System.out.print("  ");
    }
    for(int j=2;j<=n;j++){if(i==n || j==i)
System.out.print("* ");
else
System.out.print("  ");
    } 
System.out.println();
   }
}
}

    

