interface Flyable{
    void fly_obj();
}
class SpaceCraft implements Flyable{
    public void fly_obj(){
        System.out.println("Flies in Space");
    }
}
class AirPlane implements Flyable{
    public void fly_obj(){
        System.out.println("Flies in Air and is public");
    }
}
class Helicopter implements Flyable{
    public void fly_obj(){
        System.out.println("Flies in Air ans is Private");
    }
}
class javaprob14{
    public static void main(String[] args){
        SpaceCraft s=new SpaceCraft();
        AirPlane a=new AirPlane();
        Helicopter h=new Helicopter();
        s.fly_obj();
        a.fly_obj();
        h.fly_obj();
    }
}