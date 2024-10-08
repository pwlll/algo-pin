import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        PinAlgo pin=new PinAlgo(scanner.nextInt());
        pin.showPin();
        pin.saveToFile();
    }
}