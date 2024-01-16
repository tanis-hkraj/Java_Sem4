import java.util.Scanner;
/*
 * Why is Java Important?
 * Used in a lot of sectors
 * Mobile applications
 * WebD
 */
// Java is platform independent but JRE is platform dependent
/* Hello.java --> compiler: javac --> bytecode(.class file of the java file) --> JVM + libraries = JRE (java runtime environment) ,  JRE + development tools = Java Development Kit(jdk) */
class first {
    public static void main(String args[]){
        System.out.println("Hello World!");

        /* Variables in Java
        String, int, float, char, boolean
        Declaring variables:
        syntax - <dataType> <variableName> = <value>;
        */
        String name = "Harry" ;
        System.out.println(name);
        int a=45,x=7,y=77;
        float b=45.65f;
        boolean isAdult=false;
        System.out.println(a+b);
        System.out.println(isAdult);
        System.out.println(x+y);

        /*Rules for constructing Java Variables
         Can Conatain digits, underscore, dollor sign, letters
         should not begin with a digit
         Java is Case-Sensitive therefore tanishk and Tanishk are different variables
         no white space and duplicate names are allowed.
         */

        /*
         1. Primitive Datatypes: Has a specified and fixed size.
            byte (1 byte), short (2 bytes), int (4 bytes), long (8 bytes), float (4 bytes), double(8 bytes), boolean (1 bit), char (2 bytes)
         2. Non Primitive or Reference Datatypes: Object of variable size and not pre-specified. It has to be constructed.
        */

        /*
        Operators in Java
        Arithematic Operators: + , - , * , / , %, increment operators: ++num,--num,num++,num--
        Assignment Operators: = , += , -= , *= , /= , %= 
        Logical Operators: && , || , !
        Comaprison Operators: == , != , > , < , <= , >=
        */
        // Taking user input in Java
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Input");
        String Input=scan.nextLine();
        System.out.println("Enter the input");
        String input=scan.next();
        System.out.println(Input);
        System.out.println(input);
        /*
        Note: scan.next() takes an input till a white space and scan.nextLine() takes input for the whole line
                Similarly System.out.print() prints the variable without a next line charater and System.out.println() prints the variable with a next line character...
        */
        // Concatenation is Possible in Java
        /*
        String Methods in Java
        1. str.length(): Returns Length of the string
        2. str.toUpperCase(): Converts String to UpperCase
        3. str.toLowerCase(): Converts String to lowercase
        4. Use of escape sequence chars: \" , \t ,\n ,\\,etc.
        5. Concatenation is possible
        6. str1.contains("<str2>"): Returns a boolean value representing whether str2 is present in str1 or not
        7. str.charAt(<index>): Results the char present at the given index
        8. str.endsWith(<str1>): Return a boolean representing whether str ends with str1.
        8. str.startsWith(<str1>): Return a boolean representing whether str starts with str1.
        9. str.indexOf(<str1>): Return the index of str where first char of str1 is present. if str1 not in str then returns -1.
        10. str.trim(): Removes whitespaces from start and end of the string
        11. String.valueOf(<int,float,char,boolean or array, etc>): anything could be converted in string.
        12. str.replace(str1,str2)
        */
        /*
         * Math Class in Java
         * Math.max(num1,num2)
         * Math.min(num1,num2)
         * Math.sqrt(num)
         * Math.abs(-num)
         * Math.random():Random Numbers between 0 and 1
         * Math.random(x+(y-x)*Math.random()): Random numbers between x and y
         */

         
    }
}