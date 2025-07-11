class Student{
    private String name;
    private int age;
    public int roll_no;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
public class Encapsulation {
    public static void main(String args[]){
    Student s1 = new Student();
    s1.roll_no = 34;
    System.out.println("Roll_no : " + s1.roll_no);
    s1.setName("Shweta Maurya");
    System.out.println("Name : "+s1.getName());
    s1.setAge(24);
    System.out.println("Age : "+s1.getAge());

    }
}
