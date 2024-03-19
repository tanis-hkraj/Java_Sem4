abstract class Shape {
    abstract void draw();
    abstract void calculateArea();
}
class Rectangle extends Shape {
    int L,B;
    Rectangle(int L,int B){
        this.L=L;
        this.B=B;
    }
    void draw(){
        System.out.println("Drawing Rectangle");
    
    }
    public void calculateArea(){
        System.out.println("Area of Rectangle:"+L*B);
    }
        
}
class Circle extends Shape {
    int r;
    Circle(int r){
        this.r=r;
    }
    void draw(){
        System.out.println("Drawing Circle");
    
    }
    public void calculateArea(){
        System.out.println("Area of Circle:"+(3.14*r*r));
    }
        
}
class Triangle extends Shape {
    int H,B;
    Triangle(int H,int B){
        this.H=H;
        this.B=B;
    }
    void draw(){
        System.out.println("Drawing Triangle");
    
    }
    public void calculateArea(){
        System.out.println("Area of Triangle:"+0.5*H*B);
    }
        
}
    
public class javaprob13 {
    public static void main(String[] args){
        Rectangle r=new Rectangle(10,20);
        Circle c=new Circle(6);
        Triangle t=new Triangle(30,20 );
        r.draw();
        r.calculateArea();
        c.draw();
        c.calculateArea();
        t.draw();
        t.calculateArea();

    }
}
