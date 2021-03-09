package ru.matyunin.inno.task1.exceptions;

import java.util.Scanner;

public class UserExceptionApp {


    public static void main(String[] args) {
        System.out.println("Введите  1 для вызова ArrayIndexOutOfBoundsException, или 2 для вызова NullPointerException, или 3 для вызова собственной ошибки");
        Scanner scanner = new Scanner(System.in);
        int userCommand = scanner.nextInt();
        userCommandMethod(userCommand);
    }

    private static void userCommandMethod(int userCommand) {
        switch (userCommand) {
            case 1:
                arrayIndexOutOfBoundsCallMethod();
                break;
            case 2:
                nullPointerCallMethod(null);
                break;
            case 3:
                userExceptionCallMethod();
                break;
        }
    }

    private static void arrayIndexOutOfBoundsCallMethod() {
        System.out.println("Hello, World!".toCharArray()[50]);
    }

    static Object nullPointerCallMethod(Object obj) {
        return obj.toString();
    }

    private static void userExceptionCallMethod() {
        throw new IllegalStateException("This my exception");
    }
}
