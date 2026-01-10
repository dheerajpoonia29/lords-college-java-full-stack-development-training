package org.example.module_6_file_handling.character_stream.json_file;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadJsonFile {
    public static void main(String[] args) throws IOException {
        FileReader obj = new FileReader("src/main/java/org/example/module_6_file_handling/character_stream/json_file/address.json");
        BufferedReader obj2 = new BufferedReader(obj);

        // we can not read json file line by line because of it's different data structure
//        String line;
//        while ((line = obj2.readLine()) != null) {
//            System.out.println(line);
//        }

        ObjectMapper objectMapper = new ObjectMapper();
        Person personObj = objectMapper.readValue(obj2, Person.class);
        System.out.println(personObj.toString());
    }
}
