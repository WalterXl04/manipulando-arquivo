# 🛒 Sistema de Gerenciamento de Estoque - Mercadinho

Bem-vindo ao repositório do **Sistema de Gerenciamento de Estoque**! Este é um projeto desenvolvido em **Java**, focado em aplicar conceitos sólidos de Programação Orientada a Objetos (POO) e manipulação de arquivos de texto (I/O).

## 🎯 Objetivo do Projeto
Criar uma aplicação via terminal (Console/CLI) para gerenciar os produtos de um mercadinho, permitindo o controle total do estoque através de um menu interativo, salvando os dados de forma persistente em um arquivo `.txt`.

## 🚀 Funcionalidades (Status: CR_D)
O sistema já conta com as seguintes operações de banco de dados em arquivo:

- [x] **Case 1: Cadastrar Produtos (Create)** - Adiciona novos produtos ao arquivo de estoque.
- [x] **Case 2: Gerar Relatórios (Read)** - Lista todos os produtos cadastrados no sistema.
- [x] **Case 3: Buscar Produto (Read)** - Filtra e encontra um produto específico no estoque.
- [x] **Case 4: Deletar Produto (Delete)** - Remove um produto do estoque utilizando a arquitetura de arquivos temporários.

## 💻 Tecnologias e Conceitos Utilizados
Durante o desenvolvimento deste sistema, os seguintes conceitos e ferramentas da linguagem Java foram aplicados:

* **Linguagem:** Java
* **Manipulação de Arquivos (java.io):**
  * `File` (Mapeamento de caminhos)
  * `FileReader` e `BufferedReader` (Leitura otimizada)
  * `FileWriter` e `BufferedWriter` (Escrita otimizada)
* **Tratamento de Exceções:** Uso de blocos `try-catch` para garantir a segurança na manipulação de arquivos e entradas de usuário (`NumberFormatException`, `IOException`).
* **Estruturas de Controle:** Laços de repetição (`do-while`, `while`) e menus de decisão (`switch-case`).
* **Arquitetura:** Separação de responsabilidades em pacotes (`entidades`, `util`).

## 📂 Estrutura de Pacotes
O projeto segue o princípio da responsabilidade única, dividindo as classes por contexto:
* `br.edu.imepac.entidades`: Contém as regras de negócio dos objetos (ex: `Produto`).
* `br.edu.imepac.util`: Contém as ferramentas do sistema (ex: `Leitor`, `GerenciadorExclusao`).

---
*Desenvolvido com dedicação e muito café por Luis! ☕*
