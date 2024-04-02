import java.util.*;

class Student1{
    ArrayList<String> Names=new ArrayList<>();

    public void addStudent(String name){
        Names.add(name);
    }

    public void removeStudent(String name){
        Names.remove(name);
    }

    public void displayStudents(){
        System.out.println("Students in the List are: ");
        String arr[]=new String[(Names.size())];
        Names.toArray(arr);
        for(String str: arr){
            System.out.println(str);
        }
    }
}

class javaprob17 {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.addStudent("Tanishk");
        s1.addStudent("Amrit");
        s1.addStudent("Sriram");
        s1.addStudent("Arham");
        s1.addStudent("Harsh");

        s1.removeStudent("Harsh");
        s1.removeStudent("Arham");
        
        s1.displayStudents();
    }
}
