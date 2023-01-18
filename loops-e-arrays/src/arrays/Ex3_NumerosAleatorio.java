package arrays;
/*
Faça um Programa que leia 20 números inteiros (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;

public class Ex3_NumerosAleatorio {
    public static void main(String[] args) {
        // criando a classe para numeros aleatorios
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero; 
        }
        System.out.println("Numeros Aleatorios ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores dos Numeros");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

        System.out.println("\nAntecessor dos Numeros");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }
    }
}
