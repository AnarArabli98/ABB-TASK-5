package lesson10;

import java.io.Closeable;
import java.io.IOException;

public class Frog implements Closeable {

    private final String name;
    public Frog(String name) {
        this.name = name;
    }

    public void jump() {
        System.out.println(this.name + " Jumping");
    }


    @Override
    public void close() throws IOException {
        System.out.println(this.name + " Closing Frog");
    }
}
