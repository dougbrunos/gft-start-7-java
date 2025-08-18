package set.pesquisa;

public class Main {

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Douglas", 123456);
        agendaContatos.adicionarContato("Douglas Bruno", 111111);
        agendaContatos.adicionarContato("Douglas", 0);
        agendaContatos.adicionarContato("Maria", 111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Douglas"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria", 459999));

        agendaContatos.exibirContatos();
    }

}
