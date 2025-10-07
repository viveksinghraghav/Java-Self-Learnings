public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Kunal";
        {
          //  int a = 23; // already initialized outside the block
            a = 100;  // reassign the origin ref variable to some other value
            System.out.println(a);
            int c = 99;
            name = "Rahul";
            System.out.println(name);
               // values initialized in this block will remain in this block
        }
        int c = 88;
        System.out.println(a);
        System.out.println(name);
      //  System.out.println(c); cannot use outside of the block


        // scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
           // int a = 10;
        }
    //    System.out.println(i); // cannot be used outside the box until initialized in that same box again

    }
    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
