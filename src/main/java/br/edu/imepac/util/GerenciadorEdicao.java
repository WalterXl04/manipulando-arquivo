package br.edu.imepac.util;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;


public class GerenciadorEdicao {


  public static void editarProduto(String nome){
    Scanner sc = new Scanner(System.in);
    File arquivoOriginal = new File("c:\\temp\\lista.txt");
    File arquivoTemp = new File("c:\\temp\\edit.txt");

    try{
      BufferedReader leitor = new BufferedReader(new FileReader(arquivoOriginal));
      BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoTemp));

      String linha;
      boolean encontrado = false;

      while ((linha = leitor.readLine())  != null) {
        if (linha.contains(nome)) {
          encontrado = true;
          System.out.println("Produto encontrado: " + nome);
          System.out.println("Digite o nome atualizado do produto: ");
          String novoNome = sc.nextLine();

          System.out.println("Digite o preço atualizado do produto: ");
          String novoPreco = sc.nextLine();

          System.out.println("Digite a quantidade atualizado do produto: ");
          String novoQuantidade = sc.nextLine();

          String linhaAtualizada = novoNome + ";" + novoPreco + ";" + novoQuantidade;

          escritor.write(linhaAtualizada);
          escritor.newLine();
        }else{
          escritor.write(linha);
          escritor.newLine();
      }
      }

      escritor.close();
      leitor.close();

      arquivoOriginal.delete();
      arquivoTemp.renameTo(arquivoOriginal);
    }catch(Exception e){
      System.out.println("Erro ao editar produto" + e.getMessage());
    }
  }
}
