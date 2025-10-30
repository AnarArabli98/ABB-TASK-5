package lesson6.classwork;

public class MemberNestedClass {
    static void main() {
        Car.EngineNestedClass nestedClass = new Car.EngineNestedClass(300);
        nestedClass.startEngine();

    }
}
