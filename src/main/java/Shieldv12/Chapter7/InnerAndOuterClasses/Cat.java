package Shieldv12.Chapter7.InnerAndOuterClasses;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Non-Static Inner Class
    class CatToy {
        private String name;

        public CatToy(String name) {
            this.name = name;
        }

        public void play() {
            System.out.println(Cat.this.name + " is playing with " + name);
        }
    }

    // Static Nested Class
    public static class CatFood {
        private String foodName;
        private int foodCount;

        public CatFood(String foodName, int foodCount) {
            this.foodName = foodName;
            this.foodCount = foodCount;
        }

        public void feed() {
            System.out.println("Feeding with " + foodName);
        }
    }

    public void introduce() {
        System.out.println("My name is " + name + " and I'm " + age + " years old.");
    }
}
