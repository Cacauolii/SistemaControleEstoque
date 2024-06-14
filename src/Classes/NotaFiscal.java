package Classes;

import java.util.Scanner;

class NotaFiscal extends Produtos {
    private double numeroNotaFiscal;
    private int dataEmissao;
    private double valorTotal;
    private String itensNota;

    public NotaFiscal(Funcionario funcionario) {
        super(funcionario);
    }

    public void imprimirNotaFiscal() {
        System.out.println("=== Nota Fiscal ===");
        System.out.println("Número da Nota Fiscal: " + numeroNotaFiscal);
        System.out.println("Data de Emissão: " + dataEmissao);
        System.out.println("Valor Total: " + valorTotal);
        System.out.println("Itens da Nota: " + itensNota);
        writeLog("Nota fiscal impressa: " + numeroNotaFiscal);
    }

    public double calcularTotal() {
        valorTotal = getTotalValorVendas();
        return valorTotal;
    }
    public void gerarItensNota() {
        StringBuilder itens = new StringBuilder();
        for (Produto produto : getProdutos()) {
            itens.append(produto.getNome()).append(", ");
        }
        itensNota = itens.toString();
    }
    public void inputNotaFiscal() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número da Nota Fiscal: ");
        this.numeroNotaFiscal = teclado.nextDouble();
        System.out.print("Data de Emissão (DDMMAAAA): ");
        this.dataEmissao = teclado.nextInt();
        System.out.print("Valor Total: ");
        this.valorTotal = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Itens da Nota: ");
        this.itensNota = teclado.nextLine();
        writeLog("Nota fiscal registrada: " + numeroNotaFiscal);
    }
}