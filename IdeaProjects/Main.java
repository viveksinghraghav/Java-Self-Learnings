//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Q. Store a roll number
        int a = 29;

        // Q. Store a name
        String name = "Vivek";


        // What if you want to store 500 roll no. ?


        // syntax
        // datatype[] variable_name = new datatype[size];

        // store 5 roll no.'s

//        int[] rnos = new int[5];  // this datatype represents what is the type of data stored inside the array
        // or directly
//        int[] rnos2 = {23, 12 , 45, 32, 12};  // all the type of data in the array should be same


        int[] ros; // declaration of an array. ros is getting defined in the stack
        ros = new int[5]; // initialization: actually here object is being created in the memory (heap)

        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

        // vivek


    }
}