package list.pesquisa;

public class Main {

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2000);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2005);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2010);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2012);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 2000);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println(catalogoLivros.pesquisarPorIntervalosAnos(2000, 2010));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }

}
