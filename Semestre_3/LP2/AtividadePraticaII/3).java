import java.util.Scanner;

public class VerificadorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você já pode tirar a sua carteira de motorista!");
        } else {
            System.out.println("Você ainda não pode tirar a carteira de motorista.");
        }

    }
}

