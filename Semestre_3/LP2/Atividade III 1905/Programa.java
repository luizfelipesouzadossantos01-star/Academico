import java.util.Scanner;

class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private static int contadorProdutos = 0;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
        contadorProdutos++;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public double getPreco() { return preco; }
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("[ERRO INTERNO] Tentativa de inserir preço negativo.");
        }
    }

    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            System.out.println("[ERRO INTERNO] Tentativa de inserir estoque negativo.");
        }
    }

    public double calcularValorEstoque() {
        return this.preco * this.quantidadeEstoque;
    }

    public static int getContadorProdutos() {
        return contadorProdutos;
    }
}

public class Programa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("SISTEMA DE CADASTRO DE PRODUTOS");
        
        int qtdCadastro = 0;
        do {
            System.out.print("Quantos produtos deseja cadastrar? (Mínimo de 3): ");
            qtdCadastro = teclado.nextInt();
            
            if (qtdCadastro < 3) {
                System.out.println("[ERRO] Você precisa cadastrar no mínimo 3 produtos. Tente novamente.\n");
            }
        } while (qtdCadastro < 3); 
        
        teclado.nextLine(); 
        
        Produto[] meusProdutos = new Produto[qtdCadastro];
        
        for (int i = 0; i < qtdCadastro; i++) {
            System.out.println("\n--- Cadastrando o " + (i + 1) + "º Produto ---");
            
            System.out.print("Digite o nome: ");
            String nome = teclado.nextLine();
            
            double preco = -1;
            do {
                System.out.print("Digite o preço: R$ ");
                preco = teclado.nextDouble();
                if (preco < 0) {
                    System.out.println("[ERRO] O preço não pode ser negativo! Digite um valor válido.");
                }
            } while (preco < 0);
            
            int qtd = -1;
            do {
                System.out.print("Digite a quantidade em estoque: ");
                qtd = teclado.nextInt();
                if (qtd < 0) {
                    System.out.println("[ERRO] O estoque não pode ser negativo! Digite um valor válido.");
                }
            } while (qtd < 0);
            
            teclado.nextLine();
            
            meusProdutos[i] = new Produto(nome, preco, qtd);
        }
        
        System.out.println("      RELATÓRIO DE PRODUTOS CRIADOS      ");
        
        double valorTotalGeral = 0;
        
        for (Produto p : meusProdutos) {
            System.out.println("Produto: " + p.getNome() + 
                               " | Preço: R$ " + p.getPreco() + 
                               " | Estoque: " + p.getQuantidadeEstoque() + " un" +
                               " | Total do Item: R$ " + p.calcularValorEstoque());
            
            valorTotalGeral += p.calcularValorEstoque();
        }
        
        System.out.println("Valor financeiro total em estoque: R$ " + valorTotalGeral);
        System.out.println("Total de tipos de produtos criados: " + Produto.getContadorProdutos());
        
        teclado.close();
    }
}