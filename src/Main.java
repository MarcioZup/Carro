import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Carro chevrolet = new Carro("vectra", 1400,"chevrolet", "azul", 25000);

        System.out.println("Nome: " + chevrolet.nome + " Peso: " + chevrolet.peso + " Fabricante: " + chevrolet.fabricante + " Cor: " + chevrolet.cor + " Valor do Carro: " + chevrolet.valorDoCarro);
        chevrolet.darDesconto(0.1);
        chevrolet.pintar("preto");

        System.out.println("Nome: " + chevrolet.nome + " Peso: " + chevrolet.peso + " Fabricante: " + chevrolet.fabricante + " Cor: " + chevrolet.cor + " Valor do Carro: " + chevrolet.valorDoCarro);





        teclado.close();
    }
}
