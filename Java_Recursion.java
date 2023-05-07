import java.util.*;
public class Java_Recursion{
    public static void main(String[] args) {
        ArrayList<Double> array = new ArrayList<Double>();
        array.add(5.0);
        array = metodo(array);
        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
    }

    static ArrayList<Double> metodo(ArrayList<Double> numero) {
        numero.add(numero.get(numero.size()-1) + 1);
        if(numero.size() < 10){
            return metodo(numero);
        }
        return numero;
    }
}