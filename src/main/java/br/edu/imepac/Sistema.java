package br.edu.imepac;

import br.edu.imepac.util.GerenciadorExclusao;
import br.edu.imepac.util.Leitor;

import java.util.Scanner;

public class Sistema {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int opcao = -5;

    do {
      System.out.println("Escolha 1 para cadastrar produtos ao estoque.");
      System.out.println("Escolha 2 para ver relatórios. ");
      System.out.println("Escolha 3 para procurar produtos. ");
      System.out.println("Escolha 4 para deletar algum produto. ");
      try {
        opcao = Integer.parseInt(sc.nextLine());
      }catch (NumberFormatException e) {
        opcao = -1;
      }

      switch (opcao) {
        case 1:
          Exercicio.cadastrar();
          break;
        case 2:
          Leitor.gerarRelatorio();
          break;
        case 3:
          System.out.println("Digite o nome do produto: ");
          String nomeProduto = sc.nextLine();
          Leitor.buscarProduto(nomeProduto);
          break;

          case 4:
            System.out.println("Digite o nome do produto: ");
            String nomeProduto2 = sc.nextLine();
            GerenciadorExclusao.deletarProduto(nomeProduto2);
            break;
        case 0:
          System.out.println("Saindo!!");
          break;
        default:
          System.out.println("Opção inválida!");
      }
    } while (opcao != 0);
    sc.close();
      }
    }

