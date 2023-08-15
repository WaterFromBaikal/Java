public class StackEx {
    public static void main(String[] args) {

    }
}

class Stack {
    int[] stck = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int i) {
        if (tos == 9) {
            System.out.println("Стек полон.");
        } else
            stck[++tos] = i;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Стек опустошен.");
            return -1;
        } else
            return stck[tos--];
    }
}
