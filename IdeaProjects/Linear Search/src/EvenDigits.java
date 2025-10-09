// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/


//public class EvenDigits {
//    public static void main(String[] args) {
//        int[] nums = {12, 345, 2, 6, 7896};
//        System.out.println(FindNumbers(nums));
//    }
//    static int FindNumbers(int[] nums){
//        int count = 0;
//        for(int num : nums){
//            if (even(num)){
//                count++;
//
//            }
//        }
//
//        return count;
//    }
//
//    // Function to check whether a number contains even digits or not
//    static boolean even(int num) {
//        int numberOfDigits = digits(num);
//        return numberOfDigits % 2 == 0;
//        }
//
//    }
//    static boolean digits(int num){
//        int count = 0;
//
//        while (num > 0){
//            count ++;
//            num = num / 10; // num /= 10
//        }
//
//        return count;
//    }
//}

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
        System.out.println(digits2(322455));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // Function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0; // cleaner version of your if-else
    }

    static int digits2(int num){
        if (num == 0) return 1; // handle the case for 0
        if (num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num));
    }

    static int digits(int num) {
        int count = 0;
        if (num == 0) return 1; // handle the case for 0
        if (num < 0){
            num = num * -1;
        }

        while (num > 0) {
            count++;
            num = num / 10; // or num /= 10
        }
        return count;
    }
}
