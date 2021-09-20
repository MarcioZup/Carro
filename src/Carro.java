public class Carro {

    //declarando atributos
    String nome;
    double peso;
    String fabricante;
    String cor;
    double valorDoCarro;

    //método construtor
    public Carro(String nome, double peso, String fabricante, String cor, double valorDoCarro) {
        this.nome = nome;
        this.peso = peso;
        this.fabricante = fabricante;
        this.cor = cor;
        this.valorDoCarro = valorDoCarro;
    }

    public void mostraCarro(){
        System.out.println("Nome: " + this.nome + " Peso: " + this.peso + " Fabricante: " + this.fabricante + " Cor: " + this.cor + " Valor do Carro: " + this.valorDoCarro);

    }

    public void darDesconto(double percentualDeDesconto){
        this.valorDoCarro = valorDoCarro - (valorDoCarro * percentualDeDesconto);
    }

    public void pintar(String novaCor){
        this.cor = novaCor;
    }
}
