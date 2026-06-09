public class Paciente extends Pessoa {
    private Prontuario prontuario;

    public Paciente(String nome, String cpf) {
        super(nome, cpf);
        this.prontuario = new Prontuario(); 
    }

    public Prontuario getProntuario() { return prontuario; }

    @Override
    public void exibirPerfil() {
        System.out.println("[PERFIL PACIENTE] Nome: " + getNome() + " | CPF: " + getCpf());
    }
}
