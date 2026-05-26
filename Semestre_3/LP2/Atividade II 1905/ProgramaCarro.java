class Carro {
    String modelo;
    int velocidade;
    int aceleracao;
    int marcha;
    boolean ligado;

    public Carro(String modelo, int aceleracao) {
        this.modelo = modelo;
        this.aceleracao = aceleracao;
        this.velocidade = 0; 
        this.marcha = 0;     
        this.ligado = false; 
    }

    void ligar() {
        this.ligado = true;
        System.out.println(modelo + " ligou.");
    }

    void desligar() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
        System.out.println(modelo + " desligou.");
    }

    void acelerar() {
        if (ligado) {
            this.velocidade += this.aceleracao;
            System.out.println(modelo + " acelerou! Velocidade: " + velocidade + " km/h");
        } else {
            System.out.println("Não dá para acelerar com o carro desligado.");
        }
    }

    void desacelerar() {
        if (ligado && velocidade > 0) {
            this.velocidade -= this.aceleracao;
            System.out.println(modelo + " freou. Velocidade: " + velocidade + " km/h");
        }
    }

    void virarDireita() {
        System.out.println(modelo + " virou à direita.");
    }

    void virarEsquerda() {
        System.out.println(modelo + " virou à esquerda.");
    }

    void marchaParaCima() {
        this.marcha++;
        System.out.println("Marcha aumentada para: " + marcha);
    }

    void marchaParaBaixo() {
        if (marcha > 0) {
            this.marcha--;
            System.out.println("Marcha reduzida para: " + marcha);
        }
    }
}
public class ProgramaCarro {
    public static void main(String[] args) {
        // Criando um objeto carro chamado "meuCarro"
        Carro meuCarro = new Carro("Fusca", 15);

        System.out.println(" TESTANDO AS AÇÕES DO CARRO ");
        
        meuCarro.ligar();
        meuCarro.marchaParaCima();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.virarDireita();
        meuCarro.desacelerar();
        meuCarro.marchaParaBaixo();
        meuCarro.desligar();
    }
}
