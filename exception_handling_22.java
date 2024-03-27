class exception_handling_22 {
    public static void main(String[] args) {
        try{
            int a=30/3;
            System.out.println(a);

        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("From finally Block");
        }
        System.out.println("Last Statement");
    }
}
// finally block always gets executed an exception is handled or not
// For each try block there can be only one finally block