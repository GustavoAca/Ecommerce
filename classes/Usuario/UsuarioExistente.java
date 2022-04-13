package classes.Usuario;


import java.util.Scanner;



public class UsuarioExistente extends UserMae {
  //CORES PARA ACESSO PERMITIDO OU NEGADO
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_RESET = "\u001B[0m";

  private UserController newUser;
  private boolean logado;

  Scanner scan = new Scanner(System.in);

  public void receberUser(UserController UC) {
    this.newUser = UC;
 
  }

  @Override
  public void Login() {
try{
      System.out.print("Insira seu email: ");
      this.setEmail(scan.nextLine());
      System.out.println("");

      System.out.println("Insira a senha");
      this.setSenha(scan.nextLine());
      System.out.println("");


      this.newUser.cadastrado.forEach(
          p -> {
            if(p.getEmail().equals(this.getEmail()) && p.getSenha().equals(this.getSenha())){
              System.out.println(ANSI_GREEN + "Login com sucesso" + ANSI_RESET);
              logado = true;

            }
            else {
              System.out.print(ANSI_RED + "Usuario ou senha incorretos" + ANSI_RESET);
            }
          }
        );
        }catch(Exception e){
          System.out.println(
            "Erro"
          );

          
        }
  }

  public UserController getNewUser() {
    return newUser;
  }

  public void setNewUser(UserController newUser) {
    this.newUser = newUser;
  }

  public boolean isLogado(){
    return logado;
  }

  public void setLogado(boolean logado){
    this.logado = logado;
  }
}
