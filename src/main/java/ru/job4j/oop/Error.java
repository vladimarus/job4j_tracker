package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean ac, int st, String ms) {
        active = ac;
        status = st;
        message = ms;
    }

    public void printInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error defaultError = new Error();
        Error errorDiv0 = new Error(true, 1, "Division by zero");
        Error errorStackOwf = new Error(true, 2, "Stack overflow");
        Error errorIndexOutOfBounds = new Error(false, 3, "Index out of bounds");
        defaultError.printInfo();
        errorDiv0.printInfo();
        errorStackOwf.printInfo();
        errorIndexOutOfBounds.printInfo();
    }
}
