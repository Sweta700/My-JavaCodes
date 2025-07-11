class Student{
String name;
int age;
public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
}
Student(Student s2){
    this.name = "Shweta";
    this.age = 20;
}
Student(){

}
}
public class CopyConstructor {
public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Shweta";
    s1.age = 20;
    Student s2 = new Student(s1);
    s2.printInfo();
}
}
