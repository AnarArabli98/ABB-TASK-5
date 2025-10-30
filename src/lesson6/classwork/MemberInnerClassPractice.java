package lesson6.classwork;

public class MemberInnerClassPractice {
    static void main() {
        Car.Engine engine = new Car("KHAZAR","BLACK",4).new Engine(120);
        engine.startEngine();
    }
}
