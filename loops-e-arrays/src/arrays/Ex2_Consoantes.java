package arrays;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // criando um array objeto com 6 posicoes.
        String[] consoantes = new String[6];
        // inicializando as variaveis
        int quantidadeConsoantes = 0;
        int count = 0;

        do {
            System.out.println("Digite uma letra  ");
            String letra = scan.next();// guardando em letra

            // quando tiver nao tiver essas letras é consoante
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                //atribua a letra ao elemento do vetor na posição indicada pelo contador, caso seja consoante.        
                consoantes[count] = letra;
                quantidadeConsoantes++; //acrescente o valor 1 ao contador a cada loop
            }

            count++;
        } while (count < consoantes.length);
        System.out.print("Consoantes: ");

        // tipo elemento - array esse laço pega o elemento dentro
        for (String consoante : consoantes) {
            if (consoante != null) 
                System.out.println(consoante + " ");

        }
        System.out.println("Quantidade de consoantes " + quantidadeConsoantes);
    }
}
