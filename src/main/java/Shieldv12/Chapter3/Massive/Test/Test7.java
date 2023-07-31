package Shieldv12.Chapter3.Massive.Test;

public class Test7 {
    public static void main(String[] args) {
      test a = new test("testA");
      test b = new test("testB");
      test c = new test("testC");
      test[] abc = new test[3];
      abc[0] = a;
      abc[1] = b;
      abc[2] = c;
        for (test v : abc){
            System.out.println(v);
        }
    }
}
class test{
    String a;
    public test(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "test{" +
                "a='" + a + '\'' +
                '}';
    }
}
