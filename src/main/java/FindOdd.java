import java.util.Arrays;

public class FindOdd {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1};
        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));
//        System.out.println(findIt(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}));
//        System.out.println(findIt2(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}));
//        System.out.printf("%s и %s сидели на трубе%n", "А", "Б");
        System.out.println(duplicateCount("Programming"));

    }

    public static int findIt(int[] a) {

        int[] srcArr = Arrays.copyOf(a, a.length);
        Arrays.sort(srcArr);
        while (true) {
            if (a.length == 1) return a[0];
            int counter = 0;
            int target = 0;
            for (int i = 0; i < srcArr.length; i++) {
                target = srcArr[0];
                if (srcArr[i] == target) {
                    counter++;
                } else break;
            }
            if (counter % 2 == 1) return target;
            else
                srcArr = Arrays.copyOfRange(srcArr, counter, srcArr.length);
        }
    }

    public static int findIt2(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        return xor;
    }

    public static String whoLikesIt(String... names) {
        //Do your magic here
        if (names.length == 0) {
            return "no one likes this";
        } else if (names.length == 1) {
            return (names[0] + " likes this");
        } else if (names.length == 2) {
            return (names[0] + " and " + names[1] + " like this");
        } else if (names.length == 3) {
            return (names[0] + ", " + names[1] + " and " + names[2] + " like this");
        }
        return (names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this");
    }

    public static String whoLikesIt2(String... names) {
        switch (names.length) {
            case 0:
                return "no one likes this";
            case 1:
                return String.format("%s likes this", names[0]);
            case 2:
                return String.format("%s and %s like this", names[0], names[1]);
            case 3:
                return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default:
                return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }

    public static int duplicateCount(String text) {
        // Write your code here
        String srcData = text.toLowerCase();
        char[] ChArr = srcData.toCharArray();
        Arrays.sort(ChArr);
        int mainCounter = 0;
        while (true) {
            int counter = 0;
            char target = '0';
            for (int i = 0; i < ChArr.length; i++) {
                target = ChArr[0];
                if (ChArr[i] == target) {
                    counter++;
                    if (i == ChArr.length - 1) {
                        if (counter > 1) mainCounter++;
                        return mainCounter;
                    }
                } else {
                    if (counter > 1) mainCounter++;
                    ChArr = Arrays.copyOfRange(ChArr, i, ChArr.length);
                    break;
                }
            }
        }
    }
}