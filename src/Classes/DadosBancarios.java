package Classes;

import java.util.Scanner;


class DadosBancarios extends BaseLog {
    private int numeroCartaoCredito;
    private int numeroCartaoDebito;
    private int validadeCartao;
    private int codigoSeguranca;
    private String nomeTitular;
    Scanner teclado = new Scanner(System.in);

    public DadosBancarios() {
        DadosBancarios dadosBancarios1 = new DadosBancarios(182654794, 123746583, 06/24, 554, "João"  );
        DadosBancarios dadosBancarios2 = new DadosBancarios(183645578, 18297495, 07/28, 678, "Ursula"  );
    }

    public DadosBancarios(int numeroCartaoCredito, int numeroCartaoDebito, int validadeCartao, int codigoSeguranca, String nomeTitular) {
        this.numeroCartaoCredito = numeroCartaoCredito;
        this.numeroCartaoDebito = numeroCartaoDebito;
        this.validadeCartao = validadeCartao;
        this.codigoSeguranca = codigoSeguranca;
        this.nomeTitular = nomeTitular;
    }

    public void verificarDados() {
        if (numeroCartaoCredito > 0 && numeroCartaoDebito > 0 && validadeCartao > 0 && codigoSeguranca > 0 && nomeTitular != null) {
            System.out.println("Dados bancários verificados com sucesso.");
            writeLog("Dados bancários verificados para: " + nomeTitular);
        } else {
            System.out.println("Dados bancários incompletos ou inválidos.");
        }
    }

    public void guardarDados() {
        // Suponha que aqui seja para guardar os dados em um banco de dados ou arquivo
        System.out.println("Dados bancários guardados com sucesso.");
        writeLog("Dados bancários guardados para: " + nomeTitular);
    }

    public void efetuarAssinatura() {
        System.out.print("Nome do titular: ");
        String nome = teclado.nextLine();
        System.out.print("Número do Cartão de Crédito: ");
        int numCredito = teclado.nextInt();
        System.out.print("Código de Segurança: ");
        int codSeguranca = teclado.nextInt();
        System.out.print("Data de validade: ");
        int validadeCar = teclado.nextInt();

        if (numCredito == this.numeroCartaoCredito && codSeguranca == this.codigoSeguranca && validadeCar == this.validadeCartao && this.nomeTitular.equals(nome)) {
            System.out.println("Assinatura efetuada com sucesso.");
            writeLog("Assinatura bancária efetuada para: " + nomeTitular);
        } else {
            System.out.println("Dados do cartão inválidos. Assinatura não efetuada.");
        }
    }

    public void inputDadosBancarios() {
        System.out.print("Número do Cartão de Crédito: ");
        this.numeroCartaoCredito = teclado.nextInt();
        System.out.print("Número do Cartão de Débito: ");
        this.numeroCartaoDebito = teclado.nextInt();
        System.out.print("Validade do Cartão (MMYY): ");
        this.validadeCartao = teclado.nextInt();
        System.out.print("Código de Segurança: ");
        this.codigoSeguranca = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Nome do Titular: ");
        this.nomeTitular = teclado.nextLine();
        writeLog("Dados bancários registrados para: " + nomeTitular);
    }

    public int getNumeroCartaoCredito() {
        return numeroCartaoCredito;
    }

    public int getNumeroCartaoDebito() {
        return numeroCartaoDebito;
    }

    public int getValidadeCartao() {
        return validadeCartao;
    }

    public int getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }
}