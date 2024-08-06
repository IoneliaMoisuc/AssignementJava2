package org.example;

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


    // 4.(ELSE)  Create a String method that takes a String parameter.
    // Check if the text that comes as a parameter equals "Evozon".
    // If yes, then the method should return "Learning text comparison". If not, the method should return "Got to try some more".
    // Hint 1: Text is not compared with ==, but with .equals().
    // Hint 2: .equals() compares both lowercase and uppercase letters and sees them as different (i.e., "test" is not equal to "Test").


    public String Comparison(String text) {
        if (text.equals("Evozon")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }


    //  5. (ELSE). Create a String method that takes a String parameter and an int parameter.
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


//2.(Loops) Create a method in the LogicalOp class that takes a number as a parameter.
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

    //7(Loops). Create a method in the LogicalOp class that takes a number parameter.
    // The method should add all numbers up to 100,starting from the number received as a parameter,
    // and return the result at the end. Call the method in the Main class, main() method to check if it works..

    public int addAllNumbersToHundred(int a) {
        int sum = 0;
        for (int i = a; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }

    //8(Loops). Create a method in the LogicalOp class that takes a number parameter.
    // The method should add all numbers up to 100, starting from the number received as a parameter,
    // and calculate the average of the numbers. In the end, the method should return the average.
    // Call the method in the Main class, main() method to check if it works.

    public float avverageOfNumbers(int a) {
        int sum = 0;
        int nr = 0;
        for (int i = a; i <= 100; i++) {
            sum = sum + i;
            nr = nr + 1;
        }
        return (float) sum / nr;
    }


    //9 (Loops). Create a method in the LogicalOp class that displays the following pattern:
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
        for (int i = 1; i <= 7; i++) {
            for (int j = i; j <= 7; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }


    // 4. (While Loop) Create a method in the LogicalOp class that receives two number parameters.
    // The method should check which of the two numbers is larger and perform an ascending countdown from the smallest to the largest
    // (e.g., if int x is the first parameter and int y is the second, if x is larger than y, then the countdown should be from y to x).
    // Pay attention to the method type,
    // as the method prints, it does not return. Call the method in the Main class, main() method to verify if it works.

    public void ascendingCountDownBetweenNumbers(int number1, int number2) {
        int max = getHigherNumber(number1, number2);
        int min = getLowerNumber(number1, number2);

        while (min <= max) {
            System.out.println(min);
            min++;
        }
    }


    //5. (While Loop) Create a method in the LogicalOp class that prints all even numbers from 1 to 100.

    public void evenNumbersFromOneToHundred() {
        int start = 1;
        int end = 100;
        int i = start;

        while (i <= end) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    //6.(While Loop) Create a method in the LogicalOp class that prints all odd numbers from 1 to 100.
    // public void printNumbersFromOneToHundred(int number1, int number2) {

    public void oddNumbersFromToHundred() {
        int start = 0;
        int end = 100;
        int i = start;

        while (i <= end) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }


    //7.(While Loop) Create a method that sums all the numbers in the range 111 to 8899.
    // Print the total sum, and then calculate and print the average of the numbers in that range.
    // Introduce an int count variable in the method to count all the numbers in the range.
    // Call the method in the Main class, main() method to verify if it works.


    public void sumAndAverage() {
        int start = 111;
        int end = 8899;
        int sum = 0;
        int count = 0;

        while (start <= end) {
            sum += start;
            count++;
            start++;
        }
        double average = (double) sum / count;

        System.out.println("Total sum:" + sum);
        System.out.println("Total count:" + count);
        System.out.println("Average:" + average);

    }


    //8.(While Loop)Create a method that receives two number parameters
    // and returns the average of numbers divisible by 7 in that range.
    // Call the method in the Main class, main() method to verify if it works.

    public double averageNumbersDivisibleBy7(int start, int end) {
        int sum = 0;
        int count = 0;
        int current = Math.min(start, end);
        int upperLimit = Math.max(start, end);

        while (current <= upperLimit) {
            if (current % 7 == 0) {
                sum += current;
                count++;
            }
            current++;
        }
        if (count == 0) {
            return 0;
        } else {
            return (double) sum / count;
        }
    }


    //9.(While Loop) Create a method that prints the first 20 numbers in the Fibonacci sequence.

    public void printFibonacciSequence(int n) {
        int count = 0;
        int num1 = 0, num2 = 1;

        System.out.print("First " + n + " numbers in Fibonacci: ");
        while (count < n) {
            System.out.print(num1 + " ");

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            count++;
        }
    }


    //10.(While Loop)Create a method called CozaLozaWoza.
//    The method will print:
//            - numbers from 1 to 110
//            - 11 numbers per line
//- Display "Coza" for numbers that are multiples of 3 (e.g., 1 2 Coza 4)
//            - Display "Loza" for numbers that are multiples of 5 (e.g., 2 3 4 Loza 6)
//            - Display "Woza" for numbers that are multiples of 7 (e.g., 4 5 6 Woza 8)
//            - Display "CozaLoza" for numbers that are multiples of both 3 and 5
//            - Display "CozaWoza" for numbers that are multiples of both 3 and 7
//            - Display "WozaLoza" for numbers that are multiples of both 5 and 7
//            - Display "CozaLozaWoza" for numbers that are multiples of 3, 5, and 7
//    It should look similar to:
//            1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11
//    Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22
//            23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza
//......
//    Call the method in main() to verify if it works.


    public void cozaLozaWoza() {
        int number = 1;
        int count = 0;

        while (number <= 110) {
            String output = "";

            if (number % 3 == 0) {
                output += "Coza";
            }
            if (number % 5 == 0) {
                output += "Loza";
            }
            if (number % 7 == 0) {
                output += "Woza";
            }
            if (output.isEmpty()) {
                output = String.valueOf(number);
            }

            System.out.print(output + " ");
            count++;

            if (count == 11) {
                System.out.println();
                count = 0;
            }
            number++;
        }
    }

    public int[] populateArray(int length) {
        int[] myArray = new int[length];
        for (int i = 0; i < length; i++) {
            myArray[i] = i + 1;
        }
        return myArray;
    }

//3. (Array) Create a method that takes an empty int array as a parameter and returns it
    // populated with all even values from 1 to 100. Call the method in main() to verify if it works.
    // Note, that the method returns an array, so it should be captured and displayed using a loop.

//    public int[] populateEvenArray() {
//        int currentPosition = 0;
//        for (int i = 1; i <= 100; i++) {
//
//            if (i % 2 == 0) {
//                array[currentPosition++] = i;
//            }
//            return array;
//        }
//    }





    //4.(Array). Create a method that takes an array of numbers as a parameter, populated with values.
    // The method should calculate and return the average of the numbers in the array.
    // Call the method in main() to verify if it works.
//
//    public double returnAverageOfNumbers() {
//        int sum = 0;
//        int[] numbers =new int[10];
//        for (int num : numbers) {
//            sum += num;
//        }
//        return (double) sum / numbers.length;
//    }



        //     int[] myArray = new int[length];
        //        for (int i = 0; i < length; i++) {
        //            myArray[i] = i + 1;
        //        }
        //        return myArray;








    }





