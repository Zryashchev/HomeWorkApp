package ru.geekbrains.lesson_1.HomeWorkApp;

public class HomeWorkApp {
public static void main(String[] args) {
    within10and20();
    isPositiveOrNegative();
    isNegative();
    printWordNTimes();
}
//mission-1
public static boolean within10and20() {
    int a = 9;
    int b = 8;
    int sum = a + b;
    if (sum <= 20 & sum >= 10) {
        System.out.println("true");
        return true;
    } else {
        System.out.println("false");
        return false;
    }
}
//mission-2
private static void isPositiveOrNegative() {
    int x = 6;
    if (x >= 0) {
        System.out.println("+");
    } else {
        System.out.println("-");
    }
}
//mission-3
private static boolean isNegative() {
    int y = -2;
    if (y < 0) {
        System.out.println("-");
    return true;
    } else {
        System.out.println("+");
        return false;
    }
}
//mission-4
private static void printWordNTimes() {
    for (int i = 0; i < 8; i++) {
        System.out.println("times = " + i);
    }
}
}