package br.edu.imepac;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leitor {
  public static void main(String[] args) {

    String path = "c:\\temp\\lista.txt";
    double total = 0;

    System.out.println("Lendo arquivos de compras! ");
    System.out.println("===================================");

    try(BufferedReader br = new BufferedReader(new FileReader(path))){
      String linha = br.readLine();
      while(linha != null){
        String [] vet = linha.split(";");

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
    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
