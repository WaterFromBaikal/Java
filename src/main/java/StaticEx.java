public class StaticEx {
    public static void main(String[] args) {
        System.out.println(Box.getCount());
        Box b1 = new Box("Ашан");
        System.out.println(Box.getCount());
    }

}
class Box{
    String name;
    private static int count = 0;
    Box(String name){
        this.name = name;
        count++;
    }
    static int getCount(){
        return Box.count;
    }
}
