public class Pyramid2 {
    public static void main(String args[]){
        boolean isSpace=true;
        for(int i=1;i<=5;i++){
        for(int j=1;j<=9;j++){   
            if(j>=6-i && j<=4+i && isSpace){
            System.out.print(i);
           isSpace=false;
        }else{
            System.out.print(" ");
            isSpace=true;
        }
        }
        System.out.println();
    }
    }
    }
    

