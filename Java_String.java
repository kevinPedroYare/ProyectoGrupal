public class Java_String{
    public static void main(String[] args) {
        //STRINGS
        //java String y length este ultimo sirve para ver el tamaño de la cadena
        String greeting = "Hello";
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        //mas metodos de string el de colocar todos mayuscula o minuscula
        String txt1 = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"
        //para encontrar un caracter de una cadena indexOf()
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7

        //CONCATENATION
        
        //ay 2 formas con el simbolo + o con el metodo concat()
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        //NUMBER AND STRINGS
        int x = 10;
        int y = 20;
        int z = x + y;  // z will be 30 (an integer/number)

        String x1 = "10";
        String y1 = "20";
        String z1 = x1 + y1;  // z will be 1020 (a String)

        String x2 = "10";
        int y2 = 20;
        String z2 = x + y;  // z will be 1020 (a String)

        //SPECIAL CHARACTERS

        //el \ es un caracter de escape
        /*
        Escape character 	Result 	    Description
        \' 	                ' 	        Single quote
        \" 	                " 	        Double quote
        \\ 	                \ 	        Backslash
        */
        String txt3 = "We are the so-called \"Vikings\" from the north.";
        //tambien se puede usar el caracter unicode
        String txt4 = "It\'s alright.";
        //insertar un simple backslash
        String txt5 = "The character \\ is called backslash.";

        /*
        Code 	Result 	
        \n 	    New Line 	
        \r 	    Carriage Return 	
        \t 	    Tab 	
        \b 	    Backspace 	
        \f 	    Form Feed
        */
    }
}