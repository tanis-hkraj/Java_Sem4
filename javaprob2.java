
public class javaprob2 {
    public static void main(String[] args) {
        int i=-1,j=1;
        if(i>=0 && j<0){
            System.out.println("i = "+i);
            System.out.println("j = "+(-j));
        }else if(i<0 && j>=0){
            System.out.println("j = "+(j));
            System.out.println("i = "+(-i));
        }else if(i<0 && j<0){
            System.out.println("i = "+(-i));
            System.out.println("j = "+(-j));
        }else{
            System.out.println("i = "+(i));
            System.out.println("j = "+(j));
        }
    }
}
