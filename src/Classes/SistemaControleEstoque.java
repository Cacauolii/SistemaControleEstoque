package Classes;

import java.util.Scanner;

public class SistemaControleEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        Produtos produto = new Produtos(funcionario);
        Usuario usuario = new Usuario();
        Fornecedores fornecedor = new Fornecedores();
        DadosBancarios dadosBancarios = new DadosBancarios();
        RelatorioCompras relatorioCompras = new RelatorioCompras();
        RelatorioVendas relatorioVendas = new RelatorioVendas(funcionario);
        NotaFiscal notaFiscal = new NotaFiscal(funcionario);

        while (true) {
            System.out.println("Selecione a opção:");
            System.out.println("1. Registrar Produto");
            System.out.println("2. Registrar Funcionário");
            System.out.println("3. Carregar Usuários de Exemplo");
            System.out.println("4. Registrar Fornecedor");
            System.out.println("5. Registrar Dados Bancários");
            System.out.println("6. Registrar Relatório de Compras");
            System.out.println("7. Registrar Relatório de Vendas");
            System.out.println("8. Registrar Nota Fiscal");
            System.out.println("9. Imprimir Relatório Compras");
            System.out.println("10. Imprimir Relatório Vendas");
            System.out.println("11. Imprimir Nota Fiscal");
            System.out.println("12. Atualizar Estoque");
            System.out.println("13. Atualizar Endereço do Funcionário");
            System.out.println("14. Atualizar Telefone do Funcionário");
            System.out.println("15. Atualizar Foto do Funcionário");
            System.out.println("16. Login do Usuário");
            System.out.println("17. Atualizar Senha do Usuário");
            System.out.println("18. Atualizar Foto do Usuário");
            System.out.println("19. Atualizar Nome do Usuário");
            System.out.println("20. Visualizar Estoque");
            System.out.println("21. Atualizar Senha do Fornecedor");
            System.out.println("22. Atualizar Perfil do Fornecedor");
            System.out.println("23. Visualizar Estoque do Fornecedor");
            System.out.println("24. Verificar Dados Bancários");
            System.out.println("25. Guardar Dados Bancários");
            System.out.println("26. Efetuar Assinatura Bancária");
            System.out.println("27. Sair");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    produto.registrarProdutos();
                    break;
                case 2:
                    funcionario.inputFuncionario();
                    break;
                case 3:
                    System.out.println("Usuários de exemplo carregados.");
                    break;
                case 4:
                    fornecedor.inputFornecedor();
                    break;
                case 5:
                    dadosBancarios.inputDadosBancarios();
                    break;
                case 6:
                    relatorioCompras.inputRelatorioCompras();
                    break;
                case 7:
                    relatorioVendas.inputRelatorioVendas();
                    break;
                case 8:
                    notaFiscal.inputNotaFiscal();
                    break;
                case 9:
                    relatorioCompras.imprimirRelatorio();
                    break;
                case 10:
                    relatorioVendas.imprimirRelatorio();
                    break;
                case 33:
                    notaFiscal.imprimirNotaFiscal();
                    break;    
                case 11:
                    funcionario.atualizarEstoque(produto);
                    break;
                case 12:
                    funcionario.atualizarEndereco();
                    break;
                case 13:
                    funcionario.atualizarTelefone();
                    break;
                case 14:
                    funcionario.atualizarFoto();
                    break;
                case 15:
                    usuario.logar();
                    break;
                case 16:
                    usuario.atualizarSenha();
                    break;
                case 17:
                    usuario.atualizarFoto();
                    break;
                case 18:
                    usuario.atualizarNome();
                    break;
                case 19:
                    usuario.visualizarEstoque(produto);
                    break;
                case 20:
                    fornecedor.atualizarSenha();
                    break;
                case 21:
                    fornecedor.atualizarPerfil();
                    break;
                case 22:
                    fornecedor.visualizarEstoque(produto);
                    break;
                case 23:
                    dadosBancarios.verificarDados();
                    break;
                case 24:
                    dadosBancarios.guardarDados();
                    break;
                case 25:
                    dadosBancarios.efetuarAssinatura();
                    break;
                case 26:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}