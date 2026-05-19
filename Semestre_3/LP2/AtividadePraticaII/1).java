import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salario = horasTrabalhadas * 20.0;

        System.out.println("O salário do operário este mês é: R$ " + salario);

    }
}
