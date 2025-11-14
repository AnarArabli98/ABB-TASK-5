package lesson10.homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class UserBackupService {


    public void saveUsers(List<User> users, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(users);
            System.out.println("Users elave olundu.");
        } catch (IOException e) {
            System.err.println("Xeta bas verdi: " + e.getMessage());
        }
    }

    public List<User> loadUsers(String filePath) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            System.out.println("Users elave olundu.");
            return  (List<User>) ois.readObject();

        } catch (ClassNotFoundException | IOException e){
            System.err.println("Error " +  e.getMessage());
        }
        return null;
    }

    public void backFile(String sourceFile, String backupDir) {
        try {
            Path path = Paths.get(sourceFile);
            Path backupPath = Paths.get(backupDir);
            Path targetFile = path.resolve(path.getFileName().toString());

            // Backup folder yoxdursa yaradılır
            if (!Files.exists(backupPath)) {
                Files.createDirectories(backupPath);
            }

            // Backup faylın tam yolu
            Path backupFile = backupPath.resolve(path.getFileName());

            // Faylı kopyala
            Files.copy(path, backupFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Backup elave olundu.");

        }catch (IOException e){
            System.err.println("Error backap" +  e.getMessage());
        }
    }

    public void deleteBackup(String backupFilePath){
        try {
            Path path = Paths.get(backupFilePath);
            Path backupPath = Paths.get(backupFilePath);
            //Files.deleteIfExists() bunu avtomatik edir normalda
            if(!Files.exists(backupPath)){
                System.out.println("File tapilmadi." + backupFilePath);
                return;
            }
            Files.deleteIfExists(path);

            System.out.println("File silindi ");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
