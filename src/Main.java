import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Carro chevrolet = new Carro("vectra", 1400,"chevrolet", "azul", 25000);
        chevrolet.mostraCarro();

        chevrolet.darDesconto(0.1);
        chevrolet.pintar("preto");

        chevrolet.mostraCarro();




        teclado.close();
    }
}
