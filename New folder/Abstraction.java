abstract class Animal{
    abstract void walk();
    public void breathe(){
        System.out.println("This animal breathes air.");
    }
    Animal(){
        System.out.println("You are about to creating animal.");
    }
}
class Horse extends Animal {
    @Override
  void walk(){
    System.out.println("Wow,you have created a horse.");
  }
  Horse(){
     System.out.println("Horse walks on 4 legs.");
  }
}
class Chicken extends Animal{
    @Override
  void walk(){
    System.out.println("Wow,you are a creating a chicken");
  }
  Chicken(){
    System.out.println("Chicken walks on 2 legs.");
  }
}
public class Abstraction {
  public static void main(String[] args) {
    Chicken chicken = new Chicken();
    chicken.walk();
    Horse horse = new Horse();
    horse.walk();
  }
}
