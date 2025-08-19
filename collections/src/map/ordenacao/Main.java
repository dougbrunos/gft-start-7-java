package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.AUGUST, 21), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.AUGUST, 20), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 01), "Evento 2", "Atração 2");
        
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }

}
