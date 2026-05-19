import java.util.Scanner;

public class SomaMaiorQueDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double soma = numero1 + numero2;

        if (soma > 10.0) {
            System.out.println("A soma é maior que 10: " + soma);
        }
        
    }
}
