import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Carlos Eduardo", "111.111.111-11");
        Medico medico = new Medico("Ana Clara", "222.222.222-22", "CRM-9090");
        Enfermeiro enfermeiro = new Enfermeiro("Roberto Alves", "333.333.333-33", "COREN-5050");

        paciente.exibirPerfil();
        medico.exibirPerfil();
        enfermeiro.exibirPerfil();

        System.out.println();

        Consulta consulta1 = new Consulta(paciente, medico);
        consulta1.agendarConsulta();

        Consulta consulta2 = new Consulta(paciente, medico);
        consulta2.agendarConsulta(LocalDate.of(2026, 6, 20));

        Consulta consulta3 = new Consulta(paciente, medico);
        consulta3.agendarConsulta(LocalDate.of(2026, 7, 15), "Retorno para avaliar exames de sangue.");
    }
}
