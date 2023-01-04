package loops;
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/
import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     
     System.out.println(" Fatorial: ");
     int fatorial = scan.nextInt();

     int multiplicacao = 1;

     System.out.println(fatorial + " ! =");

     //i começa do numero digitado.   
     for (int i = fatorial; i >= 1; i--) {
        multiplicacao = multiplicacao *i;
               
     }
     System.out.println(multiplicacao);

    }
    
}
