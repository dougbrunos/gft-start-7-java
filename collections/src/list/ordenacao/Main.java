package list.ordenacao;

public class Main {

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 25, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 10, 1.50);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.65);
        
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}
