package Classes;

import java.util.Scanner;

class RelatorioCompras extends BaseLog {
    private double valorNegociado;
    private String dataTransacao;
    private int quantidadeComprada;
    private int tempoEntrega;

    public void imprimirRelatorio() {
        System.out.println("=== Relatório de Compras ===");
        System.out.println("Valor Negociado: " + valorNegociado);
        System.out.println("Data da Transação: " + dataTransacao);
        System.out.println("Quantidade Comprada: " + quantidadeComprada);
        System.out.println("Tempo de Entrega: " + tempoEntrega + " dias");
        writeLog("Relatório de compras impresso: " + dataTransacao);
    }

    public void calcularTotal() {
        double total = valorNegociado * quantidadeComprada;
        System.out.println("Total da Compra: " + total);
        writeLog("Total da compra calculado: " + total);
    }

    public void inputRelatorioCompras() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Valor Negociado: ");
        this.valorNegociado = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Data da Transação: ");
        this.dataTransacao = teclado.nextLine();
        System.out.print("Quantidade Comprada: ");
        this.quantidadeComprada = teclado.nextInt();
        System.out.print("Tempo de Entrega: ");
        this.tempoEntrega = teclado.nextInt();
        writeLog("Relatório de compras registrado: " + dataTransacao);
        teclado.close();
    }
}