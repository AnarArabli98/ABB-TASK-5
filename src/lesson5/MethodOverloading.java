package lesson5;

public class MethodOverloading {

    public void drive(){
        System.out.println("Driving a Car");
    }
    public void drive(String name){
        System.out.println("Driving " + name);
    }
    public void drive(String name, int distancr){
        System.out.println("Driving " + name + " with distance " + distancr);
    }
    public void drive(int distance){
        System.out.println("Driving " + distance);
    }
}
