class Car{
    private String color;
    private String Model;
    private boolean rentalStatus;
    private int year;

    public Car(String color,String model,int year,boolean rentalStatus){
        this.color=color;
        this.Model=model;
        this.year=year;
        this.rentalStatus=rentalStatus;
    }
    public Car(String color,String model,int year){
        this.color=color;
        this.Model=model;
        this.year=year;
        this.rentalStatus=false;
    }
    public void Car_rent(boolean rentalStatus){
        this.rentalStatus=rentalStatus;
    }
    public String get_model(){
        return Model;
    }
    public String get_color(){
        return color;
    }
    public boolean get_rentalStatus(){
        return rentalStatus;
    }
    public int get_year(){
        return year;
    }
    public void output(){
        System.out.println("Car Details:\nModel: "+Model+"\nColor: "+color+"\nYear: "+year+"\nRental Status: "+rentalStatus);
        System.out.println();
    }

}
class javaprob10 {
    public static void main(String[] args) {
        Car c1=new Car("Cyan", "Mercedes", 2021);
        Car c2=new Car("White","Vijalante",2024,true);
        c1.output();
        c2.output();
        boolean for_c1=c1.get_rentalStatus();
        boolean for_c2=c2.get_rentalStatus();
        System.out.println("Car 1 status"+for_c1);
        System.out.println("Car 2 status"+for_c2);
    }
}
