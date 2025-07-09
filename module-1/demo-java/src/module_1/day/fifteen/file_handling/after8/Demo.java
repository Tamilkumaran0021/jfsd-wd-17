package module_1.day.fifteen.file_handling.after8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Demo {
    private static final String PATH = "demo.txt";

    public static void main(String[] args) {
//        AutoCloseable closeable = () -> System.out.println("object closed");
//
//        try (closeable) {
//
//        } catch (Exception e) {
//
//        }
//        _createWriteFile("hello from java");
//        createWriteFile();
//        writeFile("hey there!!!!!!");
//        readFile();
//        updateFile("JS is good");
        deleteFile();
    }

    public static void _createWriteFile(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH))) {
            writer.write(content);
            System.out.println("Successfully wrote to the file..");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createFile() {
        try {
            if (!Files.exists(Path.of(PATH)))
                Files.createFile(Path.of(PATH));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile(String content) {
        try {
            Files.writeString(Path.of(PATH), content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile() {
        try {
            System.out.println(Files.readAllLines(Path.of(PATH)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void updateFile(String content) {
        try {
            Files.writeString(Path.of(PATH), content, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteFile() {
        try {
            Files.delete(Path.of(PATH));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
