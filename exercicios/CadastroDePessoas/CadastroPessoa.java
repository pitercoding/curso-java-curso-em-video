package exercicios.CadastroDePessoas;

import java.util.ArrayList;

public class CadastroPessoa {
    private ArrayList<Pessoa> pessoas;

    // Construtor
    public CadastroPessoa() {
        pessoas = new ArrayList<>();
    }

    // Método para adicionar uma pessoa
    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa); // Adiciona a pessoa na lista
    }

    // Método para listar todas as pessoas cadastradas
    public void listarPessoas() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            for (Pessoa pessoa : pessoas) {
                System.out.println(pessoa); // Chama o método toString da classe Pessoa
            }
        }
    }
}
