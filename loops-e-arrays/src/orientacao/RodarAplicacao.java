package orientacao;

public class RodarAplicacao{
    public static void main(String[] args) {
        //criando objeto carro construtor padrao sem parametro
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW serie 3");
        carro1.setCapacidadeTanque(59);

        System.out.println("Carro 1");

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39 ));

        //criando ja com os parametros e sobrecarga.
        Carro carro2 = new Carro("cinza", "Mercedes-benz", 66);

        System.out.println("Carro 2");
        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));
    }

}