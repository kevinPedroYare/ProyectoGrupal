public class Java_Methods{

    /*
        public class Main {
            static void myMethod() {
                // code to be executed
            }
        }
        
        myMethod() es el nombre del metodo
        static significa que el método pertenece a la clase Main y no a un objeto de la clase Main. 
        Aprenderá más sobre los objetos y cómo acceder a los métodos a través de objetos más adelante en este tutorial. 
        void significa que este método no tiene un valor devuelto. Aprenderá más sobre los valores devueltos más adelante en este capítulo

    */
    static void myMethod() {
        System.out.println("I just got executed!");
    }
    public static void main(String[] args){
        

        // Llamando al metodo
        //myMethod();
        
        myMethod();
        myMethod();
        myMethod();

        // I just got executed!
        // I just got executed!
        // I just got executed!

    }
}