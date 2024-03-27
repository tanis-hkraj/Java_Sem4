class exception_handling_23 {
    public static void main(String[] args) {
        
        int a = 100;
        int b = 0;
    
        try{
            b=10/a;
            if(b==0){
                throw new ArithmeticException("Zero as output is not allowed");
            }
        }catch(ArithmeticException e){
            b=100/1;
            System.out.println(e+" "+b);
        }
    }
}
