public class Java_ForLoop{
    public static void main(String[] args){
        //JAVA FOR LOOP
        /*esto es un for loop
        Syntax
        for (statement 1; statement 2; statement 3) {
            // code block to be executed
        }
        */
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // Outputs "0 1 2 3 4"


        //THE FOR-EACH LOOP
        /*esto es un for-each loop
        Syntax
        for (type variableName : arrayName) {
            // code block to be executed
        }
        */
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
        // Outputs "Volvo BMW Ford Mazda"
    }
}