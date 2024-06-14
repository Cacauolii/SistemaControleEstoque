package Classes;

import java.util.Scanner;

class RelatorioVendas extends Produtos {
    private int vendasRealizadas;
    private double valorRecebido;
    private String identificarProduto;
    private int maioresVendas;
    private int menoresVendas;

    public RelatorioVendas(Funcionario funcionario) {
        super(funcionario);
    }

    public void imprimirRelatorio() {
        System.out.println("=== Relatório de Vendas ===");
        System.out.println("Vendas Realizadas: " + vendasRealizadas);
        System.out.println("Valor Recebido: " + valorRecebido);
        System.out.println("Identificar Produto: " + identificarProduto);
        System.out.println("Maiores Vendas: " + maioresVendas);
        System.out.println("Menores Vendas: " + menoresVendas);
        writeLog("Relatório de vendas impresso: " + identificarProduto);
    }

    public void calcularTotais() {
        double mediaVendas = getTotalValorVendas() / getTotalVendas();
        System.out.println("Média de Vendas por Produto: " + mediaVendas);
        writeLog("Totais das vendas calculados.");
    }
    
    private String getProdutoMaioresVendas() {
        int maxVendas = -1;
        String produtoMax = "";
        for (Produto produto : getProdutos()) {
            if (produto.getQuantidadeVendida() > maxVendas) {
                maxVendas = produto.getQuantidadeVendida();
                produtoMax = produto.getNome();
            }
        }
        return produtoMax;
    }

    private String getProdutoMenoresVendas() {
        int minVendas = Integer.MAX_VALUE;
        String produtoMin = "";
        for (Produto produto : getProdutos()) {
            if (produto.getQuantidadeVendida() < minVendas) {
                minVendas = produto.getQuantidadeVendida();
                produtoMin = produto.getNome();
            }
        }
        return produtoMin;
    }

    public void inputRelatorioVendas() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Vendas Realizadas: ");
        this.vendasRealizadas = teclado.nextInt();
        System.out.print("Valor Recebido: ");
        this.valorRecebido = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Identificar Produto: ");
        this.identificarProduto = teclado.nextLine();
        System.out.print("Maiores Vendas: ");
        this.maioresVendas = teclado.nextInt();
        System.out.print("Menores Vendas: ");
        this.menoresVendas = teclado.nextInt();
        writeLog("Relatório de vendas registrado: " + identificarProduto);
    }
}