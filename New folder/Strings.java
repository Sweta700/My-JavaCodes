public class Strings {
public static void main(String4[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;
            char charFront = sb.charAt(front);
            char charBack = sb.charAt(back);
            sb.setCharAt(front , charBack);
            sb.setCharAt(back , charFront);

        }
        System.out.println(sb);
    }

}

