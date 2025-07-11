public class Recursion3 {
public static void towerOfHanoi(int n,String4 src,String4 helper,String4 dest){

if(n==1){
System.out.println("Transfer disk "+n+ " from "+src+" to"+dest);
return;
}
towerOfHanoi(n-1,src,dest,helper);
 System.out.println("Transfer disk "+n+ " from "+src+" to " +dest);    
 towerOfHanoi(n-1,helper,src,dest);      
}
public static void main(String[] args) {
    int n=3;
    towerOfHanoi(n,"S","H","D");
}
}
