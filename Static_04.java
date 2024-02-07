// Note: A class do not take space in the memory untill and unless an object is initialised in the program.

class Student{
    public String studentName;
    public int roll;
    public static String uniName;// This variable is shared commomly to all instances of the class using static keyword
    public void out(){
        System.out.println(studentName+" "+roll+" "+uniName);
    }
    public static void mystaticFunc(Student obj){
        System.out.println("From Static Method: "+obj.roll+" "+uniName);
    }
}


class Static_04 {
    public static void main(String[] args) {
        Student.uniName="LPU";
        Student S1=new Student();
        S1.studentName="Tanishk";
        S1.roll=3;
        
        
        Student S2=new Student();
        S2.studentName="Amrit";
        S2.roll=1;
        

        S1.out();
        S2.out();
        Student.mystaticFunc(S1);
    } 
}
// Static Keyword is used for memory management
// A static variable can be  used to refer to common properties of all the objects.
// A static variable gets memory at once only

// Difference Betwwen static var and instance var
// 1. Variables outside methods and inside class are instance vars.
// 2. Class/Static Variables are declared with a static keyword in a class but outside method
// 3. Instance Variables are crated when an obj is created with a new keyword and gets destroyed when the obj is destroyed.
// 4. Static Variables are created when the program starts and ends when program stops.
// 5. IV can be accessed directly by calling variable name inside the class