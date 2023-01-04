package loops;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int quantNumeros;
    int numero;
    //variaveis para guardar quantidade dos numeros pares e impares
    int quantPares=0; 
    int quantImpares=0;

    System.out.println("Quantidade de numeros ");
    quantNumeros = scan.nextInt();

    int count = 0; // controla o loop

    do {//primeiro, independente do que tem no while, faça:
        System.out.println("Número : " );//peça um numero
        numero=scan.nextInt();
        //se o resto da divisão por 2 for 0
        if(numero%2 ==0 ) quantPares++; //acrescente o valor 1 a variável quantPar. 
         //caso contrário, o número digitado é ímpar
        else quantImpares++; //adicione o valor 1 a variável quantImpar.

        count++;//some o valor 1 ao contador até que invalide a condição do loop. (count < quantidadeDeNumeros)
                
    } while (count < quantNumeros);
    // Faça o loop caso o valor do contador seja menor que a quantidade de números
    //imprimindo a quantidade de números pares digtados e números ímpares digitados
    System.out.println(" Quantidade par :" + quantPares);
    System.out.println(" Quantidade impares " + quantImpares);


    }
}
