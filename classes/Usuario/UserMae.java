package classes.Usuario;

import interfaces.*;

public abstract class UserMae implements interfaceUser {
  private String nome;
  private String senha;
  private String email; 
  

  public void  Login(){

  }

  public String getSenha(){
    return senha;
  }

  public void setSenha(String senha){
    this.senha = senha;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getEmail(){
    return email;
  }

  public void setEmail(String email){
    this.email = email;
  }


}
