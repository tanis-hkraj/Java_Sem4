abstract class Animal{
    abstract void eat();
    abstract void sleep();
}
class Tiger extends Animal{
    void eat(){
        System.out.println("Tiger eats flesh");
    }
    void sleep(){
        System.out.println("Tiger sleeps 8 hours");
    }
        
}
class Lion extends Animal{
    void eat(){
        System.out.println("Lion eats Meat");
    }
    void sleep(){
        System.out.println("Lion sleeps 6 hours");
    }
        
}
class Deer extends Animal{
    void eat(){
        System.out.println("Deer eats grass");
    }
    void sleep(){
        System.out.println("Deersleeps 12 hours");
    }
        
}
class javaprob12 {
    public static void main(String[] args) {
        Tiger t=new Tiger();
        Lion l=new Lion();
        Deer d=new Deer();
        t.eat();
        t.sleep();
        l.eat();
        l.sleep();
        d.eat();
        d.sleep();
        
    }
}
