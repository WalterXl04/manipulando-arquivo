# 🛒 Sistema de Gestão de Produtos com Persistência em Arquivo

Projeto desenvolvido em **Java** para aplicar conceitos de Programação Orientada a Objetos e Manipulação de Arquivos (I/O). O sistema simula o cadastro de produtos de um mercado, salvando os dados em disco e gerando relatórios de estoque.

## 🚀 Funcionalidades

O projeto é dividido em dois módulos principais:

1.  **Módulo de Escrita (Cadastro):**
  * Captura dados do usuário via Terminal (Nome, Preço, Quantidade).
  * Utiliza a classe `Produto` (Entidade) para modelar os dados.
  * Persiste as informações em um arquivo de texto (`.txt`) no formato CSV (separado por ponto e vírgula).

2.  **Módulo de Leitura (Relatório):**
  * Lê o arquivo gerado anteriormente.
  * Realiza o *parsing* dos dados (converte `String` para `double`/`int`).
  * Calcula o subtotal de cada item (`Preço * Quantidade`).
  * Exibe o **Valor Total do Estoque** no console.

## 🛠️ Tecnologias e Conceitos Utilizados

* **Java 17+**
* **POO:** Encapsulamento, Classes, Objetos e Construtores.
* **Collections:** `ArrayList` para manipulação de listas em memória.
* **File I/O:** `BufferedWriter` e `FileWriter` (para escrita); `BufferedReader` e `FileReader` (para leitura).
* **Tratamento de Exceções:** Blocos `try-with-resources` para garantir o fechamento seguro dos arquivos.
* **Manipulação de Strings:** Método `.split(";")` para processar os dados do arquivo.

## 📂 Estrutura do Arquivo (.txt)

O sistema gera/lê um arquivo no seguinte padrão:

```text
Arroz;10.0;3
Feijao;8.50;2
Macarrao;5.0;5
