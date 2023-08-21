import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int a = 100500;
        char[] b = Integer.toString(a).toCharArray();
        long c = 100500L;
        char[] d = Long.toString(c).toCharArray();
        int[] e = {-1,-5,2,2,5,6};
        String[] f = {"aa", "v", "a", "z", "zz", "z"};
        Arrays.sort(e);
        System.out.println(Arrays.toString(e));
        Arrays.sort(f);
        System.out.println(Arrays.toString(f));
    }
}
