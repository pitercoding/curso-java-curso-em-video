package exercicios.CadastroDePessoas;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;

    // Construtor
    public Pessoa(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    // Método toString para mostrar os dados da pessoa
    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Email: " + email;
    }
}

