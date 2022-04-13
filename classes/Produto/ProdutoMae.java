package classes.Produto;

import interfaces.interfaceProduct;

public abstract class ProdutoMae implements interfaceProduct {
  private double valor;
  private String nome;
  private String descricao;
  private String categoria;

  public void inforProdutos(){
      
  }


  public double getValor() {
    return valor;
  }
  public void setValor(double valor) {
    this.valor = valor;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public String getCategoria() {
    return categoria;
  }
  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }
  
}
