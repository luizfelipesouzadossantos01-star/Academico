import java.util.Scanner;

public class OperacaoSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double soma = numero1 + numero2;
        double resultado;

        if (soma >= 10.0) {
            resultado = soma + 5.0;
        } else {
            resultado = soma - 7.0;
        }

        System.out.println("O resultado final é: " + resultado);

    }
}
