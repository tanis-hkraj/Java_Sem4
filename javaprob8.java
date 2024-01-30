class javaprob8 {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,1},{4,5,6,7},{7,8,9,3},{0,8,7,5}};
        //Swapping first and last row
        for(int i=0;i<arr[0].length;i++){
            int temp=arr[0][i];
            arr[0][i]=arr[arr.length-1][i];
            arr[arr.length-1][i]=temp;
        }

        //Printing the array
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }    
}
