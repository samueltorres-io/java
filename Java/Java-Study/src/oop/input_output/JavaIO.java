package oop.input_output;

import java.io.*;

public class JavaIO {

    private void writeLogFile(String log) throws IOException {
        try {
            FileWriter writer = new FileWriter("logFolder/logFile.txt"); // (FileWriter("<fileName>", true))
            writer.write(log);
            writer.close();
        } finally {
            System.out.println("Final of create file log function!");
        }
    }

    private void readLogFile() throws IOException {
        try {
            FileReader reader = new FileReader("logFolder/logFile.txt");

            int data;

            while ((data = reader.read()) != -1 ) {
                System.out.print((char)data);
            }
            reader.close();
        } finally {
            System.out.println("\nFinal of read file log!");
        }
    }

    public void logFile(String log) {
        try {
            this.writeLogFile(log);
            this.readLogFile();
        } catch (IOException ioe) {
            System.out.println("Err: " + ioe.getMessage());
        }
    }

    public static void main(String[] args) {

    JavaIO javaFile = new JavaIO();
    javaFile.logFile("Created log file!");


    }
}