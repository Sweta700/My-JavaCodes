//Check if an array is sorted(Strictly increasing)

public class Recursion4 {
public static boolean isSorted(int a[],int idx) {
    if(idx==a.length-1){
        return true;
    }
    if(a[idx]<a[idx+1]){
        return isSorted(a,idx+1);
    }else{
        return false;
    }
}
    
public static void main(String[] args) {
    int a[]={1,2,3,4,5};
    System.out.println(isSorted(a,0));
}
}
