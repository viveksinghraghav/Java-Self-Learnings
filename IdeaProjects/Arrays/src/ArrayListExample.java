import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//
//        list.add(67);
//        list.add(23);
//        list.add(345);
//        list.add(233);
//        list.add(232);
//        list.add(232);
//        list.add(213);
//        list.add(66);
//        list.add(53);
//        list.add(576);
//        list.add(989);
//        list.add(434);
//        list.add(32);
//
//        System.out.println(list.contains(654));
//        list.set(0, 99);
//        list.remove(2);
//        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));  // pass index here, list[index] syntax will not work here
        }
//        System.out.println(list);

    }

}
