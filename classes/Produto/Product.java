package classes.Produto;

import java.util.Scanner;

public class Product extends ProdutoMae {

  Scanner sc = new Scanner(System.in);

  @Override
  public void inforProdutos() {
    String categoria[] = {
      "Video game",
      "Cozinha",
      "Gamer",
      "Multiplataforma",
      "Casa",
    };
    String[] descricao = {
      "Inicio i",
      "inicio ii",
      "inicio iii",
      "inicio iv",
      "inicio v",
    };
    String[] nome = { "Gus", "Bia", "Gab", "Eli", "Ana" };
    Double[] valor = { 7.5, 9.5, 10.5, 55.3, 16.42 };

    for (int i = 0; i < 5; i++) {
      this.setCategoria(categoria[i]);
      this.setDescricao(descricao[i]);
      this.setNome(nome[i]);
      this.setValor(valor[i]);

      System.out.println("\n_______________________________________");
      System.out.println(categoria[i]);
      System.out.println(descricao[i]);
      System.out.println(nome[i]);
      System.out.println(valor[i]);
      System.out.println("_______________________________________\n");

    }
  }
}
