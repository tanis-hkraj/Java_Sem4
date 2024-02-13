class Test{
    public int add(int ... num){ //Here there are variable number of arguments that are activated through ... and an array of a datatype num...
        int sum=0;
        for(int i:num){
            sum+=i;
        }
        return sum;
    }
}

class VariableArgs_08 {
    public static void main(String[] args) {
        Test obj=new Test();
        System.out.println(obj.add(2,5,67,87,4));
    }
}
