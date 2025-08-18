package map.operacoes_basicas;

public class Main {

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Douglas", 123456);
        agendaContatos.adicionarContato("Douglas", 789412);
        agendaContatos.adicionarContato("Douglas Bruno", 111111);
        agendaContatos.adicionarContato("Maria", 123456);
        agendaContatos.adicionarContato("Paulo", 123456);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Douglas Bruno");

        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Maria"));

    }

}
