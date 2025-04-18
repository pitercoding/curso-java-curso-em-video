package exercicios.CadastroDePessoas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CadastroPessoa cadastro = new CadastroPessoa(); // Cria o objeto CadastroPessoa

        int opcao = 0;

        while (opcao != 3) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("3 - Sair");

            opcao = scanner.nextInt(); // Lê a opção do usuário

            switch (opcao) {
                case 1:
                    // Cadastro de uma nova pessoa
                    scanner.nextLine(); // Limpa o buffer do scanner
                    System.out.println("Digite o nome da pessoa:");
                    String nome = scanner.nextLine(); // Lê o nome
                    System.out.println("Digite a idade da pessoa:");
                    int idade = scanner.nextInt(); // Lê a idade
                    scanner.nextLine(); // Limpa o buffer do scanner
                    System.out.println("Digite o email da pessoa:");
                    String email = scanner.nextLine(); // Lê o email

                    Pessoa pessoa = new Pessoa(nome, idade, email); // Cria o objeto Pessoa
                    cadastro.adicionarPessoa(pessoa); // Adiciona a pessoa no cadastro
                    System.out.println("Pessoa cadastrada com sucesso!");
                    break;
                case 2:
                    // Listar todas as pessoas cadastradas
                    System.out.println("Pessoas cadastradas:");
                    cadastro.listarPessoas(); // Lista todas as pessoas
                    break;

                case 3:
                    // Sair do sistema
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
                }
            }
                scanner.close(); // Fecha o scanner
    }
}
