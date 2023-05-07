public class Java_Arrays{
    public static void main(String[] args){
        //ARRAYS
        String[] cars;
        String[] cars0 = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        // Outputs Volvo
        int[] myNum = {10, 20, 30, 40};

        //LOOP THROUGH AN ARRAY
        String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars1.length; i++) {
          System.out.println(cars1[i]);
        }
        //loop through an array with for-each
        /*
        Syntax
        for (type variable : arrayname) {
            ...
        }
        */
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars2) {
          System.out.println(i);
        }

        //MULTIDIMENSIONAL ARRAYS
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // Outputs 7

        //Change Element Values
        int[][] myNumbers1 = { {1, 2, 3, 4}, {5, 6, 7} };
        myNumbers1[1][2] = 9;
        System.out.println(myNumbers1[1][2]); // Outputs 9 instead of 7

        //Loop Through a Multi-Dimensional Array
        public class Main {
            public static void main(String[] args) {
              int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
              for (int i = 0; i < myNumbers.length; ++i) {
                for(int j = 0; j < myNumbers[i].length; ++j) {
                  System.out.println(myNumbers[i][j]);
                }
              }
            }
          }          
    }
}