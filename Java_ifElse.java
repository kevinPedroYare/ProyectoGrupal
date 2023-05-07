public class Java_ifElse{
    public static void main(String[] args) {
        //If...Else
        /*
        You already know that Java supports the usual logical conditions from mathematics:

        Less than: a < b
        Less than or equal to: a <= b
        Greater than: a > b
        Greater than or equal to: a >= b
        Equal to a == b
        Not Equal to: a != b

        You can use these conditions to perform different actions for different decisions.

        
        Use if to specify a block of code to be executed, if a specified condition is true
        Use else to specify a block of code to be executed, if the same condition is false
        Use else if to specify a new condition to test, if the first condition is false
        Use switch to specify many alternative blocks of code to be executed

        Syntax
        if (condition) {
        // block of code to be executed if the condition is true
        }

        */

        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }
        
        /*
        if (condition) {
            // block of code to be executed if the condition is true
        } else {
            // block of code to be executed if the condition is false
        }
        */

        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        // Outputs "Good evening."
        /*
        if (condition1) {
            // block of code to be executed if condition1 is true
        } else if (condition2) {
            // block of code to be executed if the condition1 is false and condition2 is true
        } else {
            // block of code to be executed if the condition1 is false and condition2 is false
        }
        */

        int time1 = 22;
        if (time1 < 10) {
          System.out.println("Good morning.");
        } else if (time < 18) {
          System.out.println("Good day.");
        } else {
          System.out.println("Good evening.");
        }
        // Outputs "Good evening."

        //Short Hand If...Else
        /*Syntax
        variable = (condition) ? expressionTrue :  expressionFalse;
        */
        //Escritura habitual
        int time2 = 20;
        if (time2 < 18) {
          System.out.println("Good day.");
        } else {
          System.out.println("Good evening.");
        }
        //Escritura simplificada
        int time3 = 20;
        String result = (time3 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}