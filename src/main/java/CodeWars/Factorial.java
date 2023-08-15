package CodeWars;

class Factorial {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(solution(a));
    }

    public static int solution(int number) {
        int sum = 0;
        for (int i = 3; i < number; i += 3) {
            if (i % 5 == 0) {
                continue;
            }
            sum += i;
        }
        for (int i = 5; i < number; i += 5) {
            sum += i;
        }
        return sum;
    }
}

