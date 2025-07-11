class Student{
String name;
int age;
double percent;
int roll_num;
public void PrintDetails(){
    System.out.println("name = "+this.name);//this. is a keyword i.e used to the function that calls this will automatically print its name
    System.out.println("Age = "+age+" "+",Roll_Num ="+roll_num);
}
}
public class OOPS1 {
    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Shweta";
        x.age = 20;
        x.roll_num = 20;
        x.PrintDetails();
    }
}

