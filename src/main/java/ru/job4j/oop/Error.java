package ru.job4j.oop;

public class Error {

    boolean active;
    int status;
    String message;

    public Error() {
        this.active = false;
        this.status = 0;
        this.message = "null";
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void showInfo() {
        System.out.println(this.active + " " + this.status + " " + this.message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error err = new Error(true, 1, "message");
        error.showInfo();
        err.showInfo();
    }
}
