package com.company;

import java.util.Scanner;

public class ConsoleReader {
    private Scanner scanner;

    ConsoleReader() {
        scanner = new Scanner(System.in);
    }

    public void readUserInput() {

        printMessage("enter something");
        String userInput = scanner.nextLine();
        printMessage("you entered:  " + userInput);

    }

    private void printMessage(String message) {
        System.out.println(message);
    }
}
