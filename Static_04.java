class Student{
    public String studentName;
    public int roll;
    public static String uniName;// This variable is shared commomly to all instances of the class using static keyword
    public void out(){
        System.out.println(studentName+" "+roll+" "+uniName);
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
    } 
}
