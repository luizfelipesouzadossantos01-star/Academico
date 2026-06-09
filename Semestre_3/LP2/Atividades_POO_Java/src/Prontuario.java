public class Prontuario {
    private String historico;
    
    public Prontuario() {
        this.historico = "Prontuário Iniciado. Sem registros anteriores.";
    }
    
    public void adicionarRegistro(String registro) {
        this.historico += "\n- " + registro;
    }
    
    public String getHistorico() { return historico; }
}
