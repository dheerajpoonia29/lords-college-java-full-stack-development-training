package org.example.module_6_file_handling.character_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.time.LocalDateTime;

public class Assignement {
    enum action {
        LOGIN,
        LOGOUT
    }

    public static void log(String userType, action userAction) throws IOException {
        // open the log.txt file in write + append mode
        FileWriter fw = new FileWriter("src/main/java/org/example/module_6_file_handling/character_stream/log.txt", true);
        BufferedWriter br = new BufferedWriter(fw);

        // save the entry with today date & time
        String content = LocalDateTime.now() + "| User:" + userType + " | Action" + userAction;
        br.write(content);
        br.newLine();

        br.close();
    }

    public static void main(String[] args) throws IOException {
        log("admin", action.LOGIN);
        log("teacher", action.LOGOUT);
        log("admin", action.LOGIN);
    }
}
