package Classes;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Usuario extends BaseLog {
        private int idEmpresa;
        private String usuario;
        private String senha;
        private String email;
        private String nome;
        private String foto;
        private static Map<String, Usuario> usuarios = new HashMap<>();
        Scanner teclado = new Scanner(System.in);

public Usuario() {
            // Adicionando alguns usuários de exemplo
            usuarios.put("user1", new Usuario(1, "user1", "senha1", "user1@example.com", "User One", "foto1.jpg"));
            usuarios.put("user2", new Usuario(2, "user2", "senha2", "user2@example.com", "User Two", "foto2.jpg"));
 }
public Usuario(int idEmpresa, String usuario, String senha, String email, String nome, String foto) {
            this.idEmpresa = idEmpresa;
            this.usuario = usuario;
            this.senha = senha;
            this.email = email;
            this.nome = nome;
            this.foto = foto;
        }

public void logar() {
            System.out.print("Usuário: ");
            String usuarioEntrada = teclado.nextLine();
            System.out.print("Senha: ");
            String senhaEntrada = teclado.nextLine();

        Usuario usuario = usuarios.get(usuarioEntrada);
        if (usuario != null && usuario.senha.equals(senhaEntrada)) {
            System.out.println("Login bem-sucedido.");
        } else {
            System.out.println("Credenciais incorretas.");
        }
     }
public void atualizarSenha() {
            System.out.print("Usuário: ");
            String usuarioEntrada = teclado.nextLine();
            System.out.print("Senha atual: ");
            String senhaAtual = teclado.nextLine();

        Usuario usuario = usuarios.get(usuarioEntrada);
        if (usuario != null && usuario.senha.equals(senhaAtual)) {
            System.out.print("Nova senha: ");
            String novaSenha = teclado.nextLine();
            usuario.senha = novaSenha;
            System.out.println("Senha atualizada com sucesso.");
            writeLog("Senha do usuário " + usuarioEntrada + " atualizada.");
        } else {
            System.out.println("Credenciais incorretas. Não foi possível atualizar a senha.");
        }
    }

public void atualizarFoto() {
            System.out.print("Usuário: ");
            String usuarioEntrada = teclado.nextLine();
            System.out.print("Senha: ");
            String senhaEntrada = teclado.nextLine();

        Usuario usuario = usuarios.get(usuarioEntrada);
        if (usuario != null && usuario.senha.equals(senhaEntrada)) {
            System.out.print("Nova URL da foto: ");
            String novaFoto = teclado.nextLine();
            usuario.foto = novaFoto;
            System.out.println("Foto atualizada com sucesso.");
            writeLog("Foto do usuário " + usuarioEntrada + " atualizada.");
        } else {
            System.out.println("Credenciais incorretas. Não foi possível atualizar a foto.");
        }
    }

public void atualizarNome() {
            System.out.print("Usuário: ");
            String usuarioEntrada = teclado.nextLine();
            System.out.print("Senha: ");
            String senhaEntrada = teclado.nextLine();

        Usuario usuario = usuarios.get(usuarioEntrada);
        if (usuario != null && usuario.senha.equals(senhaEntrada)) {
            System.out.print("Novo nome: ");
            String novoNome = teclado.nextLine();
            usuario.nome = novoNome;
            System.out.println("Nome atualizado com sucesso.");
            writeLog("Nome do usuário " + usuarioEntrada + " atualizado.");
        } else {
            System.out.println("Credenciais incorretas. Não foi possível atualizar o nome.");
        }
    }

public void visualizarEstoque(Produtos produto) {
            System.out.print("Usuário: ");
            String usuarioEntrada = teclado.nextLine();
            System.out.print("Senha: ");
            String senhaEntrada = teclado.nextLine();

        Usuario usuario = usuarios.get(usuarioEntrada);
        if (usuario != null && usuario.senha.equals(senhaEntrada)) {
            produto.informarDados();
        } else {
            System.out.println("Credenciais incorretas. Não foi possível visualizar o estoque.");
        }
    }

public void cadastrar() {
            System.out.print("Usuário: ");
            this.usuario = teclado.nextLine();
            System.out.print("Senha: ");
            this.senha = teclado.nextLine();
            System.out.print("Email: ");
            this.email = teclado.nextLine();
            System.out.print("Nome: ");
            this.nome = teclado.nextLine();
            writeLog("Usuário cadastrado: " + usuario);
    }
public int getIdEmpresa() {
    return idEmpresa;
}

public String getUsuario() {
    return usuario;
}

public String getSenha() {
    return senha;
}

public String getEmail() {
    return email;
}

public String getNome() {
    return nome;
}

public String getFoto() {
    return foto;
}
}

