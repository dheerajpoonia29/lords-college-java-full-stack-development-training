package org.example.module_6_file_handling.character_stream;

public class Assignement {
    enum action {
        LOGIN,
        LOGOUT
    }

    public static void log(String userType, action userAction) {
        // open the log.txt file in write + append mode


        // save the entry with today date & time
    }

    public static void main(String[] args) {
        log("admin", action.LOGIN);
        log("teacher", action.LOGOUT);
        log("admin", action.LOGIN);
    }
}
