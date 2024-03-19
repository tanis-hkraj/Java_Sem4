@FunctionalInterface
interface A{
    String EvenOrOdd(int i);
}
class javaprob15 {
    public static void main(String[] args) {
        A obj=new A(){
            public String EvenOrOdd(int i){
                if(i%2==0){
                    return "Even";
                }else{
                    return "Odd";
                }
            }
            
        };
        System.out.println(obj.EvenOrOdd(567));
    }
}
