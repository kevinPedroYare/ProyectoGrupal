public class Java_ParametrosMetodos {
    // Parameters and Arguments
    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }
    // Multiple Parameters
    public class Main {
        static void myMethod(String fname, int age) {
          System.out.println(fname + " is " + age);
        }
      
        public static void main(String[] args) {
          myMethod("Liam", 5);
          myMethod("Jenny", 8);
          myMethod("Anja", 31);
        }
      }
      
      // Liam is 5
      // Jenny is 8
      // Anja is 31

      // Return Values
    static int myMethod(int x) {
        return 5 + x;
    }
    // Outputs 8 (5 + 3)

    // A Method with If...Else
    public class Main {

        // Create a checkAge() method with an integer variable called age
        static void checkAge(int age) {
      
          // If age is less than 18, print "access denied"
          if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
      
          // If age is greater than, or equal to, 18, print "access granted"
          } else {
            System.out.println("Access granted - You are old enough!");
          }
      
        }
      
        public static void main(String[] args) {
          checkAge(20); // Call the checkAge method and pass along an age of 20
        }
      }
      // Outputs "Access granted - You are old enough!"

      public static void main(String[] args){
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
        System.out.println(myMethod(3));
    }
    // Liam Refsnes
    // Jenny Refsnes
    // Anja Refsnes
}