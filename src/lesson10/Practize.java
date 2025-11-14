package lesson10;

import lesson10.homework.User;
import lesson10.homework.UserBackupService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
//---------------------------------------

//        File file = new File("src/test.txt");
//
//        Path path = file.toPath();
//        var line = Files.readString(path);
//        var lines = Files.readAllLines(path);
//
//        Files.write(path, List.of("Hello World!"));
//        System.out.println(line);

        //-------------------------------------------

        UserBackupService service = new UserBackupService();
        List<User> users = new ArrayList<>();
        users.add(new User("Anar", "Anar@mail.ru", 24));
        users.add(new User("Balay", "Balay@mail.ru",25));
        users.add(new User("Leyla","Leyla@mail.ru",30));

        String dataFile = "users.dat";
        String backupDir = "backup";
        String backupFile = backupDir + "/users_backup.dat";

        System.out.println("== User Backup ==");
        service.saveUsers(users , dataFile);

        List<User> loadUsers = service.loadUsers(dataFile);
        System.out.println("Loaded users from file");
        loadUsers.forEach(System.out::println);

        service.deleteBackup(backupFile);
        System.out.println("Deleted backup file");



    }
}
