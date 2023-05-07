public class Java_BreakContinue{
    public static void main(String[] args){
        //BREAK
        /*esto es un "break"
        Syntax
        break;
        */
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        // Outputs "0 1 2 3"

        //CONTINUE
        /*esto es un "continue"
        Syntax
        continue;
        */
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
        // Outputs "0 1 2 3 5 6 7 8 9"
        //BREAK AND CONTINUE IN WHILE LOOP
        /*esto es un break y continue en un while loop
        Syntax
        break;
        continue;
        */
        int i = 0;
        while (i < 10) {
          System.out.println(i);
          i++;
          if (i == 4) {
            break;
          }
        }
        // Outputs "0 1 2 3"
        int i2 = 0;
        while (i2 < 10) {
          if (i2 == 4) {
            i2++;
            continue;
          }
          System.out.println(i2);
          i2++;
        }
        // Outputs "0 1 2 3 5 6 7 8 9"
    }
}