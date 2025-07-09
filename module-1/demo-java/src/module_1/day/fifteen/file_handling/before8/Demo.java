package module_1.day.fifteen.file_handling.before8;

import java.io.*;

public class Demo {
    // file -> create add read update delete
    private static final String PATH = "demo.txt";

    public static void main(String[] args) {
//        createWriteFile("hello world");
        readFromFile();
    }

    public static void createWriteFile(String content) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(PATH));
            writer.write(content);
            System.out.println("Successfully wrote to the file..");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void readFromFile() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(PATH));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
