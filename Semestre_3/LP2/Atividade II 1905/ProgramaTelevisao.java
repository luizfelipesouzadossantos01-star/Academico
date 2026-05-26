class Televisao {
    int polegadas;
    int volume;
    String marca;
    int voltagem;
    int canal;
    boolean ligada;

    public Televisao(String marca, int polegadas, int voltagem) {
        this.marca = marca;
        this.polegadas = polegadas;
        this.voltagem = voltagem; 
        this.volume = 5;          
        this.canal = 1;           
        this.ligada = false;      
    }

    void ligar() {
        this.ligada = true;
        int consumo = this.voltagem * this.polegadas;
        
        System.out.println("A TV " + marca + " ligou.");
        System.out.println("Consumo estimado: " + consumo + " Watts.");
    }

    void desligar() {
        this.ligada = false;
        System.out.println("A TV " + marca + " desligou.");
    }

    void aumentarVolume() {
        if (ligada) {
            if (this.volume < 10) { 
                this.volume++;
                System.out.println("Volume: " + volume);
            } else {
                System.out.println("Volume já está no máximo (10).");
            }
        }
    }

    void diminuirVolume() {
        if (ligada) {
            if (this.volume > 1) {
                this.volume--;
                System.out.println("Volume: " + volume);
            } else {
                System.out.println("Volume já está no mínimo (1).");
            }
        }
    }

    void subirCanal() {
        if (ligada) {
            this.canal++;
            System.out.println("Canal atual: " + canal);
        }
    }

    void descerCanal() {
        if (ligada && canal > 1) {
            this.canal--;
            System.out.println("Canal atual: " + canal);
        }
    }
}

public class ProgramaTelevisao {
    public static void main(String[] args) {
        Televisao minhaTv = new Televisao("Sony", 55, 220);

        System.out.println("   TESTANDO AS AÇÕES DA TELEVISÃO ");
        
        minhaTv.ligar();          
        minhaTv.aumentarVolume(); 
        minhaTv.subirCanal();     
        minhaTv.subirCanal();     
        minhaTv.descerCanal();   
        minhaTv.desligar();
    }
}
