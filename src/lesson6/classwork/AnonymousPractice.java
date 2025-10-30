package lesson6.classwork;

public class AnonymousPractice {
    static void main() {
        Display tv = new TV();
        tv.display();

        Display monitor = new Monitor();
        monitor.display();

        Display dis =  new Display() {
            @Override
            public void display() {
                System.out.println("phone display");
            }

        };

        dis.display();

    }
}
