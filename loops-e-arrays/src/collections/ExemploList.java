package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
//criando uma lista.
public class ExemploList {

    // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
    
//      List notas = new ArrayList(); //antes do java 5
//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

public static void main(String[] args) {
    
    System.out.println(" Crie uma lista e adicione as sete notas");
    List<Double>notas = new ArrayList<>();
    notas.add(7d); //ou 7.0);
    notas.add(8.5);
    notas.add(9.3);
    notas.add(5.0);
    notas.add(7.0);
    notas.add(0.0);
    notas.add(3.6);
    System.out.println(notas.toString()); // ou imprime usando o (notas)
    //metodo para exibir a posição do numero na lista
    System.out.println("Exiba a posição da nota 5.0 " + notas.indexOf(5d));
    //adiconando
    System.out.println("Adicione na Lista a nota 8.0 na posição 4");
    notas.add(4, 8d);
    System.out.println(notas);
    //substituir  passa o indice
    System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
    notas.set(notas.indexOf(5d),6.0);
    System.out.println(notas);

    //conferindo se a nota 5 esta na lista
    System.err.println("Confira se a nota 5.0 está na lista " + notas.contains(5d));
    //exibindo na ordem que foram informadas
    System.out.println("Exiba todas as notas na ordem em que foram informados: ");
    for(double nota:notas) System.out.println(nota);

    System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
    System.out.println(notas.toString());
    
    //exibindo a menor nota
    System.out.println(" Exiba a menor nota: " + Collections.min(notas));
    
    //exiba a maior nota

    System.out.println("Exiba a maior nota:  " + Collections.max(notas));

    //soma dos valores

    System.out.println(" Exiba a soma dos valores :");
    Iterator<Double> iterator = notas.iterator();
    Double soma = 0d;
    //chamando o metodo iterator e fazendo o laço
    //tem proximo:? has next.
    while (iterator.hasNext()) {
       Double next = iterator.next();
        soma+=next;
    }
    System.out.println("Exiba a soma dos valores: " + soma);
    //nota ponto size a quantidade divida pela soma
    System.out.println(" Exiba a media das notas "+ (soma/notas.size()));

    System.out.println("Remova a nota 0:");
    notas.remove(0d);
    System.out.println(notas);
    

    //removendo pelo index
        System.out.println("Remova a nota da posição 0");
    notas.remove(0);
    System.out.println(notas);

    System.out.println("Remova as notas menores que 7 e exiba a lista");
    Iterator<Double> iterator1 = notas.iterator();
    while (iterator1.hasNext()) {
        //colocando em uma variavel
        Double next = iterator1.next();
        if(next<7) iterator1.remove();
    }
       System.out.println(notas);
       //apagando toda a lista
       System.out.println(" Apague toda a lista");
        notas.clear();
        System.out.println(notas);
        //outro metodo para confirmar se esta vazia.
        System.out.println("Confira se esta vazia " + notas.isEmpty());
        
}

    
    
}
