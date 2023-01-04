package loops;
/*
Faça um programa que leia 5 números
e informe o maior número e a média desses números.
*/

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero; 
        int maior = 0; 
        int soma = 0;
        int count = 0;

        //criando laço para repetir o pedido 5x
        do {
            System.out.println(" Digite a nota");
            numero = scan.nextInt();

            soma = soma + numero;
            //System.out.println(" Maior : " + maior);

            if (numero>maior) maior = numero;  
            
            //count = count + 1;
            count++;
            //mostrando o maior numero System.out.println(" Maior : " + maior);
        } while (count < 5); 

        System.out.println("Este foi Maior numero digitado : " + maior);
        System.out.println("Esta foi a Media dos valores informados: " + soma/5);
    }
    
}
