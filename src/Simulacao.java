import pacientes.*;
import atendentes.*;
import java.time.*;
import java.util.ArrayList;

public class Simulacao {

  private static LocalTime tempoTotal;
  private ArrayList<Atendente> atendentes;

  public Simulacao() {
    AcessaDados lerArquivo = new AcessaDados();

    ArrayList<Atendente> atendentes = lerArquivo.lerAtendentes();
  }

  public void getPaciente() {
    // Paciente novoPaciente;

    // if fila prioritaria
    // novoPaciente =
    // else fila normal
    // novoPaciente =

    // ...

    // return novoPaciente;
  }
}