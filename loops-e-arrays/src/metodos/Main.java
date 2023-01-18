package metodos;
//onde ira executar

public class Main {
    public static void main(String[] args) {
        // calculadora
        // chamando os metodos
        System.out.println(" Exercicio calculadora ");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);
        
        // Mensagem

        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);
       // emprestimo
       
       System.out.println("Exercício empréstimo");
       Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
       Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
       Emprestimo.calcular(1000, 5);
        
       //area
        System.out.println("Exercicio de area");
        Sobrecarga.area(3);
        Sobrecarga.area(6, 7);
        Sobrecarga.area(10, 12, 15);
        
        //quadrilateros retornos
        System.out.println("Mostrando os retornos");

        //guardando valores em variaveis
        double areaQuadrado = Quadrilateros.area(3);
        System.out.println(" area do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilateros.area(5, 5);
        System.out.println(" area do retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilateros.area(7, 8, 9);
        System.out.println(" area do trapezio: " + areaTrapezio);
    }

}
