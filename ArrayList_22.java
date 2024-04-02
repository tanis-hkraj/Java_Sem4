import java.util.ArrayList;
class ArrayList_22{
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        list1.add("Mercury");
        list1.add("Venus");
        list1.add("Earth");
        list1.add("Mars");
        list1.add("Jupiter");

        String arr[]=new String[list1.size()];
        list1.toArray(arr);
        System.out.println("From ArrayList to Array Conversion:");
        for(String str: arr){
            System.out.println(str);
        }
        
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);

    }
}