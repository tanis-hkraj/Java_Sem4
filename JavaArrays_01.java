public class JavaArrays_01 {
    public static void main(String[] args) {
        //Arrays
        int arr[]={1,2,3,4,5};
        System.out.println(arr[2]);
        //Array declaration
        int arr1[]=new int[8];
        arr1[0]=10;
        arr1[1]=20;
        System.out.println(arr1[0]);

        //2d Arrays
        int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int row=0;row<arr2.length;row++){
            for(int col=0;col<arr2[0].length;col++){
                System.out.print(arr2[row][col]+" ");
            }
            System.out.println();
        }

    }
}
