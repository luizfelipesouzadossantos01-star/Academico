import java.time.LocalDate;

public class Consulta {
    private Medico medicoResponsavel;
    private Paciente paciente;
    private LocalDate dataConsulta;
    private String observacao;

    public Consulta(Paciente paciente, Medico medicoResponsavel) {
        this.paciente = paciente;
        this.medicoResponsavel = medicoResponsavel;
    }

    public void agendarConsulta() {
        this.dataConsulta = LocalDate.now();
        this.observacao = "Atendimento imediato de encaixe.";
        confirmarAgendamento();
    }

 
    public void agendarConsulta(LocalDate data) {
        this.dataConsulta = data;
        this.observacao = "Atendimento agendado padrão.";
        confirmarAgendamento();
    }

    public void agendarConsulta(LocalDate data, String observacao) {
        this.dataConsulta = data;
        this.observacao = observacao;
        confirmarAgendamento();
    }

    private void confirmarAgendamento() {
        System.out.println("Consulta confirmada com Dr(a). " + medicoResponsavel.getNome() 
                + " para o paciente " + paciente.getNome() 
                + " | Data: " + this.dataConsulta 
                + " | Observação: " + this.observacao);
    }
}
