class Shape{
    int l,h;
Shape(){
        System.out.println("Display area");
    }
}
class Triangle extends Shape {
    Triangle(int l, int h) {
        this.l = l;
        this.h = h;
    }
    public void area() {
        double a = 0.5 * l * h;
        System.out.println("Area of Triangle: " + a);
    }
}

public class SingleInherit {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10, 20);
        t1.area();
       
    }
}