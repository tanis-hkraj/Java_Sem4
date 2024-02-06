class Calculate{
    // Method overloading in add function: When a class has multiple methods with same name but with changed return type or changed arguments type or number of arguments
    // Overloading can be done through two approaches
    // -by changing the number of arguments
    // -by changing dataType.
    public int adds(int a, int b){
        System.out.println("'adds' function called.");
        return a+b;
    }
    public double adds(double a,double b){
        return a+b;
    }
    public int adds(int a,int b,int c){
        return a+b+c;
    }
}

class OOPs_02 {
    public static void main(String[] args) {
        /*OOPs: An object is something that has certain attributes(different different properties) and behaviour
         * Inheritance
         * Polymorphism
         * Abstraction
         * Encapsulation
        */
        // Refernce of Calculate made in different memory.
        Calculate obj=new Calculate();// obj is a reference variable that stores the address of Calculate that is in other memory heap...
        double add1=obj.adds(5.0d,4.0d);
        System.out.println(add1);


    } 
}
