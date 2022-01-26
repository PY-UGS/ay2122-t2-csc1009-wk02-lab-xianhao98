import java.util.Scanner;

public class tutorial2Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double firstValue = input.nextDouble();
        double secondValue = input.nextDouble();
        double thirdValue = input.nextDouble();

        double average = (firstValue + secondValue + thirdValue) / 3;

        System.out.println("The average of " + firstValue + " " + secondValue + " " + thirdValue + " is " + average);
        input.close();
    }
}
