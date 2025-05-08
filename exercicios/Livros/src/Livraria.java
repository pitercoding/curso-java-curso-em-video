import java.util.ArrayList;

public class Livraria {

    // Classe Livro
    static class Livro {
        String titulo;
        String autor;
        int anoPublicacao;
        String genero;
        String isbn;
        int numeroPaginas;
        boolean disponivelParaVenda;

        // Construtor
        public Livro(String titulo, String autor, int anoPublicacao, String genero, String isbn, int numeroPaginas, boolean disponivelParaVenda) {
            this.titulo = titulo;
            this.autor = autor;
            this.anoPublicacao = anoPublicacao;
            this.genero = genero;
            this.isbn = isbn;
            this.numeroPaginas = numeroPaginas;
            this.disponivelParaVenda = disponivelParaVenda;
        }

        // Método para exibir os dados do livro
        public void exibirDados() {
            System.out.println("--L I V R A R I A  G O M E S--");
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Ano de Publicação: " + anoPublicacao);
            System.out.println("Gênero: " + genero);
            System.out.println("ISBN: " + isbn);
            System.out.println("Número de Páginas: " + numeroPaginas);
            System.out.println("Disponível para venda: " + (disponivelParaVenda ? "Sim" : "Não"));
            System.out.println("-------------------------------");
        }
    }

    // Método principal
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();

        // Adicionando livros à lista
        livros.add(new Livro("Dom Casmurro", "Machado de Assis", 1899, "Romance", "978-85-06-04130-1", 256, true));
        livros.add(new Livro("O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", 1954, "Fantasia", "978-85-98078-47-1", 576, true));
        livros.add(new Livro("1984", "George Orwell", 1949, "Distopia", "978-0-452-28423-4", 328, false));
        livros.add(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, "Infantil / Filosofia", "978-3-16-148410-0", 96, true));
        livros.add(new Livro("A Revolução dos Bichos", "George Orwell", 1945, "Fábula Política", "978-0-452-28424-1", 144, true));
        livros.add(new Livro("O Código Da Vinci", "Dan Brown", 2003, "Suspense / Mistério", "978-0-385-50420-8", 480, true));
        livros.add(new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997, "Fantasia", "978-85-325-1811-5", 264, false));
        livros.add(new Livro("A Menina que Roubava Livros", "Markus Zusak", 2005, "Drama / Histórico", "978-0-375-84220-7", 480, true));
        livros.add(new Livro("Capitães da Areia", "Jorge Amado", 1937, "Romance / Social", "978-85-01-09238-5", 256, true));
        livros.add(new Livro("O Alquimista", "Paulo Coelho", 1988, "Ficção Filosófica", "978-0-06-112241-5", 208, false));

        // Exibindo todos os livros
        for (Livro livro : livros) {
            livro.exibirDados();
        }
    }
}
