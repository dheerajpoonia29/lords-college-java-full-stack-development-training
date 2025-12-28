package org.example.module_2_fundamentals.control_flow;

public class SwitchExample {

    public static void main(String[] args) {
        int day = 5;
        String dayName;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
            case 6:
//                !! 5!=6 so why this statement is executed
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
                break;
            default:
                dayName = "Invalid day";
        }
    }
}
