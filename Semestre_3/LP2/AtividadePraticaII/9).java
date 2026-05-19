import java.util.Scanner;

public class SalarioProfessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da hora-aula: R$ ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o percentual de desconto do INSS (ex: 11): ");
        double percentualDesconto = scanner.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double valorDesconto = salarioBruto * (percentualDesconto / 100.0);
        double salarioLiquido = salarioBruto - valorDesconto;

        System.out.println("O valor do salário líquido é: R$ " + salarioLiquido);

    }
}
