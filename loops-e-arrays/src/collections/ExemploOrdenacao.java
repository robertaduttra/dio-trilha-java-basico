package collections;
/*dadas as seguintes informações sobre meus gatos, crie uma list e ordene esta lista exibindo:
(nome - idade - cor); 
gato 1 = nome: Jon, idade:18, cor: preto
gato2 = simba, 6 tigrado;
gato3 = jon, 12, amarelo;
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacao {
    
    public static void main(String[] args) {
    
    List<Gato> meusGatos = new ArrayList<>(){{
        add(new Gato("jon", 18, "preto"));
        add(new Gato("simba", 6, "tigrado"));
        add(new Gato("jon", 12, "amarelo"));
    }};
    System.out.println(meusGatos);

    //Mostrar por ordem de inserção - ordem normal

    System.out.println("--\tOrdem de Inserção\t---");
    System.out.println(meusGatos);

    //Pela ordem aleatoria
    System.out.println("--\tOrdem aleatória\t---");
    Collections.shuffle(meusGatos);
    System.out.println(meusGatos);

    //Ordem natural pelo nome
    System.out.println("--\tOrdem Natural (nome)\t---");
    Collections.sort(meusGatos);
    System.out.println(meusGatos);

    //Ordenar pela comparation
    System.out.println("--\tOrdem Idade\t---");
    //Collections.sort(meusGatos, new ComparatorIdade());
    meusGatos.sort(new ComparatorIdade()); 
    System.out.println(meusGatos);

    //comparando por cor
    System.out.println("--\tOrdem cor\t---");
    //Collections.sort(meusGatos, new ComparatorNomeCorIdade());
    System.out.println(meusGatos);

    //comparando ordem nome, cor e idade
    System.out.println("--\tOrdem Nome/Cor/Idade\t---");
    meusGatos.sort(new ComparatorNomeCorIdade());
    System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private int idade;
    private String cor;

    // criando o construtor
    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }
     //chama o override p tostring mostrar o valor e nao o espaço na memoria.
    @Override
    public String toString() {
        return "[nome =" + nome + ", idade=" + idade + ", cor=" + cor + "]";

    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }     

}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
       return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}
//metodo para comparar as cores.
class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }

}
//comparando nome, cor e idade quem vir primeiro fica.
class ComparatorNomeCorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome!= 0 ) return nome;


        int cor=g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor!=0) return cor;

        return Integer.compare(g1.getIdade(),g2.getIdade());
    }
}