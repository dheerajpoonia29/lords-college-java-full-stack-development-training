package org.example.module_6_file_handling.character_stream.csv_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsvFile {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/main/java/org/example/module_6_file_handling/character_stream/csv_file/person.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            String[] arr =  line.split(",");
        }
    }
}
