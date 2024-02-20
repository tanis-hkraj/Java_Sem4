class Address{
    String city;
    String State;
    public Address(String city,String State){
        this.city=city;
        this.State=State;
    }
}
class Student{
    int id;
    String name;
    Address address;
    public Student(int id, String name, Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    void display(){
        System.out.println("Id: "+id+" Name: "+name+" Address: "+address.State);
    } 
}

class aggregation_12 {
    public static void main(String[] args) {
        Address a1=new Address("Gaya", "Bihar");
        Student s1=new Student(12210325, "Tanishk",a1);
        s1.display();
    }
}
