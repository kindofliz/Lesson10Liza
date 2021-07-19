import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {

        //APP that counts how many coffees we drink in a week

        int[] coffeeArray = new int[7];

        coffeeArray[0] = 3;
        coffeeArray[1] = 4;
        coffeeArray[2] = 12;
        coffeeArray[3] = 2;
        coffeeArray[4] = 1;
        coffeeArray[5] = 0;
        coffeeArray[6] = 1;

        int coffeeCounter = 0;

        for (int i = 0; i < coffeeArray.length; i++) {
            coffeeCounter += coffeeArray[i];
        }
        System.out.println("Total number of coffees this week: " + coffeeCounter);


        //2d array

        int[][] my2DArray = {{1, 2, 4, 7}, {11, 12, 13, 14}, {22, 23, 24, 5}};
        System.out.println("This is an element of row index=2 and column= index=3: " + my2DArray[2][3]);


        //Task GROUP3 - implement the array drawn in paint.

        int[][] paint2DArray = {{125, 91, 90}, {55, 5, 211}, {77, 19, 21}};

        //Printing out by the index:
        System.out.println("Row: 0, column: 0, value: " + paint2DArray[0][0]);
        System.out.println("Row: 0, column: 1, value: " + paint2DArray[0][1]);
        System.out.println("Row: 0, column: 2, value: " + paint2DArray[0][2]);
        System.out.println();
        System.out.println("Row: 1, column: 0, value: " + paint2DArray[1][0]);
        System.out.println("Row: 1, column: 1, value: " + paint2DArray[1][1]);
        System.out.println("Row: 1, column: 2, value: " + paint2DArray[1][2]);
        System.out.println();
        System.out.println("Row: 2, column: 0, value: " + paint2DArray[2][0]);
        System.out.println("Row: 2, column: 1, value: " + paint2DArray[2][1]);
        System.out.println("Row: 2, column: 2, value: " + paint2DArray[2][2]);

        //Another (better) way to print, using a nested LOOP
        int[][] looped2DArray = {{125, 91, 90}, {55, 5, 211,}, {77, 19, 21,}};

        for (int i = 0; i < 2; i++) {

            //Some code can be executed before traversing the line below
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.println("Indexes: i - " + i + "; j - " + j + "; value = " + looped2DArray[i][j]);
            }
            //Some code can be executed after traversing the line above
        }

        // FOR EACH loop EXAMPLE

        int[] forLoopArray = {5, 6, 7, 1, 1};
        for (int internalValue : forLoopArray) {
            System.out.println("For loop element: " + internalValue);

        }


        // WHILE LOOP EXAMPLE

        int clockTime = 0;

        while (clockTime <= 24) {
            System.out.println("The time is: " + clockTime + " o'clock");
            clockTime += 3;
        }

        boolean runWhileLoop = true;

        while (runWhileLoop) {
            System.out.println(" variable runWhileLoop is still set to true, so i'm running");

            if (clockTime > 100) {
                runWhileLoop = false;
            }
            clockTime++;

        }

        //REAL LIFE WHILE LOOP EXAMPLE
        int menuItem = 99;

        Scanner scanner = new Scanner(System.in);

        while (menuItem != 0) {
            System.out.println();
            System.out.println("Please select an action you want to do");
            System.out.println("1 - write that you are smart");
            System.out.println("2 - write that you are pretty");
            System.out.println("3 - write that you are the best");
            System.out.println("0 - Exit the app (but you are still the best!");

            menuItem = scanner.nextInt();

            if(menuItem == 1) {
                System.out.println("You are smart");
            } else if (menuItem == 2) {
                System.out.println("You are pretty");
            } else if (menuItem == 3) {
                System.out.println("You are the best!");
            } else {
                System.out.println("There is no such option!");
            }

        }

        //DO WHILE EXAMPLE

        int initialValue = 10;

        //won't run at all
        while (initialValue < 5) {
            System.out.println("WHILE LOOP, INITIAL VALUE < 5");
        }

        //will run only once
        do {
            System.out.println("DO WHILE LOOP, INITIAL VALUE < 5");
        } while (initialValue < 5);



    }
}
