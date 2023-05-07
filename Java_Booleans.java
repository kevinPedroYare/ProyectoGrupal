public class Java_Booleans{
    public static void main(String[] args) {
        /*
        YES / NO
        ON / OFF
        TRUE / FALSE
        */
        //Boolean Values
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false
        //Boolean Expression
        int x = 10;
        int y = 9;
        System.out.println(x > y); // returns true, because 10 is higher than 9

        int x1 = 10;
        System.out.println(x1 == 10); // returns true, because the value of x is equal to 10
        System.out.println(10 == 15); // returns false, because 10 is not equal to 15

        //Real Life Example
        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);

        int myAge1 = 25;
        int votingAge1 = 18;
        
        if (myAge1 >= votingAge1) {
          System.out.println("Old enough to vote!");
        } else {
          System.out.println("Not old enough to vote.");
        }
    }
}