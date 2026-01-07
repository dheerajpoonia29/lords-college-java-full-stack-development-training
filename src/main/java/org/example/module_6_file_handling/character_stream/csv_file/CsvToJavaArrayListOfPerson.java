package org.example.module_6_file_handling.character_stream.csv_file;

import com.sun.security.jgss.GSSUtil;

import java.io.*;
import java.util.ArrayList;

public class CsvToJavaArrayListOfPerson {
    public static void main(String[] args) throws IOException {
        System.out.println("Reading CSV file and converting to ArrayList of Person objects:");

        ArrayList<Person> personArray = new ArrayList<>();

        // [ {name, age, city}, {...}, {...} ]

        // reading from csv file and converting to java object
//        personArray = csvFiletoJavaObject(personArray);
//        for (Person person : personArray) {
//            System.out.println("Name: " + person.name + ", Age: " + person.age + ", City: " + person.city);
//        }

        personArray.add(new Person("Jiva", 30, "New York"));
        personArray.add(new Person("Abhey", 25, "Los Angeles"));
        personArray.add(new Person("Ram", 35, "Chicago"));
        personArray.add(new Person("Charley", 28, "Houston"));

        // write this arraylist to csv file
        String content = "name, age, city\n";
        for (Person person : personArray) {
            String line = person.name + ", " + person.age + ", " + person.city;
            content += line + "\n";
        }
        javaObjectToCsvFile(content);

    }

    private static void javaObjectToCsvFile(String content) throws IOException {
        FileWriter fileReader = new FileWriter("src/main/java/org/example/module_6_file_handling/character_stream/csv_file/person2.csv");
        BufferedWriter bufferedReader = new BufferedWriter(fileReader);

        bufferedReader.write(content);

        bufferedReader.close();
        fileReader.close();
    }

    public static ArrayList<Person> csvFiletoJavaObject(ArrayList<Person> personArray) throws IOException {
        FileReader fileReader = new FileReader("src/main/java/org/example/module_6_file_handling/character_stream/csv_file/person.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        int i=0;
        while((line = bufferedReader.readLine()) != null) {
            if(i==0) {i++; continue;}; // skip header

            // convert line and store in string array
            String[] arr = line.split(",");

            arr[1] = arr[1].trim();
            Person person = new Person(arr[0], Integer.parseInt(arr[1]), arr[2]);
            personArray.add(person);

            i++;
        }

        return personArray;
    }


}
