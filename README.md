# 🛒 Sistema de Gerenciamento de Estoque (Mercadinho)

Bem-vindo ao repositório do **Sistema de Gerenciamento de Estoque**!
Este é um projeto de aplicação Console (linha de comando) desenvolvido em **Java**, focado em aplicar os conceitos fundamentais de **CRUD (Create, Read, Update, Delete)** utilizando manipulação direta de arquivos de texto (`.txt`).

## 📋 Funcionalidades

O sistema apresenta um menu interativo onde o usuário pode gerenciar o estoque da loja através das seguintes opções:

- **[ 1 ] Cadastrar produtos:** Adiciona novos produtos (Nome, Preço e Quantidade) ao estoque.
- **[ 2 ] Ver relatórios:** Lê o arquivo de banco de dados e exibe todos os produtos cadastrados, calculando o subtotal de cada item e o valor total em estoque.
- **[ 3 ] Procurar produtos:** Realiza uma busca específica pelo nome do produto e retorna seus detalhes.
- **[ 4 ] Deletar produto:** Remove um produto específico do registro de estoque.
- **[ 5 ] Editar produto:** Busca um produto existente e permite atualizar seu nome, preço e quantidade.
- **[ 0 ] Sair:** Encerra a aplicação de forma segura.

## 🛠️ Tecnologias e Conceitos Utilizados

- **Java (Standard Edition):** Linguagem principal do projeto.
- **Manipulação de Arquivos (java.io):** Uso intensivo de `File`, `FileReader`, `BufferedReader`, `FileWriter` e `BufferedWriter` para persistência de dados.
- **Arquivos Temporários:** Lógica de criação de arquivos `.tmp`/`.txt` auxiliares para operações complexas de Edição e Exclusão de linhas.
- **Estruturas de Controle:** Uso de laços `while`, `do-while`, e condicionais `switch-case` e `if-else`.
- **Tratamento de Exceções:** Blocos `try-catch` para garantir a estabilidade do programa ao ler/escrever arquivos e capturar entradas inválidas do usuário.
