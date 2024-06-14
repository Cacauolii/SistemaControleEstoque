package Classes;
import java.util.Scanner;

public class Cadastro extends BaseLog{
private String usuario;
private String senha;
private String email;
protected String nome;

Scanner teclado = new Scanner(System.in);


public void inputCadastro() {
   System.out.print("Nome: ");
   this.nome = teclado.nextLine();
   System.out.print("Usuário: ");
   this.usuario = teclado.nextLine();
   System.out.print("Email: ");
   this.email = teclado.nextLine();
   System.out.print("Senha: ");
   this.senha = teclado.nextLine();
   writeLog("Cadastro registrado: " + nome);
}

public void atualizarCadastro() {
   System.out.print("Atualizar Nome: ");
   this.nome = teclado.nextLine();
   System.out.print("Atualizar Usuário: ");
   this.usuario = teclado.nextLine();
   System.out.print("Atualizar Email: ");
   this.email = teclado.nextLine();
   System.out.print("Atualizar Senha: ");
   this.senha = teclado.nextLine();
   writeLog("Cadastro atualizado: " + nome);
}

public void visualizarCadastro() {
   System.out.println("=== Dados do Cadastro ===");
   System.out.println("Nome: " + nome);
   System.out.println("Usuário: " + usuario);
   System.out.println("Email: " + email);
   System.out.println("Senha: " + senha);
   writeLog("Cadastro visualizado: " + nome);
}
public String getEmail() {
    return email;
}
public String getSenha() {
    return senha;
}
public String getNome() {
    return nome;
}
public String getUsuario() {
    return usuario;
}
}
 