package inheritance;
// class BabyDog inherits Dog, class Dog inherits Animal
// multilevel hierarchy

public class MultiLevelInheritance {
    public static void main(String[] args) {
        BabyDog b= new BabyDog();
        b.weep();
        b.bark();
        b.eat();
    }
}
