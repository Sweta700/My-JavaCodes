public class Hallo {
    public static void main(String args[]){
        boolean isSpace =true;
        for(int i=1;i<=4;i++){
        for(int j=1;j<=1;j++){ if(j>=7-i && j<=5+i && isSpace){
            System.out.print("*");
            isSpace =false;
        }else{
            System.out.print(" ");
            isSpace=true;
        }
        }
        System.out.println();
    }
    }
    }
    