class Pen{
    String color;
    String type;
    public void write(){
    System.out.println("Writting Something");
    }
    public void PrintColor(){
    System.out.println(this.color);
    System.out.println(this.type);
    }
}
public class OOPS {
  public static void main(String[] args) {
    Pen x1 = new Pen();
    x1.color = "Black";
    x1.type = "Ballpoint";
    x1.write();
    x1.PrintColor();
    Pen x2 = new Pen();
    x2.color = "Blue";
    x2.PrintColor();
  }  

}
