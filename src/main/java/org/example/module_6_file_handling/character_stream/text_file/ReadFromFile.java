package org.example.module_6_file_handling.character_stream.text_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        String path = "src/main/java/org/example/module_6_file_handling/character_stream/text_file/myTextFile1.txt";

        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
        fileReader.close();
    }
}
