public class Java_SobrecargaMetodo{
    /*
        Cuando se sobre carga el metodo, se crea mas de un metodo con el mismo nombre:

        Example
        int myMethod(int x)
        float myMethod(float x)
        double myMethod(double x, double y)
    */
    static int plusMethodInt(int x, int y) {
        return x + y;
      }
      
      static double plusMethodDouble(double x, double y) {
        return x + y;
      }
      
      public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
      }
}