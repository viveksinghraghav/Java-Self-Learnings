import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
//        fun(2,3,4,5,6,7,8,9,2,3,4,4,5,4,6,5,65);

        multiple(20, 30, "Vivek", "Singh", "Raghav");
    }
    static void multiple(int a, int b, String ...v){
        // variable length argument always come at the end
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
