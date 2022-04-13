import java.util.Scanner;
import classes.Usuario.*;
import classes.Produto.*;
import java.io.*;

public class index {
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {
     
      //Objetos
      Scanner recebe = new Scanner(System.in);
      UsuarioExistente usuarioExistente = new UsuarioExistente();
      UsuarioNovo usuarioNovo = new UsuarioNovo();
      UserController US = new UserController();
      Product product = new Product();


      //Variaveis
      int opcao;
      boolean sair = false;
      //Inicio programa
      while(!sair){
        System.out.println("1-Acessar Login\n2-Cadastrar Usuario\n3-Sair");
        opcao = recebe.nextInt();

        switch (opcao) {
          case 1:
          usuarioExistente.receberUser(US);
              usuarioExistente.Login();
              if(usuarioExistente.isLogado() == true){
                product.inforProdutos();
                
              }
            break;
          case 2:
            usuarioNovo.Login();
            US.adicionar(usuarioNovo);
            
          break;
          default:
          System.out.println(ANSI_YELLOW + "Saindo..." + ANSI_RESET);
          sair = true;
            break;
        }
      }
    }
}
