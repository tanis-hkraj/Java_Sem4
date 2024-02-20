class Animal{
    public void eat(){
        System.out.println("I can eat");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("I can Bark");
    }

}
class Inheritance_11 {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.eat();
        System.out.println(-1%5);
    }
    
}
/*
 * Types of Inheritance
 * 1. Single Level Inheritance
 * 2. Multilevel Inheritance:p1->p2->ch1
 * 3. Hirarchical Inheritance: P1->Ch1,P1->Ch2
 * 4. Multiple Inheritance: No supported in Java and even not Hybrid
 */