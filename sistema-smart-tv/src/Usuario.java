public class Usuario {
    public static void main(String[] args) throws Exception {
        //criando o objeto para a tv
             SmartTv smartTv = new SmartTv();
            //dimunuindo volume 3x e diminuindo 1
             smartTv.diminuirVolume();
             smartTv.diminuirVolume();
             smartTv.diminuirVolume();
             smartTv.aumentarVolume();
             System.out.println("Volume Atual " + smartTv.volume);
            //mudar de canal manualmente
            System.out.println("Canal Atual: "+ smartTv.canal);
            smartTv.mudarCanal(13);
            System.out.println("Canal Atual: "+ smartTv.canal);


             System.out.println("Tv ligada "+ smartTv.ligada);
             System.out.println("Canal Atual: "+ smartTv.canal);
             System.out.println("Volume Atual: " + smartTv.volume);
            //ligando a tv
            smartTv.ligar();
            System.out.println("Novo Status -> Tv ligada "+ smartTv.ligada);
            //desligando tv
            smartTv.desligar();
            System.out.println("Novo Status -> Tv ligada "+ smartTv.ligada);
        }
}
