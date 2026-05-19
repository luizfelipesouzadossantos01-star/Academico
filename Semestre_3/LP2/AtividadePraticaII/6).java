import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova: ");
        double prova1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double prova2 = scanner.nextDouble();

        System.out.print("Digite a nota do trabalho: ");
        double trabalho = scanner.nextDouble();

        double mediaFinal = (prova1 + prova2 + trabalho) / 3.0;

        System.out.println("Sua média final foi: " + mediaFinal);

        if (mediaFinal >= 7.0) {
            System.out.println("Resultado: Aprovado");
        } else {
            System.out.println("Resultado: Reprovado");
        }

    }
}

