import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {
        

        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt and read "a" then "b"
        int a = readNum(input);
        int b = readNum(input);

        // check if the value's even digits are equal
        Boolean isEven = gatherSum(a, b);


    }

    // reads an integer; if negative, method is called again; if positive, integer is retruned
    public static int readNum(Scanner input) {

        // prompt user
        System.out.print("Please enter a positive an integer: ");

        // read integer
        int x = input.nextInt();

        if (x > 0)
            // return the valid integer
            return x;
        else  
            // call the function again if the integer is invalid  
            return readNum(input); 

    }

    public static Boolean gatherSum(int a, int b) {

        int evenA = sumEven(a), evenB = sumEven(b);

        // test
        int lengthA = getLength(a),
            lengthB = getLength(b);
        System.out.printf("%d has %d digits and the sum of the even integers is %d \n", a, lengthA, evenA);
        System.out.printf("%d has %d digits and the sum of the even integers is %d \n", b, lengthB, evenB);
        return true;

    }

    // returns the sum of even digits in a number
    public static int sumEven(int z) {

        // store the sum of evens
        int even = 0;

        while (z >= 10) {

            // isolate digit
            int digit = z % 10;

            // if digit is divisible by 2 add it to even.
            if (digit % 2 == 0) even += digit;

            // divide z by ten to get next digit
            z /= 10;
        }

        // return the sum of even digits
        return even;
    }

    // returns the number of digits in an integer
    public static int getLength(int y) {

        // used to keep track of length
        int length = 0;

        // get the number of digits in y
        while (y > 0) {
            y /= 10;
            length++;
        }

        return length;
    }
}