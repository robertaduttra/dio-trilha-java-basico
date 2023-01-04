package loops;
/*faça um programa que leia conjuntos de dois valores, 
* o primeiro representando o nome do aluno e o segundo representando a sua idade
*(pare o programa inserindo o valor 0 no campo nome) 
*/
import java.util.Scanner;

public class Ex1_NomeEIdade{
 public static void main(String[] args) {
    //criando o teclado p inserir os dados
    Scanner scan = new Scanner(System.in);
    
    String nome;
    int idade;

    while (true) {
    System.out.println(" Digite um Nome: ");
    nome = scan.next();
    //colocando nome 0, o programa para
    if (nome.equals("0")) break;

    System.out.println(" Digite a Idade: ");
    idade = scan.nextInt();    
   
    }   
   System.out.println(" Digite um nome válido");
   
 }

}