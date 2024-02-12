class Person{
    public String name;
    public int age;
    public long mob;

    // A special method that has the same name as class and it do not have any return type.  
    // whenever any object is created in main then every time for each object constructor in called at least one time.
    // Even if we dont write the constructor then also a default constructor is called by the jvm when the program is executed.
    public Person(){
        name="Hello";
        age=11;
        mob=407537;
    }
    public Person(String name, int age, long mob){
        this.name=name;
        this.age=age;
        this.mob=mob;
    }
    // Copy Constructor
    public Person(Person obj){
        name=obj.name;
        age=obj.age;
        mob=obj.mob;
    }
    public void output(){
        System.out.println("Name: "+name+" Age: "+age+" mobile: "+mob);
    }
}

class Constructors_05 {
    public static void main(String[] args) {
        Person P1=new Person();
        Person P2=new Person("Tanishk", 19, 6204860);
        Person P3=new Person(P2);
        P1.output();
        P2.output();
        P3.output();
    }
}
/*
 * A constructor is a block of code similar to a class
 * It is called when an instance of a class is created
 * Every time an object is created using the new keyword, at least one constructor is called.
 * Java Compiler provides a default constructor by default, this constructor is called when there is no constructor created in the class
 * 
 * Rules:
 * Constructor name must be same as its class name
 * constructor should have no return type.
 */

