public class Medico extends Pessoa {
    private String crm;

    public Medico(String nome, String cpf, String crm) {
        super(nome, cpf);
        this.crm = crm;
    }

    public String getCrm() { return crm; }
    @Override
    public void exibirPerfil() {
        System.out.println("[PERFIL MÉDICO] Dr(a). " + getNome() + " | CRM: " + this.crm);
    }
}

