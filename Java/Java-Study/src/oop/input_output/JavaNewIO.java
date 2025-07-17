package oop.input_output;

//import java.nio.File;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.Files;
import java.nio.file.*;
import java.io.IOException;

public class JavaNewIO {

    public static void main(String[] args) {

        Path path = Paths.get("logFolder/newLogFile.txt");

        try {

            Files.write(path, "Created new log file!".getBytes());

            byte[] bytes = Files.readAllBytes(path);
            String content = new String(bytes);

            System.out.println(content);

        } catch (IOException ioe) {
            System.out.println("Err: " + ioe.getMessage());
        }
    }
}
