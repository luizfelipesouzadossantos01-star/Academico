import java.util.Scanner;

class AtividadePraticaI {
    public static void main(String[] args) {
        float soma = 0f;
        float media = 0;
        try (Scanner leitura = new Scanner(System.in)) {
            System.out.println("Digite o nome do estudante: ");
            String nome = leitura.nextLine();
            System.out.print("Quantas notas desejar calcular: ");
            int quantidade = leitura.nextInt();
            for (int i=1;i<=quantidade;i++) {
                System.out.print("Digite a nota "+(i)+" do estudante: ");
                float nota= leitura.nextFloat();
                soma+=nota;
            }
            media = soma/quantidade;
            System.out.println("--- Resultado Final ---");
            System.out.println("Aluno: "+ nome);
        }
        System.out.println("Media: "+ media);
        if(media>=7){
            System.out.println("Situação: Aprovado");
        }
        else if(media>=5){
            System.out.println("Situação: Recuperação");
        }
        else{
            System.out.println("Situação: Reprovado");
        }
}
}
