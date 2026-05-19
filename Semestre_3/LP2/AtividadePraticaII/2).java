import java.util.Scanner;

public class GastoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância total até a fazenda (em km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o preço atual do litro da gasolina: R$ ");
        double precoGasolina = scanner.nextDouble();

        double litrosNecessarios = distancia / 12.0;
        double custoTotal = litrosNecessarios * precoGasolina;

        System.out.println("Será preciso colocar: " + litrosNecessarios + " litros de gasolina.");
        System.out.println("O custo total da viagem será de: R$ " + custoTotal);

    }
}

