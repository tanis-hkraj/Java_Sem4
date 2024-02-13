class Wrapper_07 {
    public static void main(String[] args) {
       int i = 5;
       Integer myInt=Integer.valueOf(i);// Boxing: storing a primitive type to wrapper class
       Integer myInt1=i; // Auto-Boxing

       int j=myInt; // auto-unboxing
       System.out.println(myInt);
       System.out.println(myInt1);

    }
    // Wrapper classes provides the mechanism to convert primitive into objects and object to primitive

}
