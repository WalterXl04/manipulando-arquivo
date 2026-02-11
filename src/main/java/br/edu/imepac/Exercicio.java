package br.edu.imepac;

import br.edu.imepac.entidades.Produto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Produto> lista = new ArrayList<>();
    String path = "c:\\temp\\lista.txt";
    int op = 3;
    while (op != 0) {

      System.out.println("Digite 1 se deseja adicionar mais produtos");
      System.out.println("-------------------------------------------");
      System.out.println("Digite 0 se deseja sair! ");
      op = Integer.parseInt(sc.nextLine());

    if (op == 1) {
      System.out.println("Digite o nome do produto: ");
      String nome = sc.nextLine();
      System.out.println("Digite o preço do produto: ");
      Double preco = Double.parseDouble(sc.nextLine());
      System.out.println("Digite o quantidade do produto: ");
      int quantidade = Integer.parseInt(sc.nextLine());
      lista.add(new Produto(nome, preco, quantidade));
    }else if (op == 0) {
      System.out.println("Obrigado!");
    }
  }
    System.out.println("O total de itens adicionado: " + lista.size());

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
      for (Produto p: lista){
        bw.write(p.toString());
        bw.newLine();
      }

    }catch(IOException e){
      e.printStackTrace();
    }
  }

}
