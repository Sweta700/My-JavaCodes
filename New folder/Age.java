
import java.util.Scanner;
public class Age {
public static String checkVotingEligibility(int age){
    if(age>18){
        return "Eligible for voting";
    } 
    else{
        return "Not eligible for voting";
    }
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    sc.close();

    System.out.println("How old are you?");
    int age=sc.nextInt();
    String eligibility=checkVotingEligibility(age);
   System.out.println(eligibility);
}
}
