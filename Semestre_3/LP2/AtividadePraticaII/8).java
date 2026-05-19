import java.util.Scanner;

public class AreaCircunferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio da circunferência: ");
        double raio = scanner.nextDouble();

        double pi = 3.14159;
        double area = pi * raio * raio;

        System.out.println("A área da circunferência é: " + area);

    }
}
