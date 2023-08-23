package Shieldv12.Chapter8.Inheritance;
//ToDo: Finish this
public class BoxMain {
    public static void main(String[] args) {

    }
}

abstract class Box {
    int widht;
    int height;
    int depth;

    Box(int widht, int height, int depth) {
        if (widht < 1 || height < 1 || depth < 1) {
            throw new IllegalArgumentException("Must not be 0");
        }
        this.widht = widht;
        this.height = height;
        this.depth = depth;
    }

    Box(Box a) {
        this.depth = a.depth;
        this.widht = a.widht;
        this.height = a.height;
    }
}

class CartonBox extends Box {
    String LvlOfCarton;

    CartonBox(int widht, int height, int depth, String LvlOfCarton) {
        super(widht, height, depth);
        this.LvlOfCarton = LvlOfCarton;
    }

    CartonBox(CartonBox a) {
        super(a);
        this.LvlOfCarton = a.LvlOfCarton;
    }
}

class CartonBoxShipment extends CartonBox {
    int cost;

    CartonBoxShipment(int widht, int height, int depth, String LvlOfCarton) {
        super(widht, height, depth, LvlOfCarton);
        if (LvlOfCarton.equals("Premium")) {
            this.cost = 100;
        } else {
            this.cost = 50;
        }
    }
}