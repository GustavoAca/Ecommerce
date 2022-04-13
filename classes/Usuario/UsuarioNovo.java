package classes.Usuario;
import java.io.*;

import java.util.Scanner;


public class UsuarioNovo extends UserMae {
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_RED = "\u001B[31m";

  Scanner scan = new Scanner(System.in);

  @Override
  public void Login() {
    String verSenha;
    boolean pass = true;

    System.out.println("Insira o seu email: ");
    this.setEmail(scan.nextLine());

    System.out.println("Insira o seu nome: ");
    this.setNome(scan.nextLine());
    do {
      System.out.println("Insira a senha: ");
      this.setSenha(scan.nextLine());

      System.out.println("Repita a senha: ");
      verSenha = scan.nextLine();

      if (verSenha.equals(this.getSenha())) {
        System.out.println(ANSI_GREEN +  "Usuario cadastrado" + ANSI_RESET);
        pass = true;
      } else {
        System.out.println(ANSI_RED +
         "As senhas não conferem!" + ANSI_RESET);
        pass = false;
      }
    } while (!pass);
  }
}
