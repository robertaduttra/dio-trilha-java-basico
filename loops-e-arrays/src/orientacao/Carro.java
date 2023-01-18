package orientacao;

public class Carro {
  String cor;
  String modelo;
  int capacidadeTanque;
  
  // construtor aqui sempre abaixo dos atributos
  //depois get e set e apos isso metodos.

  Carro(){

  }

  Carro(String cor, String modelo, int capacidadeTanque){
    this.cor = cor;
    this.modelo=modelo;
    //nesse atributo do objeto do carro recebe esse parametro do atributo.
    this.capacidadeTanque=capacidadeTanque;
  } 


  // set somente guarda valor, por isso é void
  void setCor(String cor) {
    this.cor = cor;
  }

  // get retorna sempre algo
  String getCor() {
    return cor;
  }

  void setModelo(String modelo) {
    this.modelo = modelo;
  }

  String getModelo() {
    return modelo;
  }  
  
  void setCapacidadeTanque(int capacidadeTanque){
    this.capacidadeTanque=capacidadeTanque;
  }

  int getCapacidadeTanque() {
      return capacidadeTanque;
  }
  //metodo para encher o tanque

  double totalValorTanque(double valorCombustivel){
    return capacidadeTanque * valorCombustivel;

  }
}