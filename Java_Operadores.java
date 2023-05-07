public class Java_Operadores{
    public static void main(String[] args) {
        /*
        Operadores
        + 	Addition 	Adds together two values 	x + y 	
        - 	Subtraction 	Subtracts one value from another 	x - y 	
        * 	Multiplication 	Multiplies two values 	x * y 	
        / 	Division 	Divides one value by another 	x / y 	
        % 	Modulus 	Returns the division remainder 	x % y 	
        ++ 	Increment 	Increases the value of a variable by 1 	++x 	
        -- 	Decrement 	Decreases the value of a variable by 1 	--x
        */

        int x = 100 + 50;

        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;     // 800 (400 + 400)

        //Java Assignment Operators
        //The addition assignment operator (+=) adds a value to a variable:
        
        int x1 = 10;
        x1 += 5;
        /*
        Operator 	Example 	Same As 
        = 	        x = 5 	    x = 5 	
        += 	        x += 3 	    x = x + 3 	
        -= 	        x -= 3 	    x = x - 3 	
        *= 	        x *= 3 	    x = x * 3 	
        /= 	        x /= 3 	    x = x / 3 	
        %= 	        x %= 3 	    x = x % 3 	
        &= 	        x &= 3 	    x = x & 3 	
        |= 	        x |= 3 	    x = x | 3 	
        ^= 	        x ^= 3 	    x = x ^ 3 	
        >>= 	    x >>= 3 	x = x >> 3 	
        <<= 	    x <<= 3 	x = x << 3
        */

        //Java Comparison Operators
        int x2 = 5;
        int y1 = 3;
        System.out.println(x2 > y1); // returns true, because 5 is higher than 3
        /*
        Operator 	Name 	                        Example 	
        == 	        Equal to 	                    x == y 	
        != 	        Not equal 	                    x != y 	
        > 	        Greater than 	                x > y 	
        < 	        Less than 	                    x < y 	
        >= 	        Greater than or equal to 	    x >= y 	
        <= 	        Less than or equal to 	        x <= y
        */        

        //Java Logical Operators
        //esto sirve para comparar dos valores booleanos

        /*
        Operator 	Name 	        Description 	                                            Example 	
        &&  	    Logical and 	Returns true if both statements are true 	                x < 5 &&  x < 10 	
        ||  	    Logical or 	    Returns true if one of the statements is true 	            x < 5 || x < 4 	
        ! 	        Logical not 	Reverse the result, returns false if the result is true 	!(x < 5 && x < 10)
        */
    }
}