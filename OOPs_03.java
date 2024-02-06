class Bank{
    private int accNumber;
    private String myName;
    private int amount;

    public int get_account(){
        return accNumber;
    }
    public void set_account(int n){
        accNumber=n;
    }
    public String get_myName(){
        return myName;
    }
    public void set_myName(String name){
        myName=name;
    }
    
    public int get_amount(){
        return amount;
    }
    public void set_amount(int amount){
        this.amount=amount;
    }

}

class OOPs_03 {
    public static void main(String[] args) {
        // Encapsulation: Way of writing a code where we wrap our code in a container so that we could have control over it.
        // wrapping data and member functions together in a single unit...
        Bank B1=new Bank();
        B1.set_account(45908);
        B1.set_myName("Tanishk Raj");
        B1.set_amount(10000);
        System.out.println(B1.get_account()+" "+B1.get_myName()+" "+B1.get_amount());

    }    
}
