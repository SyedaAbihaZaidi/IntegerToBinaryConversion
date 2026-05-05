import java.util.Scanner;

public class BinaryConversionAssignment {

    // Part (b): Function returns binary digits in an integer array
    public static int[] binaryArray(int number) {
        int temp = number;
        int count = 0;

        if (number == 0) {
            return new int[]{0};
        }

        while (temp > 0) {
            count++;
            temp = temp / 2;
        }

        int[] binary = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            binary[i] = number % 2;
            number = number / 2;
        }

        return binary;
    }

    // Part (c): Function returns binary digits as a String
    public static String binaryString(int number) {
        if (number == 0) {
            return "0";
        }

        String binary = "";

        while (number > 0) {
            int remainder = number % 2;
            binary = remainder + binary;
            number = number / 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Part (a)
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();

        System.out.println("Binary using string function: " + binaryString(number));

        // Part (b)
        int[] resultArray = binaryArray(number);
        System.out.print("Binary using integer array function: ");
        for (int bit : resultArray) {
            System.out.print(bit);
        }

        System.out.println();

        input.close();
    }
}
