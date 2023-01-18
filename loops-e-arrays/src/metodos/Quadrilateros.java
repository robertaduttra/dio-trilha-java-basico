package metodos;
//fazendo os retornos dos metodos e chamando la no main
public class Quadrilateros {

    public static double area(double lado){
        return lado*lado;
    }
    public static double area(double lado1, double lado2){
        return lado1*lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura){
        return ((baseMaior+baseMenor)*altura)/2;
    }
       
    }


