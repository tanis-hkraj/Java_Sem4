class exception_handling_21 {
    public static void main(String[] args) {
        try{int arr[]=new int[5];
        arr[5]=100/0;}catch(ArithmeticException e){
            System.out.println(e);
        }catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
