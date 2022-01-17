package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
    static double seconds = 60;
    static double minutes = 60; // 60 sec = 1 minute
    static double hours = 60; // 60 min = 1 hour
    static double days = 24; // 24 hours = 1 day
    static double years = 365.25; // 365,25 days for 1 year (Leap year counted)

    static DecimalFormat df = new DecimalFormat("#.00");

    public static void main( String[] args ) {
        input();
    }

    public static void input() {
        boolean flag = true;

        while (flag) {
            System.out.println("******* Time Calculator *******");
            System.out.println("Choose an option to start. From: " +
                    "\n1. Seconds \n2. Minutes\n3. Hours\n4. Days\n5. Years\n9. Quit");

            Scanner userInputFrom = new Scanner(System.in);
            int from = userInputFrom.nextInt();

            Scanner userInputTo = new Scanner(System.in);
            Scanner userInputValue = new Scanner(System.in);

            if (from == 1){
                System.out.println("To: " + "\n1. Minutes \n2. Hours\n3. Days\n4. Years\n9. Quit");
                int to = userInputTo.nextInt();

                if (to != 9) {
                    System.out.println("Enter your value: ");
                    int value = userInputValue.nextInt();

                    if (to == 1){
                        secToMin(value);
                    } else if (to == 2){
                        secToHour(value);
                    } else if (to == 3){
                        secToDays(value);
                    } else if (to == 4){
                        secToYears(value);
                    }
                } else {
                    System.out.println("Quitting...");
                    flag = false;
                }

            } else if (from == 2){
                System.out.println("To: " + "\n1. Seconds \n2. Hours\n3. Days\n4. Years\n9. Quit");
                int to = userInputTo.nextInt();

                if (to != 9) {
                    System.out.println("Enter your value: ");
                    int value = userInputValue.nextInt();

                    if (to == 1){
                        minToSec(value);
                    } else if (to == 2){
                        minToHour(value);
                    } else if (to == 3){
                        minToDays(value);
                    } else if (to == 4){
                        minToYears(value);
                    }
                } else {
                    System.out.println("Quitting...");
                    flag = false;
                }

            } else if (from == 3) {
                System.out.println("To: " + "\n1. Seconds \n2. Minutes\n3. Days\n4. Years\n9. Quit");
                int to = userInputTo.nextInt();

                if (to != 9) {
                    System.out.println("Enter your value: ");
                    int value = userInputValue.nextInt();

                    if (to == 1){
                        hourToSec(value);
                    } else if (to == 2){
                        hourToMin(value);
                    } else if (to == 3){
                        hourToDay(value);
                    } else if (to == 4){
                        hourToYear(value);
                    }
                } else {
                    System.out.println("Quitting...");
                    flag = false;
                }

            } else if (from == 4){
                System.out.println("To: " + "\n1. Seconds \n2. Minutes\n3. Hours\n4. Years\n9. Quit");
                int to = userInputTo.nextInt();

                if (to != 9) {
                    System.out.println("Enter your value: ");
                    int value = userInputValue.nextInt();

                    if (to == 1){
                        dayToSec(value);
                    } else if (to == 2){
                        dayToMin(value);
                    } else if (to == 3){
                        dayToHour(value);
                    } else if (to == 4){
                        dayToYear(value);
                    }
                } else {
                    System.out.println("Quitting...");
                    flag = false;
                }

            } else if (from == 5){
                System.out.println("To: " + "\n1. Seconds \n2. Minutes\n3. Hours\n4. Days\n9. Quit");
                int to = userInputTo.nextInt();

                if (to != 9) {
                    System.out.println("Enter your value: ");
                    int value = userInputValue.nextInt();

                    if (to == 1){
                        yearToSec(value);
                    } else if (to == 2){
                        yearToMin(value);
                    } else if (to == 3){
                        yearToHour(value);
                    } else if (to == 4){
                        yearToDay(value);
                    }
                } else {
                    System.out.println("Quitting...");
                    flag = false;
                }
            } else if (from == 9){
                System.out.println("Quitting...");
                flag = false;
            }
        }
    }

    // ****************************** Seconds ******************************
    public static void secToMin(double sec){
        double result = sec/minutes;
        System.out.println("There is " + df.format(result) + " minutes in " + sec + " seconds");
    }

    public static void secToHour(double sec) {
        double result = sec/minutes/hours;
        System.out.println("There is " + df.format(result) + " hours in " + sec + " seconds");
    }

    public static void secToDays(double sec) {
        double result = sec/minutes/hours/days;
        System.out.println("There is " + df.format(result) + " days in " + sec + " seconds");
    }

    public static void secToYears(double sec) {
        double result = sec/minutes/hours/days/years;
        System.out.println("There is " + df.format(result) + " years in " + sec + " seconds");
    }

    // ****************************** Minutes ******************************
    public static void minToSec(double min){
        double result = min*seconds;
        System.out.println("There is " + df.format(result) + " seconds in " + min + " minutes");
    }

    public static void minToHour(double min){
        double result = min/hours;
        System.out.println("There is " + df.format(result) + " hours in " + min + " minutes");
    }

    public static void minToDays(double min){
        double result = min/hours/days;
        System.out.println("There is " + df.format(result) + " days in " + min + " minutes");
    }

    public static void minToYears(double min){
        double result = min/hours/days/years;
        System.out.println("There is " + df.format(result) + " years in " + min + " minutes");
    }

    // ****************************** Hours ******************************
    public static void hourToSec(double hour){
        double result = hour*minutes*seconds;
        System.out.println("There is " + df.format(result) + " seconds in " + hour + " hours");
    }

    public static void hourToMin(double hour){
        double result = hour*minutes;
        System.out.println("There is " + df.format(result) + " minutes in " + hour + " hours");
    }

    public static void hourToDay(double hour){
        double result = hour/days;
        System.out.println("There is " + df.format(result) + " days in " + hour + " hours");
    }

    public static void hourToYear(double hour){
        double result = hour/days/years;
        System.out.println("There is " + df.format(result) + " years in " + hour + " hours");
    }

    // ****************************** Days ******************************
    public static void dayToSec(double day){
        double result = day*minutes*seconds;
        System.out.println("There is " + df.format(result) + " seconds in " + day + " days");
    }

    public static void dayToMin(double day){
        double result = day*minutes*hours;
        System.out.println("There is " + df.format(result) + " minutes in " + day + " days");
    }

    public static void dayToHour(double day){
        double result = day*hours;
        System.out.println("There is " + df.format(result) + " hours in " + day + " days");
    }

    public static void dayToYear(double day){
        double result = day/years;
        System.out.println("There is " + df.format(result) + " years in " + day + " days");
    }

    // ****************************** Years ******************************
    public static void yearToSec(double year){
        double result = year*seconds*minutes*hours*years;
        System.out.println("There is " + df.format(result) + " seconds in " + year + " years");
    }

    public static void yearToMin(double year){
        double result = year*minutes*hours*years;
        System.out.println("There is " + df.format(result) + " minutes in " + year + " years");
    }

    public static void yearToHour(double year){
        double result = year*hours*years;
        System.out.println("There is " + df.format(result) + " hours in " + year + " years");
    }

    public static void yearToDay(double year){
        double result = year*years;
        System.out.println("There is " + df.format(result) + " days in " + year + " years");
    }
}
