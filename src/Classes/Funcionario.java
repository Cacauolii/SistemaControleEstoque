package Classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Funcionario extends BaseLog{
        private String cpf;
        private String endereco;
        private String dataNascimento;
        private int telefone;
        private String situacao;
        private String cargo;
        private double salario;
        private String senha;
        private String foto;
        private static Map<Integer, Funcionario> funcionarios = new HashMap<>();
        private static Map<String, String> adminCredenciais = new HashMap<>();
        Scanner teclado = new Scanner(System.in);

public Funcionario() {
        // Dados de exemplo para funcionários
        Funcionario funcionario1 = new Funcionario("12345678901", "Rua A", "01/01/1980", 123456789, "Ativo", "Gerente", 5000.0, "senha123");
        Funcionario funcionario2 = new Funcionario("98765432109", "Rua B", "02/02/1990", 987654321, "Ativo", "Vendedor", 3000.0, "senha456");

        funcionarios.put(1, funcionario1);
        funcionarios.put(2, funcionario2);

        adminCredenciais.put("admin", "admin123");
}
public Funcionario(String cpf, String endereco, String dataNascimento, int telefone, String situacao, String cargo, double salario, String senha) {
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.situacao = situacao;
        this.cargo = cargo;
        this.salario = salario;
        this.senha = senha;
 }
public boolean verificarSenhaFuncionario(int id, String senhaEntrada) {
        Funcionario funcionario = funcionarios.get(id);
        return funcionario != null && funcionario.senha.equals(senhaEntrada);
 }

public void inputFuncionario() {
        System.out.print("CPF: ");
        this.cpf = teclado.nextLine();
        System.out.print("Endereço: ");
        this.endereco = teclado.nextLine();
        System.out.print("Data de Nascimento: ");
        this.dataNascimento = teclado.nextLine();
        System.out.print("Telefone: ");
        this.telefone = teclado.nextInt();
        teclado.nextLine(); 
        System.out.print("Situação: ");
        this.situacao = teclado.nextLine();
        System.out.print("Cargo: ");
        this.cargo = teclado.nextLine();
        System.out.print("Salário: ");
        this.salario = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Senha: ");
        this.senha = teclado.nextLine();
        int idFuncionario = funcionarios.size() + 1;
        funcionarios.put(idFuncionario, new Funcionario(cpf, endereco, dataNascimento, telefone, situacao, cargo, salario, senha));
        writeLog("Funcionário registrado: " + cpf);
    }

public boolean loginAdm() {
        System.out.print("Login: ");
        String login = teclado.nextLine();
        System.out.print("Senha: ");
        String senha = teclado.nextLine();

        String senhaAdmin = adminCredenciais.get(login);
        if (senhaAdmin != null && senhaAdmin.equals(senha)) {
            System.out.println("Login de administrador bem-sucedido.");
            return true;
        } else {
            System.out.println("Credenciais de administrador incorretas.");
            return false;
        }
    }

public void atualizarEstoque(Produtos produto) {
        System.out.print("Digite a nova quantidade do produto: ");
        int novaQuantidade = teclado.nextInt();
        produto.setQuantidade(novaQuantidade);
        writeLog("Estoque atualizado para o produto: " + produto.getNome() + ", Nova quantidade: " + novaQuantidade);
    }

public void atualizarEndereco() {
        System.out.print("Digite o novo endereço: ");
        this.endereco = teclado.nextLine();
        writeLog("Endereço atualizado para: " + this.endereco);
    }

public void atualizarTelefone() {
        System.out.print("Digite o novo telefone: ");
        this.telefone = teclado.nextInt();
        writeLog("Telefone atualizado para: " + this.telefone);
    }

public void atualizarFoto() {
        System.out.print("Digite a URL da nova foto: ");
        this.foto = teclado.nextLine();
        writeLog("Foto atualizada para: " + this.foto);
    }

public String getCpf() {
        return cpf;
    }

public String getEndereco() {
        return endereco;
    }

public String getDataNascimento() {
        return dataNascimento;
    }

public int getTelefone() {
        return telefone;
    }

public String getSituacao() {
        return situacao;
    }

public String getCargo() {
        return cargo;
    }

public double getSalario() {
        return salario;
    }

public String getSenha() {
        return senha;
    }

public String getFoto() {
        return foto;
    }
}

  