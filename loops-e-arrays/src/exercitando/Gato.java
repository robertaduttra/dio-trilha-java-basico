package exercitando;

import java.util.Comparator;

public class Gato implements Comparable<Gato> {
    private String nome;
    private int idade;
    private String cor;

    // criando o construtor
    public Gato(String nome, int idade, String cor){
        this.nome=nome;
        this.idade=idade;
        this.cor=cor;        
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
        return "[nome = " + nome + ", idade = " + idade + ",cor= " + cor +"]";
    }

    //para possibilitar a comparação.
    @Override
    public int compareTo(Gato gato) {
       return this.getNome().compareTo(gato.getNome());
    } 

}
//metodo para comparar pela idade
class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(),g2.getIdade());
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
