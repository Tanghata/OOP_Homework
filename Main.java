package OOP_Homework;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator homeCalculator = new Calculator();
        homeCalculator.setManufacturer("Casio");
        homeCalculator.setColor("Black");
        String myCalculatorColor = homeCalculator.getColor();
        String myCalculatorModel = homeCalculator.getManufacturer();

        Scanner reader = new Scanner(System.in);
        System.out.println("Please specify what you want to calculate (enter the corresponding number):");
        System.out.println("1. Sum of two numbers");
        System.out.println("2. Difference of two numbers");
        System.out.println("3. Product of two numbers");
        System.out.println("4. Quotient of two numbers");
        System.out.println("5. Sum of more than two numbers");
        System.out.println("6. Product of more than two numbers");
        System.out.println("7. Area of a circle");
        System.out.println("8. Exit the program");
        int typeOfCalculation = reader.nextInt();

        if (typeOfCalculation==1 || typeOfCalculation==2 || typeOfCalculation==3 || typeOfCalculation==4) {
            System.out.print("Please enter the first number: ");
            homeCalculator.setNumberA(reader.nextInt());
            System.out.print("Please enter the second number: ");
            homeCalculator.setNumberB(reader.nextInt());
            System.out.println();

            if (typeOfCalculation == 1) {
                System.out.println(myCalculatorColor + " calculator manufactured by '" + myCalculatorModel +
                        "' has performed the following operation: ");
                System.out.println("The sum of " + homeCalculator.numberA + " and " + homeCalculator.numberB +
                        " is " + homeCalculator.sum());
            }
            else if (typeOfCalculation == 2) {
                System.out.println(myCalculatorColor + " calculator manufactured by '" + myCalculatorModel +
                        "' has performed the following operation: ");
                System.out.println("The difference of " + homeCalculator.numberA + " and " + homeCalculator.numberB +
                        " is " + homeCalculator.difference());
            }
            else if (typeOfCalculation == 3) {
                System.out.println(myCalculatorColor + " calculator manufactured by '" + myCalculatorModel +
                        "' has performed the following operation: ");
                System.out.println("The product of " + homeCalculator.numberA + " and " + homeCalculator.numberB +
                        " is " + homeCalculator.product());
            }
            else if (typeOfCalculation == 4) {
                System.out.println(myCalculatorColor + " calculator manufactured by '" + myCalculatorModel +
                        "' has performed the following operation: ");
                System.out.println("The quotient of " + homeCalculator.numberA + " and " + homeCalculator.numberB +
                        " is " + homeCalculator.quotient());
            }
        }
        else if (typeOfCalculation==5) {
            System.out.print("Please specify how many numbers do you want to enter: ");
            int[] numbersToBeEntered = new int[reader.nextInt()];
            int counter=0;
            for (int i=0; i<numbersToBeEntered.length; i++) {
                System.out.print("Please enter the " + (++counter) + ". number: " );
                numbersToBeEntered[i] = reader.nextInt();
                }
            System.out.println();
            System.out.println(myCalculatorColor + " calculator manufactured by '" + myCalculatorModel +
                    "' has performed the following operation: ");
            System.out.println("The sum of entered numbers is " + homeCalculator.sumOfArrayNumbers(numbersToBeEntered));
        }

        else if (typeOfCalculation==6) {
            System.out.print("Please specify how many numbers do you want to enter: ");
            int[] numbersToBeEntered = new int[reader.nextInt()];
            int counter=0;
            for (int i=0; i<numbersToBeEntered.length; i++) {
                System.out.print("Please enter the " + (++counter) + ". number: " );
                numbersToBeEntered[i] = reader.nextInt();
                }
            System.out.println();
            System.out.println(myCalculatorColor + " calculator manufactured by '" + myCalculatorModel +
                    "' has performed the following operation: ");
            System.out.println("The product of entered numbers is " + homeCalculator.productOfArrayNumbers(numbersToBeEntered));
        }

        else if (typeOfCalculation==7) {
            System.out.print("Do you know the diameter of the circle (Y/N)? ");
            char response = reader.next().charAt(0);
                if (response == 'Y'|| response == 'y') {
                    System.out.print("Please enter the diameter (in centimeters): ");
                    double circleDiameter = reader.nextInt();
                    double radiusLength = circleDiameter / 2;
                    double areaOfCircle = radiusLength*radiusLength*homeCalculator.mathConstantPi;
                    System.out.println();
                    System.out.println("Area of a circle (A=πr^2) is " + areaOfCircle + " square centimeters");
                }
                else if (response == 'N'|| response == 'n') {
                    System.out.print("Please enter the radius of the circle (in centimeters): ");
                    double radiusLength = reader.nextInt();
                    double areaOfCircle = radiusLength*radiusLength*homeCalculator.mathConstantPi;
                    System.out.println();
                    System.out.println("Area of a circle (A=πr^2) is " + areaOfCircle + " square centimeters");
                }
        }
        else if (typeOfCalculation==8) {
            System.out.println();
            System.out.println("We are sorry to see you leaving. Please come back again!");
        }
    }
}