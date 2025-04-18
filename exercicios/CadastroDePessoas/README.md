# Sistema de Cadastro de Pessoas

## Descrição

Este projeto é um sistema simples de cadastro de pessoas que permite adicionar informações como nome, idade e e-mail, utilizando os conceitos de **Programação Orientada a Objetos (POO)** em Java.

Através de um menu interativo, o usuário pode:

* Cadastrar uma nova pessoa, fornecendo seu nome, idade e e-mail.
* Listar todas as pessoas cadastradas no sistema.

Este exercício utiliza conceitos de Arrays ou ArrayList, além de práticas de entrada e saída de dados com a classe `Scanner` do Java.

# Tecnologias

* Java: Linguagem de programação principal utilizada para o desenvolvimento do sistema.
* POO (Programação Orientada a Objetos): Uso de classes, objetos, atributos e métodos.

## Como rodar o projeto

# Pré-requisitos
Antes de rodar o projeto, certifique-se de ter o Java instalado em sua máquina. Você pode verificar se o Java está instalado executando o seguinte comando no terminal:

```bash
java -version
```

Se o Java não estiver instalado, você pode baixá-lo [aqui](https://www.java.com/pt-BR/).

# Passos para rodar o sistema
1. Clone ou baixe este repositório para sua máquina.

2. Abra o projeto no VS Code (ou qualquer outro editor de sua preferência).

3. Compile o código utilizando o seguinte comando no terminal:

```bash
javac Main.java
```

4. Após a compilação bem-sucedida, execute o programa com o comando:

```bash
java Main
```

5. O sistema irá apresentar um menu no terminal com as seguintes opções:

* 1: Cadastrar uma nova pessoa.

* 2: Listar todas as pessoas cadastradas.

* 3: Sair do sistema.

# Exemplo de execução
```bash
Escolha uma opção:
1 - Cadastrar pessoa
2 - Listar pessoas
3 - Sair
1
Digite o nome da pessoa:
Maria
Digite a idade da pessoa:
25
Digite o email da pessoa:
maria@example.com
Pessoa cadastrada com sucesso!

Escolha uma opção:
1 - Cadastrar pessoa
2 - Listar pessoas
3 - Sair
2
Pessoas cadastradas:
Nome: Maria
Idade: 25
Email: maria@example.com
```

## Estrutura do projeto
O projeto é composto pelas seguintes classes:

1. **Pessoa.java**: Representa os dados de uma pessoa (nome, idade e e-mail).

2. **CadastroPessoa.java**: Gerencia o cadastro de pessoas e contém os métodos para adicionar e listar pessoas cadastradas.

3. **Main.java**: Controla a interface com o usuário, mostrando o menu e interagindo com as classes para cadastrar e listar pessoas.

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para fazer pull requests ou enviar sugestões de melhorias.

## Licença
Este projeto está licenciado sob a MIT License - veja o arquivo LICENSE para mais detalhes.