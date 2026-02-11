# 🛒 Sistema de Gestão de Estoque com Persistência em Arquivo

Sistema desenvolvido em Java para aplicar o ciclo completo de manipulação de arquivos (I/O): **Escrita (Gravação)** e **Leitura (Parsing)** de dados, utilizando boas práticas de Programação Orientada a Objetos.

O projeto simula um sistema de mercado onde é possível cadastrar produtos, salvar em disco e depois ler para gerar relatórios financeiros.

## 📂 Estrutura do Projeto

O código está organizado em pacotes para separar responsabilidades (MVC):

* `src/br/edu/imepac/entidades/Produto.java`: **Modelo (Entidade)**. Classe que define o objeto Produto.
* `src/br/edu/imepac/Exercicio.java`: **Módulo de Escrita**. Responsável por interagir com o usuário e salvar os dados.
* `src/br/edu/imepac/Leitor.java`: **Módulo de Leitura**. Responsável por ler o arquivo e gerar o relatório.

## 🚀 Funcionalidades

### 1. Cadastro (Classe `Exercicio`)
* Recebe dados do usuário via terminal (Nome, Preço, Quantidade).
* Cria objetos do tipo `Produto`.
* Armazena os dados no arquivo `C:\temp\lista.txt` usando `BufferedWriter`.

### 2. Relatório (Classe `Leitor`)
* Lê o arquivo de texto gerado.
* Realiza o **Parsing** dos dados (converte Texto -> Número).
* Calcula o subtotal (`Preço * Quantidade`) e o **Total Geral do Estoque**.
* Exibe os dados formatados no console.

## 🛠️ Tecnologias Utilizadas

* **Java 17+**
* **POO:** Classes, Objetos, Encapsulamento e Pacotes.
* **Collections:** `ArrayList` para listas em memória.
* **File I/O:** `FileReader`, `BufferedReader`, `FileWriter`, `BufferedWriter`.
* **String Manipulation:** Método `.split(";")` para tratamento de dados CSV.

## 📦 Como Executar

1.  **Pré-requisito:** Crie a pasta `C:\temp\` no seu computador.
2.  **Passo 1 (Gravar):** Execute a classe `Exercicio`.
  * Cadastre alguns produtos (Ex: Arroz, 10.0, 3).
  * Digite `0` para sair e salvar.
3.  **Passo 2 (Ler):** Execute a classe `Leitor`.
  * O console mostrará a lista de compras e o valor total calculado.

## ✅ Exemplo de Saída (Console do `Leitor`)

```text
--- Lendo Arquivo de Compras ---
PRODUTO: Arroz
Preço: R$ 10.0
Qtd: 3
Arroz - R$ 10.0 x 3 = R$ 30.0
-----------------
VALOR TOTAL DO ESTOQUE: R$ 30.0
