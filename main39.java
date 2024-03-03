import java.time.LocalDateTime;

public class Main {
    public static void displayCurrentDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);
    }

    public static void main(String[] args) {
        displayCurrentDateTime();
    }
}
