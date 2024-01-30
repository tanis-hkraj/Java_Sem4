class javaprob6 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,67,45,24,35,87,99,76,89};
        for(int i=0;i<13;i++){
            if(arr[i]%2==0) continue;
            System.out.println(arr[i]);
        }
    }    
}
