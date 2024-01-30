class javaprob7 {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,1},{4,5,6,7},{7,8,9,3},{0,8,7,5}};
        // Printing First Row
        for(int i=0;i<arr[0].length;i++){
            System.out.print(arr[0][i]+" ");
        }
        System.out.println();
        for(int i=1;i<arr.length-1;i++){
            for(int j=0;j<arr[0].length;j++){
                if(j==0 || j==arr[0].length-1) System.out.print(arr[i][j]+" ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        //Printing last Row
        for(int i=0;i<arr[0].length;i++){
            System.out.print(arr[arr.length-1][i]+" ");
        }

    }
}
/* Output
 1 2 3 1 
 4     7
 7     3
 0 8 7 5
*/
