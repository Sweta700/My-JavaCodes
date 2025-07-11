class Shape{
    int l,h;
    Shape(){
    System.out.println("Display shape");
}
}
class Triangle extends Shape{
    Triangle(int l , int h){
        this.l = l;
        this.h = h;
    System.out.println("Area of Triangle: "+0.5*l*h);
    }
}
class EquilateralTriangle extends Triangle{
       EquilateralTriangle(int l , int h){
      
        super(l,h);
       }
        public void area(){
    System.out.println("Area of ETriangle: "+0.5*l*h);
    }
}
public class MultilevelInherit {
    public static void main(String[] args) {
        EquilateralTriangle t1 = new EquilateralTriangle(12,16);
        t1.area();
       
    }

}
