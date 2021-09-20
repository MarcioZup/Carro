import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Carro chevrolet = new Carro("vectra", 1400,"chevrolet", "azul", 25000);
        chevrolet.mostraCarro();

        System.out.println("Digite o valor do desconto: ");

        double desconto = teclado.nextDouble();

        chevrolet.darDesconto(desconto);

        System.out.println("Digite a nova cor: ");
        String novaCor = teclado.nextLine();
        chevrolet.pintar(novaCor);

        chevrolet.mostraCarro();




        teclado.close();
    }
}
