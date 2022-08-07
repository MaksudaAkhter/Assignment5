package interfaceExample;

public interface Interface extends Printable, Showable{
    @Override
    default void print(){
        System.out.println("Print");

    }

    @Override
    default void show(){
        System.out.println("Show");
    }
}
