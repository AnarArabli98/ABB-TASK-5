package lesson10;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class Practize {
    static void main() throws IOException {

//        try {
//            int x = 5;
//            System.out.println(x/0);
//            String name = null;
//            if (Objects.isNull(name)) {
//                throw new CustomException("name is null");
//            }
//        } catch (CustomException | ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }

//        try (Frog frog1 = new Frog("A")){
//            frog1.jump();
//            System.out.println("Frog1 jumped");
//        }
//        System.out.println("Program comleted frog");


        File file = new File("src/test.txt");

        Path path = file.toPath();
        var line = Files.readString(path);
        var lines = Files.readAllLines(path);

        Files.write(path, List.of("Hello World!"));
        System.out.println(line);

    }
}
