package exercitando;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Executando2 {
    public static void main(String[] args) {
        //criando a lista com variavel local meus gatos
        List <Gato> meusGatos = new ArrayList<>(){{
           //adicionando os gatos
           add(new Gato("Bob ", 12 , "branca"));
           add(new Gato("Theo ", 5 , "amarelo"));
           add(new Gato("Rosi", 8 , "preta"));
        }};
        System.out.println(meusGatos);

          //Mostrar por ordem de inserção - ordem normal
          System.out.println("---\tOrdem natural\t---");
          System.out.println(meusGatos);
         
          //mostrar pela ordem aleatoria
          System.out.println("--\tOrdem aleatoria \t---");
          Collections.shuffle(meusGatos);
          System.out.println(meusGatos);

          //Ordem natural pelo nome
          System.out.println("--\tOrdem natural pelo nome\t---");
          Collections.sort(meusGatos);
          System.err.println(meusGatos);

          //Ordenar pela idade
          System.err.println("--\tOrdem pela idade\t---");
          Collections.sort(meusGatos, new ComparatorIdade());
          System.out.println(meusGatos);

          //Ordenar pela cor
          System.err.println("--\tOrdem pela cor\t---");
          Collections.sort(meusGatos, new ComparatorCor());
          System.err.println(meusGatos);

         //Comparando ordem nome, cor e idade
         System.err.println("--\tOrdem pelo nome, cor e idade\t---");
         Collections.sort(meusGatos, new ComparatorNomeCorIdade());
         System.out.println(meusGatos);
        

    }
    
}
