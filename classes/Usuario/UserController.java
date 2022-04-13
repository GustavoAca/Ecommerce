package classes.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UserController {
 
  List<UsuarioNovo>  cadastrado = new ArrayList<>();
    
  public void adicionar(UsuarioNovo us){
      cadastrado.add(us);
      }
     
      public void ListaUsuario(){
        cadastrado.forEach((p) -> {
          System.out.println("______________________________________");
          System.out.println("Nome: " + p.getNome());
          System.out.println("Email: " + p.getEmail());
          System.out.println("______________________________________");
        });
      }
    }
  


