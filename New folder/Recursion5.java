public class Recursion5 {
     public static int first=-1;
     public static int last=-1;
public static void findOccurance(String str , int idx){
    if(idx==str.length()){
    System.out.println(first);
    System.out.println(last);
    return;
    }
    char currChar = str.charAt(idx);
    char element = 'a';
    if(currChar==element){
        if(first==-1)
        first = idx;
    }else{
        last = idx;
    }
    findOccurance(str,idx+1);
}
public static void main(String[] args) {
    String str = "abaacdaefaah";
   
    findOccurance(str,0);
}
}
