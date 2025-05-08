public class Pessoa {
    String nome;
    String endereco;
    String cpf;
    int idade;
    String estadoCivil;
    boolean dependentes;

    // Construtor
    public Pessoa (String nome, String endereco, String cpf, int idade, String estadoCivil, boolean dependentes) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.idade = idade;
        this.estadoCivil = estadoCivil;
        this.dependentes = dependentes;
    }

    // Método para exibir os dados
    public void exibirDados(){
        System.out.println("----FUNCIONÁRIO(A)----");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Estado Civil: " + estadoCivil);
        System.out.println("Possui dependentes? " + (dependentes ? "Sim" : "Não"));
        System.out.println("--------------------------");
    }

}
