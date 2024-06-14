package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Produtos extends BaseLog{
    private String nome;
    private int codigo;
    private double preco;
    private double valorCompra;
    private int quantidade;
    private String validade;
    private String fabricante;
    private int codigoFabricante;
    private int idFuncionario;
    private List<Produto> produtos = new ArrayList<>();
    private Funcionario funcionario;
        Scanner teclado = new Scanner(System.in);

    public Produtos(Funcionario funcionario){
            this.funcionario = funcionario;
    }

    public void registrarProdutos() {
            System.out.print("ID do Funcionário: ");
            this.idFuncionario = teclado.nextInt();
            teclado.nextLine();
            System.out.print("Senha do Funcionário: ");
            String senhaFuncionario = teclado.nextLine();

    if (funcionario.verificarSenhaFuncionario(this.idFuncionario, senhaFuncionario)) {
            System.out.print("Nome do Produto: ");
            this.nome = teclado.nextLine();
            System.out.print("Código: ");
            this.codigo = teclado.nextInt();
            System.out.print("Preço: ");
            this.preco = teclado.nextDouble();
            System.out.print("Valor de Compra: ");
            this.valorCompra = teclado.nextDouble();
            System.out.print("Quantidade em Estoque: ");
            this.quantidade = teclado.nextInt();
            teclado.nextLine();
            System.out.print("Validade: ");
            this.validade = teclado.nextLine();
            System.out.print("Fabricante: ");
            this.fabricante = teclado.nextLine();
            System.out.print("Código do Fabricante: ");
            this.codigoFabricante = teclado.nextInt();

            produtos.add(new Produto(nome, quantidade, preco));
            writeLog("Produto registrado: " + nome);
            writeLog("Produto registrado: " + nome + ", Código: " + codigo);
    } else {
            System.out.println("Senha do funcionário incorreta. Registro de produto não permitido.");
     }
  }
    public void exigirSenha(){
            System.out.print("Digite a senha do funcionário: ");
            String senhaEntrada = teclado.nextLine();

    if (verificarSenha(senhaEntrada)) {
            System.out.println("Senha correta. Você pode continuar.");
    } else {
            System.out.println("Senha incorreta. Operação não permitida.");
    }
}
    public boolean verificarSenha(String senhaEntrada) {
    return true;
  }

    public int getTotalVendas() {
            int totalVendas = 0;
        for (Produto produto : produtos) {
            totalVendas += produto.getQuantidadeVendida();
        }
        return totalVendas;
    }

    public double getTotalValorVendas() {
            double totalValor = 0;
        for (Produto produto : produtos) {
            totalValor += produto.getQuantidadeVendida() * produto.getPreco();
        }
        return totalValor;
    }
    
    public List<Produto> getProdutos() {
        return produtos;
    }

    public void informarDados() {
            System.out.println("Nome do Produto: " + nome);
            System.out.println("Código: " + codigo);
            System.out.println("Preço: " + preco);
            System.out.println("Valor de Compra: " + valorCompra);
            System.out.println("Quantidade em Estoque: " + quantidade);
            System.out.println("Validade: " + validade);
            System.out.println("Fabricante: " + fabricante);
            System.out.println("Código do Fabricante: " + codigoFabricante);
            System.out.println("ID do Funcionário: " + idFuncionario);

  }
    
    public void lerCodigoBarras() {
            System.out.print("Digite o código de barras do produto: ");
            int codigoBarras = teclado.nextInt();

    if (codigoBarras == this.codigo) {
            System.out.println("Produto: " + this.nome + " encontrado.");
    } else {
            System.out.println("Produto não encontrado.");
    }
}
    public void atualizarValores() {
            exigirSenha(); // Exigir senha antes de permitir a atualização
            System.out.print("Digite o novo preço: ");
            this.preco = teclado.nextDouble();
            System.out.print("Digite a nova quantidade: ");
            this.quantidade = teclado.nextInt();

    writeLog("Valores do produto atualizados: " + nome + ", Novo preço: " + preco + ", Nova quantidade: " + quantidade);
    teclado.close();
}
    public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
}

    public String getNome() {
            return nome;
}
 }
 class Produto extends BaseLog {
        private String nome;
        private int quantidadeEstoque;
        private int quantidadeVendida;
        private double preco;


        public Produto(String nome, int quantidadeEstoque, double preco) {
            this.nome = nome;
            this.quantidadeEstoque = quantidadeEstoque;
            this.preco = preco;
            this.quantidadeVendida = 0;
        }

        public void vender(int quantidade) {
            if (quantidade <= quantidadeEstoque) {
                quantidadeEstoque -= quantidade;
                quantidadeVendida += quantidade;
                writeLog("Produto vendido: " + nome + ", Quantidade: " + quantidade);
            } else {
                System.out.println("Estoque insuficiente.");
            }
        }

        public int getQuantidadeVendida() {
            return quantidadeVendida;
        }

        public double getPreco() {
            return preco;
        }
        public String getNome() {
                return nome;
            }
    }

