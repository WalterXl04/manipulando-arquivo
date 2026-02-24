package br.edu.imepac.util;


import java.io.*;

public class GerenciadorExclusao {

  public static void deletarProduto(String nome ) {
    File arquivoOriginal = new File("c:\\temp\\lista.txt");
    File arquivoTemp = new File("c:\\temp\\temp.txt");

    try {

      BufferedReader leitor = new BufferedReader(new FileReader(arquivoOriginal));
      BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoTemp));

      String linha;
      while ((linha = leitor.readLine()) != null) {
        if (!linha.contains(nome)) {
          escritor.write(linha );
          escritor.newLine();
        }
      }
      leitor.close();
      escritor.close();

      arquivoOriginal.delete();
      arquivoTemp.renameTo(arquivoOriginal);

    }catch (Exception e) {
      System.out.println("Erro ao manipular arquivo" + e.getMessage());
    }


  }
}
