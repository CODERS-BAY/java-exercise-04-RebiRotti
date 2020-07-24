import java.util.Scanner;

public class Calculator {
    /*
        your code comes here...
        // get first Number
        Scanner theInput = new Scanner(System.in);
        System.out.println("Type in the first number: \n");
        int x = theInput.nextInt();
        // get second Number
        Scanner theInput = new Scanner(System.in);
        System.out.println("Type in the second number: \n");
        int y = theInput.nextInt();
        boolean terminate = false;
     */


    // 1 addition
    private static int additionInt(int x, int y) {
        System.out.println(x + " " + y);
        return x + y;
    }
    private static double additionDouble(double x, double y) {
        System.out.println(x + " " + y);
        return x + y;
    }

    // 2 subtraction
    private static int subtractionInt(int x, int y) {
        System.out.println(x + " " + y);
        return x - y;
    }
    private static double subtractionDouble(double x, double y) {
        System.out.println(x + " " + y);
        return x - y;
    }


    // 3 divide
    private static int divideInt(int x, int y) {
        System.out.println(x + " " + y);
        return x / y;
    }
    private static double divideDouble(double x, double y) {
        System.out.println(x + " " + y);
        return x / y;
    }

    // 4 modulo
    private static int moduloInt(int x, int y) {
        System.out.println(x + " " + y);
        return x % y;
    }
    private static double moduloDouble(double x, double y) {
        System.out.println(x + " " + y);
        return x % y;
    }

    // 5 pythagoras
    /*private static int pythagorasInt(int x, int y) {
        System.out.println(x + " " + y);
        return sqrt(x^2 + y^2 ); //
    }
    private static double pythagorasDouble(double x, double y) {
        System.out.println(x + " " + y);
        return sqrt(x^2 + y^2 );
    }*/


    // You can make the following calculations:

    private static int operationChoice(int helperInt) {
        Scanner theInput = new Scanner(System.in);
        System.out.println("""
                    You can make the following calculations:
                    1.   addition
                    2.   subtraction
                    3.   divide
                    4.   modulo
                    5.   pythagoras you can calculate the hypotenuse c
                    
                    To select a calculation please press the corresponding number.
                    """);
        return theInput.nextInt() + helperInt;
    }


    public static void main(String[] args) {
        boolean terminate = false;
        Scanner theInput = new Scanner(System.in);
        int helperInt = 0;
        int firstNumberInt = 0;
        int secondNumberInt = 0;
        double firstNumberDouble = 0;
        double secondNumberDouble = 0;

        do {
            System.out.println("""
                    Would you like to make Floating point calculations?
                    type y for yes and anything else for integer calculations
                    """);
            char choice = theInput.next().charAt(0);
            System.out.println(choice);

            if(choice == 'y') {
                System.out.println("Type in the first number: ");
                firstNumberDouble = theInput.nextDouble();
                System.out.println("Type in the second number: ");
                secondNumberDouble = theInput.nextDouble();
            } else {
                System.out.println("Type in the first number: ");
                firstNumberInt = theInput.nextInt();
                System.out.println("Type in the second number: ");
                secondNumberInt = theInput.nextInt();
                helperInt = 5;
            }

            int operation = operationChoice(helperInt);


           switch(operation) {
               case 1:
                   System.out.println("Calculation " + firstNumberDouble + " + " + secondNumberDouble);
                   System.out.println("The solution is = " + additionDouble(firstNumberDouble, secondNumberDouble));
                   break;
               case 2:
                   System.out.println("Calculation " + firstNumberDouble + " - " + secondNumberDouble);
                   System.out.println("The solution is = " + subtractionDouble(firstNumberDouble, secondNumberDouble));
                   break;
               case 3:
                   System.out.println("Calculation " + firstNumberDouble + " / " + secondNumberDouble);
                   System.out.println("The solution is = " + divideDouble(firstNumberDouble, secondNumberDouble));
                   break;
               case 4:
                   System.out.println("Calculation " + firstNumberDouble + " % " + secondNumberDouble);
                   System.out.println("The solution is = " + moduloDouble(firstNumberDouble, secondNumberDouble));
                   break;
               case 5:
                   //
                   break;
               case 6:
                   System.out.println("Calculation " + firstNumberInt + " + " + secondNumberInt);
                   System.out.println("The solution is = " + additionInt(firstNumberInt, secondNumberInt));
                   break;
               case 7:
                   System.out.println("Calculation " + firstNumberInt + " - " + secondNumberInt);
                   System.out.println("The solution is = " + subtractionInt(firstNumberInt, secondNumberInt));
                   break;
               case 8:
                   System.out.println("Calculation " + firstNumberInt + " / " + secondNumberInt);
                   System.out.println("The solution is = " + divideInt(firstNumberInt, secondNumberInt));
                   break;
               case 9:
                   System.out.println("Calculation " + firstNumberInt + " % " + secondNumberInt);
                   System.out.println("The solution is = " + moduloInt(firstNumberInt, secondNumberInt));
                   break;
               case 10:
                   //
                   break;
               default:
                   System.out.println("Berechnungsmethode nicht bekannt!");
           }

            System.out.println("Would you like to calculate again? \n Press y for yes or any other key for abort.");
            char again = theInput.next().charAt(0);
            //nSystem.out.println(again);
            if(again != 'y') {
                terminate = true;
            }
        } while (!terminate);
    }
}
