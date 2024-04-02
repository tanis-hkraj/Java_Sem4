import java.util.*;
class javaprob16 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            arr[i]=m;
        }
        System.out.println("Even: "+EVEN(arr)+" Odd: "+ODD(arr));

    }
    static int EVEN(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
    static int ODD(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
            }
        }
        return count;
    }
    static int removeDuplicate(int arr[]){
        int n=arr.length;
        int arr1[]=new int[n];
        
    }
}
