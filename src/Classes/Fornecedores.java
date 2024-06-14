package Classes;

import java.util.Scanner;

class Fornecedores extends BaseLog {
    private String nomeEmpresa;
    private String cnpj;
    private String endereco;
    private int telefone;
    private String senha;
    Scanner teclado = new Scanner(System.in);

    public Fornecedores() {
        // Exemplo de dados para fornecedores
        Fornecedores fornecedores1 = new Fornecedores("Samsung", "10020506", "Rua Angelo Marques", 779846767, "12345"  );
        Fornecedores fornecedores2 = new Fornecedores("Mercado Livre", "2005753", "Rua Pinheiros Carlos", 779987654, "54321"  );

    }

    public Fornecedores(String nomeEmpresa, String cnpj, String endereco, int telefone, String senha) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.senha = senha;
    }

    public void atualizarSenha() {
        System.out.print("CNPJ: ");
        String cnpjEntrada = teclado.nextLine();
        System.out.print("Senha atual: ");
        String senhaAtual = teclado.nextLine();

        if (this.cnpj.equals(cnpjEntrada) && this.senha.equals(senhaAtual)) {
            System.out.print("Nova senha: ");
            String novaSenha = teclado.nextLine();
            this.senha = novaSenha;
            System.out.println("Senha atualizada com sucesso.");
            writeLog("Senha do fornecedor " + nomeEmpresa + " atualizada.");
        } else {
            System.out.println("Credenciais incorretas. Não foi possível atualizar a senha.");
        }
    }

    public void atualizarPerfil() {
        System.out.print("CNPJ: ");
        String cnpjEntrada = teclado.nextLine();
        System.out.print("Senha: ");
        String senhaEntrada = teclado.nextLine();

        if (this.cnpj.equals(cnpjEntrada) && this.senha.equals(senhaEntrada)) {
            System.out.print("Novo nome da empresa: ");
            this.nomeEmpresa = teclado.nextLine();
            System.out.print("Novo endereço: ");
            this.endereco = teclado.nextLine();
            System.out.print("Novo telefone: ");
            this.telefone = teclado.nextInt();
            System.out.println("Perfil atualizado com sucesso.");
            writeLog("Perfil do fornecedor " + nomeEmpresa + " atualizado.");
        } else {
            System.out.println("Credenciais incorretas. Não foi possível atualizar o perfil.");
        }
    }

    public void visualizarEstoque(Produtos produto) {
        System.out.print("CNPJ: ");
        String cnpjEntrada = teclado.nextLine();
        System.out.print("Senha: ");
        String senhaEntrada = teclado.nextLine();

        if (this.cnpj.equals(cnpjEntrada) && this.senha.equals(senhaEntrada)) {
            produto.informarDados();
        } else {
            System.out.println("Credenciais incorretas. Não foi possível visualizar o estoque.");
        }
    }

    public void inputFornecedor() {
        System.out.print("Nome da Empresa: ");
        this.nomeEmpresa = teclado.nextLine();
        System.out.print("CNPJ: ");
        this.cnpj = teclado.nextLine();
        System.out.print("Endereço: ");
        this.endereco = teclado.nextLine();
        System.out.print("Telefone: ");
        this.telefone = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Senha: ");
        this.senha = teclado.nextLine();
        writeLog("Fornecedor registrado: " + nomeEmpresa);
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getSenha() {
        return senha;
    }
}
