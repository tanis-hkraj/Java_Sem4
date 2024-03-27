class exception_handling_20 {
    public static void main(String[] args) throws Exception{
        System.out.println("Start Hello");
        try{
            // int a=2/0;
            // String str=null;
            // System.out.println(str.length());
            int[] arr=new int[5];
            arr[10]=100;
        }catch(Exception e){
            System.out.println("Exception thrown in Catch block");
            System.out.println(e.getClass());
        }
        System.out.println("Hello");
    }
}
// Exception Handling: In this we handle runntime errors
/*
 Blocks:
 try{
    <--Exception Code-->
 }
 catch(Exception e){
  <--handle the exception-->
 }
 */
// all the exception classes are child or sub-class of a throwable class
// try -> It is used to specify a block where we should place an exception code. It should be followed by a catch block
// catch->to handle the exception

// Types of exception:
/*
 * / by 0
 * NullPointerException
 * ArrayIndexOutOfBoundException
 * 
 */