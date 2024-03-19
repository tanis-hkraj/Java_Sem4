class A{
    public A(){
        System.out.println("From A");
    }
    public A(int n){
        System.out.println("From Parameterised A");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("From B");
    }
    public B(int n){
        this();
        System.out.println("From Parameterised B");
    }
}
public class super_13 {
    public static void main(String[] args) {
        B b1=new B(3);
        // B b2=new B();
    }
}
