import java.security.InvalidParameterException;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int sortDesc(final int num) {
        if (num < 0) {
            throw new InvalidParameterException("Chosen integer must be positive");
        }
        // Convert the integer to a char array
        char[] digits = Integer.toString(num).toCharArray();
        System.out.println(digits);
        Arrays.sort(digits);
        System.out.println(digits);

        int left = 0;
        int right = digits.length-1;

        while (left < right) {
            char temporary = digits[left];
            digits[left] = digits[right];
            digits[right] = temporary;
            left++;
            right--;
        }

        // Join the sorted digits back into a string and return the integer
        return Integer.parseInt(new String(digits));
    }

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println("0: " + sortDesc(0));
        System.out.println("51: " + sortDesc(15));
        System.out.println("987654321: " + sortDesc(123456789));
    }
}