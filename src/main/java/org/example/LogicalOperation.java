package org.example;

import java.sql.SQLOutput;

public class LogicalOperation {

    public int getHigherNumber(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            return secondNumber;
        } else if (firstNumber == secondNumber) {
            return firstNumber;
        } else {
            return firstNumber;
        }
    }

    public int getLowerNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return secondNumber;
        } else if (firstNumber == secondNumber) {
            return firstNumber;
        } else {
            return firstNumber;
        }
    }

    public void countToHundred(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }

    }

    public void whileCountToHundred(int number) {
        while (number >= 100) {
            System.out.println(number);
            number--;
        }
    }

    public void countdownBetweenNumbers(int number1, int number2) {
        int max = getHigherNumber(number1, number2);
        int min = getLowerNumber(number1, number2);

        while (max >= min) {
            System.out.println(max);
            max--;
        }
    }


    //  4.(ELSE)  Create a String method that takes a String parameter.
    //  Check if the text that comes as a parameter equals "Evozon".
    //  If yes, then the method should return "Learning text comparison". If not, the method should return "Got to try some more".
    //Hint 1: Text is not compared with ==, but with .equals().
    //Hint 2: .equals() compares both lowercase and uppercase letters and sees them as different (i.e., "test" is not equal to "Test").

    public String Comparison(String text) {
        if (text.equals("Evozon")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }


    // 5. (ELSE). Create a String method that takes a String parameter and an int parameter.
    //  If the text received as a parameter is equal to "Evozon", and the number received as a parameter
    //  is less than or equal to 3, return the text and the number in this order. If the text is not "Evozon"
    //  and the number is greater than or equal to 4, return the number and the text in this order.
    //  Call the method in main() to check if it works.

    public String ComparisonStringNumber(String text, int number) {

        if (text.equals("Evozon") && number <= 3) {
            return text + number;
        } else if (!text.equals("Evozon") && number >= 4) {
            return number + text;
        } else
            return "Nici o conditie indeplinita";
    }


//2.(Loop)  Create a method in the LogicalOp class that takes a number as a parameter.
// The method should check the received number and display in the console a count down to -100,
// starting from the number received as a parameter.
// Pay attention to the type of method created, as the method displays, not returns.

    public void countDownToHundred(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }


    //4.(Loops) Create a method in the LogicalOp class that takes two number parameters.
    // The method should display a count between the two received numbers,
    // starting from the first parameter received to the second
    // (e.g., if int x is the first parameter and int y is the second, the count should be from x to y).
    // Pay attention to the type of method created, as the method displays, not returns.
    // Call the method in the Main class, main() method to check if it works.

    public void countBetweenToNumber(int x, int y) {
        if (x <= y) {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = x; i >= y; i--) {
                System.out.println(i);
            }
        }
    }

    //7. Create a method in the LogicalOp class that takes a number parameter.
    // The method should add all numbers up to 100,starting from the number received as a parameter,
    // and return the result at the end. Call the method in the Main class, main() method to check if it works..

    public int addAllNumbersToHundred(int a) {
        int sum = 0;
        for (int i = a; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }

    //8. Create a method in the LogicalOp class that takes a number parameter.
    // The method should add all numbers up to 100, starting from the number received as a parameter,
    // and calculate the average of the numbers. In the end, the method should return the average.
    // Call the method in the Main class, main() method to check if it works.

    public float avverageOfNumbers(int a) {
        int sum = 0;
        int nr = 0;
        for (int i = a; i <= 100; i++) {
            sum = sum + i;
            nr = nr +1;
        }
        return (float)sum/nr;
    }




    //9. Create a method in the LogicalOp class that displays the following pattern:
    //  *******
    //  ******
    //  *****
    //  ****
    //  ***
    //  **
    //  *
//    Some notes:
//    To solve this problem, you need to use two for loops. One loop will be nested inside the other.
//    The first for loop will handle the horizontal display, and the other will handle the vertical display.
//     The asterisk (*) sign can be displayed as a string.
//    Call the method in the Main class, main() method to check if it works.

    public void displaysPattern() {
        for (int i = 1 ; i <= 7; i++) {
            for (int j = i; j <= 7; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}








