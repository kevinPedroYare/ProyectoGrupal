public class Java_Switch{
    public static void main(String[] args) {
        //Java Switch Statements
        /*esto es un switch statement
        Syntax 

        switch(expression) {
        case x:
            // code block
            break;
        case y:
            // code block
            break;
        default:
            // code block
        }

        break sirve para salir del switch statement
        */

        int day = 4;
        switch (day) {
          case 1:
            System.out.println("Monday");
            break;
          case 2:
            System.out.println("Tuesday");
            break;
          case 3:
            System.out.println("Wednesday");
            break;
          case 4:
            System.out.println("Thursday");
            break;
          case 5:
            System.out.println("Friday");
            break;
          case 6:
            System.out.println("Saturday");
            break;
          case 7:
            System.out.println("Sunday");
            break;
        }
        // Outputs "Thursday" (day 4)
        
        //The default Keyword esto es para cuando no hay un case que coincida con el valor de la expresion
        int day1 = 4;
        switch (day1) {
          case 6:
            System.out.println("Today is Saturday");
            break;
          case 7:
            System.out.println("Today is Sunday");
            break;
          default:
            System.out.println("Looking forward to the Weekend");
        }
        // Outputs "Looking forward to the Weekend"
    }
}