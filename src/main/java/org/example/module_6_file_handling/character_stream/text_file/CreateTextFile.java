package org.example.module_6_file_handling.character_stream.text_file;

import java.io.File;
import java.io.IOException;

public class CreateTextFile {
    public static void main(String[] args) throws IOException {
        File obj = new File("src/main/java/org/example/module_6_file_handling/character_stream/text_file/myTextFile1.txt");

        if (obj.createNewFile()) {
            System.out.println("File Created");
        } else {
            System.out.println("File already exists");
        }
    }
}
