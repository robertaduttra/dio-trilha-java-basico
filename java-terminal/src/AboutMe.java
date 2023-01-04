import java.util.Scanner;

public class AboutMe{

    public static void main(String[] args) {
        //criando o objeto scanner p entrada de dados
        Scanner scanner = new Scanner(System.in);
    
        System.out.println(" Digite seu nome ");
        String nome = scanner.next();

        System.out.println(" Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println(" Digite sua idade ");
        int idade = scanner.nextInt();

        System.out.println(" Digite sua altura ");
        double altura = scanner.nextDouble();
        
        //imprimindo dados obtidos

        System.out.println(" Ola meu nome é " + nome + " " + sobrenome);
        System.out.println(" Tenho " + idade + " anos");
        System.out.println(" Minha altura é " + altura);

    }
}