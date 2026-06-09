public class Enfermeiro extends Pessoa {
    private String coren;

    public Enfermeiro(String nome, String cpf, String coren) {
        super(nome, cpf);
        this.coren = coren;
    }

    public String getCoren() { return coren; }

    @Override
    public void exibirPerfil() {
        System.out.println("[PERFIL ENFERMEIRO] Nome: " + getNome() + " | COREN: " + this.coren);
    }
}
