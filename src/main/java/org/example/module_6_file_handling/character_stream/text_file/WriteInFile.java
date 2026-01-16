package org.example.module_6_file_handling.character_stream.text_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {
    public static void main(String[] args) throws IOException {
        String path = "src/main/java/org/example/module_6_file_handling/character_stream/text_file/myTextFile1.txt";
        FileWriter obj = new FileWriter(path, true);
//        obj.write("Hello World!\nWelcome to File Handling in Java.");
//        obj.write("\nThis is written using FileWriter.");
//        obj.close();
//        System.out.println("Successfully wrote to the file.");

        BufferedWriter bufferedWriter = new BufferedWriter(obj);
        bufferedWriter.write("Hello World!\nWelcome to File Handling in Java.");
        bufferedWriter.write("\nThis is written using FileWriter.");
        bufferedWriter.close();
        System.out.println("Successfully wrote to the file using BufferedWriter.");
    }
}
