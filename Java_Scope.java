public class scope{
    public static void main(String[] args) {

        // Method Scope
        // Las variables declaradas directamente dentro de un método están disponibles en cualquier parte del método siguiendo la línea de código en la que se declararon.
        // El código aquí NO PUEDE usar x
    
        int x = 100;
    
        // El codigo de aqui puede usar x
        System.out.println(x);

        //Block Scope
    }

    public static void main2(String[] args) {

        // El codigo de aqui no puede usar x
    
        { // This is a block
    
          // El código aquí NO PUEDE usar x
    
          int x = 100;
    
            // El codigo de aqui puede usar x
            System.out.println(x);
    
        } // The block ends here
    
      // El codigo de aqui no puede usar x
    
    }

}