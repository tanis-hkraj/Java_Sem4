//Also called Single Abstract Method(SAM)
@FunctionalInterface
interface A{
    //void display();
    //only one method -> functional interface

    void print(int i);
}
// class B implements A{
//     public void display(){
//         System.out.println("From B");
//     }
// }

class A17_FunctionalInterface {
    public static void main(String[] args) {
        //->withoyt parameters
        // A obj = new A(){
        //     public void display(){
        //         System.out.println("From main");
        //     }
        // };
        // A obj = 
        // () -> {
        //     System.out.println("From main");
        // };
        // A obj = () -> System.out.println("From main");//Lambda Function

        // obj.display();

        //With parameters

        A obj=new A() {
            public void print(int i){
                System.out.println("From print "+i);
            }
        };

        obj.print(9);
    }
}
// Lambda expressions works on functional interfaces only