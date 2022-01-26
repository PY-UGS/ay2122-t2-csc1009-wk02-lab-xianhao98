import java.util.Scanner;

public class tutorial2Q4 {
    public static void main(String[] args) {
        String[] zodiacs = {"monkey","rooster","dog","pig","rat","ox","tiger","rabbit","dragon","snake","horse","sheep"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        int zodiacNum = year % 12;
        System.out.println(zodiacs[zodiacNum]);
        input.close();
    }
}
