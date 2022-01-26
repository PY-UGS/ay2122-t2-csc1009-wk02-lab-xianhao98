import java.util.Scanner;

public class tutorial2Q1 {
    static final double PI = 3.14159;
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a byte value: ");
        byte byteValue = input.nextByte();

        System.out.print("Enter a short value: ");
        short shortValue = input.nextShort();
        
        System.out.print("Enter a int value: ");
        int intValue = input.nextInt();

        System.out.print("Enter a long value: ");
        long longValue = input.nextLong();

        System.out.print("Enter a float value: ");
        float floatValue = input.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleValue = input.nextDouble();

        System.out.print("Enter a char value: ");
        char charValue = input.next().charAt(0);

        System.out.println("Byte value entered: " + byteValue);
        System.out.println("Short value entered: " + shortValue);
        System.out.println("Int value entered: " + intValue);
        System.out.println("Long value entered: " + longValue);
        System.out.println("Float value entered: " + floatValue);
        System.out.println("Double value entered: " + doubleValue);
        System.out.println("Char value entered: " + charValue);

        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        
        double area = radius * radius * PI;

        System.out.println("The area for the circle of radius " + radius + " is " + area);
        input.close();
       
    }
}
