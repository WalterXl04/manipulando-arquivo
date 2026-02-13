package br.edu.imepac;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Leitor {
  public static void gerarRelatorio() {

    String path = "c:\\temp\\lista.txt";
    double total = 0;

    System.out.println("Lendo arquivos de compras! ");
    System.out.println("===================================");

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String linha = br.readLine();
      while (linha != null) {
        String[] vet = linha.split(";");

        String nome = vet[0];
        double preco = Double.parseDouble(vet[1]);
        int quantidade = Integer.parseInt(vet[2]);

        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);

        double subTotal = preco * quantidade;
        total += subTotal;

        System.out.println(nome + " - R$ " + preco + " x " + quantidade + " = R$ " + subTotal);
        linha = br.readLine();
      }
      System.out.println("========================================================================");

      System.out.println("O total do Estoque é  R$ " + total);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void buscarProduto(String nomeProduto) {
    String path = "c:\\temp\\lista.txt";
    System.out.println("\n=== BUSCANDO POR: " + nomeProduto + " ===");

    boolean encontrou = false;

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

      String linha = br.readLine();
      while (linha != null) {
        String[] vet = linha.split(";");

        if (vet[0].equalsIgnoreCase(nomeProduto)) {
          System.out.println("PRODUTO ENCONTRADO!");
          System.out.println("Nome: " + vet[0]);
          System.out.println("Preço: " + vet[1]);
          System.out.println("Quantidade: " + vet[2]);
          encontrou = true;
          break;
        }
        linha = br.readLine();

      }
      if (!encontrou) {
        System.out.println("PRODUTO NÃO ENCONTRADO!");
      }

    } catch (IOException e) {
      System.out.println("Erro ao ler arquivo: " + e.getMessage());
    }
  }

}


