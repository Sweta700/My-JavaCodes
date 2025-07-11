
public class orderAccending {
public static void main(String args[]){
int a[]={45,48,93,24,23,67,12,98,16};
for(int i=0;i<9;i++){
    for(int j=i+1;j<9;j++){
    if(a[i]>a[j]){
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
    }
}
}
System.out.println("Your element in accending order");
for(int i=0;i<9;i++){
    System.out.print(a[i]+" ");
}
}
}