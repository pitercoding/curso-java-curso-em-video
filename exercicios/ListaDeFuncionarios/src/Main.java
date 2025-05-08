public class Main {
    public static void main(String[] args) {
        // Criando objetos Pessoa
        Pessoa pessoa1 = new Pessoa("João Silva", "Rua A, 123", "123.456.789-00", 30, "Solteiro", false);
        Pessoa pessoa2 = new Pessoa("Maria Souza", "Av. B, 456", "987.654.321-00", 45, "Casada", true);
        Pessoa pessoa3 = new Pessoa("Carlos Mendes", "Rua das Flores, 321", "111.222.333-44", 28, "Solteiro", false);
        Pessoa pessoa4 = new Pessoa("Ana Paula", "Rua das Palmeiras, 98", "555.666.777-88", 36, "Divorciada", true);
        Pessoa pessoa5 = new Pessoa("Bruno Rocha", "Av. Central, 1000", "999.888.777-66", 52, "Casado", true);
        Pessoa pessoa6 = new Pessoa("Luciana Lima", "Travessa dos Jacarandás, 50", "333.444.555-66", 22, "Solteira", false);

        // Exibindo os dados
        pessoa1.exibirDados();
        pessoa2.exibirDados();
        pessoa3.exibirDados();
        pessoa4.exibirDados();
        pessoa5.exibirDados();
        pessoa6.exibirDados();
    }
}
