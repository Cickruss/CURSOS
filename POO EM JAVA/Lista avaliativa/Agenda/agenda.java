import java.util.Scanner;

public class agenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int finaly = 0;
        contatos c1 = new contatos();
        
        
        c1.setNome("Ícaro Macedo");
        c1.setSexo("masculino");
        c1.setTelefone("(91) 98400-28922");
        c1.setEmail("chaolinmatadordeporco@gmail.com");
        
        contatos c2 = new contatos();

        c2.setNome("Gustavo Amaral");
        c2.setSexo("masculino");
        c2.setTelefone("(91) 99602-0113");
        c2.setEmail("gustavorendeiroamaral@gmail.com");
        
        contatos c3 = new contatos();

        c3.setNome("Marta Silva");
        c3.setSexo("feminino");
        c3.setTelefone("(82) 99875-2367");
        c3.setEmail("martinhamelhordomundo@gmail.com");

        System.out.println("#####AGENDA DE CONTATOS#####");
        System.out.println("     ESCOLHA UMA OPÇÃO: ");
        System.out.println("     1 - CADASTRO");
        System.out.println("     2 - EDIÇÃO");
        System.out.println("     3 - EXCLUSÃO");
        System.out.println("     4 - CONSULTAR CONTATOS");
        System.out.println("     5 - SAIR");

        // COMEÇO INTERFACE // 
        switch (scanner.nextInt()) {
            case 1:
                // COMEÇO CADASTRO NOVO CONTATO // 
                System.out.println("##### CADASTRO DE CONTATO #####");
                contatos cadastro = new contatos();       
                contatos.CadastroNovoContato();
                break;
                // FINAL CADASTRO NOVO CONTATO //
            case 2:
                // COMEÇO EDIÇÃO DE CONTATO //
                System.out.println(" ESCOLHA QUAL CONTATO EDITAR: ");
                System.out.println("    1 - " + c1.getNome());
                System.out.println("    2 - " + c2.getNome());
                System.out.println("    3 - " + c3.getNome());

                // COMEÇO ESCOLHA DA INFORMAÇÃO //
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("DIGITE A INFORMAÇÃO QUE DESEJA ALTERAR: ");
                        System.out.println("    1 - NOME: " + c1.getNome());
                        System.out.println("    2 - SEXO: " + c1.getSexo());
                        System.out.println("    3 - TELEFONE: " + c1.getTelefone());
                        System.out.println("    4 - E-MAIL: " + c1.getEmail());
                // FINAL ESCOLHA DA INFORMAÇÃO //

                        // COMEÇO ALTERAÇÃO INFORMAÇÃO //
                        switch (scanner.nextInt()) {
                            case 1:
                                System.out.println("DIGITE SUA ALTERAÇÃO: ");
                                c1.setNome(scanner.next());
                                System.out.println("ALTERAÇÃO SUCEDIDA!");
                                break;
                            case 2:
                                System.out.println("DIGITE SUA ALTERAÇÃO: ");
                                c1.setSexo(scanner.next());
                                System.out.println("ALTERAÇÃO SUCEDIDA!");
                                break;
                            case 3:
                                System.out.println("DIGITE SUA ALTERAÇÃO: ");
                                c1.setTelefone(scanner.next());
                                System.out.println("ALTERAÇÃO SUCEDIDA!");
                                break;
                            case 4:
                                System.out.println("DIGITE SUA ALTERAÇÃO: ");
                                c1.setEmail(scanner.next());
                                System.out.println("ALTERAÇÃO SUCEDIDA!");
                                break;
                        
                            default:
                                System.out.println("OPERAÇÀO INVÁLIDA");
                                break;
                        // FINAL ALTERAÇÁO INFORMAÇÃO //
                        }
                        break;
                    case 2:
                        // COMEÇO ESCOLHA INFORMAÇÃO //
                        System.out.println("DIGITE A INFORMAÇÃO QUE DESEJA ALTERAR: ");
                        System.out.println("    1 - NOME: " + c2.getNome());
                        System.out.println("    2 - SEXO: " + c2.getSexo());
                        System.out.println("    3 - TELEFONE: " + c2.getTelefone());
                        System.out.println("    4 - E-MAIL: " + c2.getEmail());
                        // FINAL ESCOLHA DA INFORMAÇÃO //

                        // COMEÇO ALTERAÇÃO INFORMAÇÃO //
                        switch (scanner.nextInt()) {
                            case 1:
                                System.out.println("DIGITE SUA ALTERAÇÃO: ");
                                c2.setNome(scanner.next());
                                System.out.println("ALTERAÇÃO SUCEDIDA!");
                                break;
                            case 2:
                                System.out.println("DIGITE SUA ALTERAÇÃO: ");
                                c2.setSexo(scanner.next());
                                System.out.println("ALTERAÇÃO SUCEDIDA!");
                                break;
                            case 3:
                                System.out.println("DIGITE SUA ALTERAÇÃO: ");
                                c2.setTelefone(scanner.next());
                                System.out.println("ALTERAÇÃO SUCEDIDA!");
                                break;
                            case 4:
                                System.out.println("DIGITE SUA ALTERAÇÃO: ");
                                c2.setEmail(scanner.next());
                                System.out.println("ALTERAÇÃO SUCEDIDA!");
                                break;
                        
                            default:
                                System.out.println("OPERAÇÀO INVÁLIDA");
                                break;
                            // FINAL ALTERAÇÁO INFORMAÇÃO //
                        }
                        break;
                    case 3:
                        // COMEÇO ESCOLHA INFORMAÇÃO //
                        System.out.println("DIGITE A INFORMAÇÃO QUE DESEJA ALTERAR: ");
                        System.out.println("    1 - NOME: " + c3.getNome());
                        System.out.println("    2 - SEXO: " + c3.getSexo());
                        System.out.println("    3 - TELEFONE: " + c3.getTelefone());
                        System.out.println("    4 - E-MAIL: " + c3.getEmail());
                        // FINAL ESCOLHA DA INFORMAÇÃO //

                        // COMEÇO ALTERAÇÃO INFORMAÇÃO //
                        switch (scanner.nextInt()) {
                            case 1:
                                System.out.println("DIGITE SUA ALTERAÇÃO: ");
                                c3.setNome(scanner.next());
                                System.out.println("ALTERAÇÃO SUCEDIDA!");
                                break;
                            case 2:
                                System.out.println("DIGITE SUA ALTERAÇÃO: ");
                                c3.setSexo(scanner.next());
                                System.out.println("ALTERAÇÃO SUCEDIDA!");
                                break;
                            case 3:
                                System.out.println("DIGITE SUA ALTERAÇÃO: ");
                                c3.setTelefone(scanner.next());
                                System.out.println("ALTERAÇÃO SUCEDIDA!");
                                break;
                            case 4:
                                System.out.println("DIGITE SUA ALTERAÇÃO: ");
                                c3.setEmail(scanner.next());
                                System.out.println("ALTERAÇÃO SUCEDIDA!");
                                break;
                        
                            default:
                                System.out.println("OPERAÇÀO INVÁLIDA");
                                break;
                            // FINAL ALTERAÇÁO INFORMAÇÃO //
                            
                        }
                            break;
                        
                        default:
                            System.out.println("OPERAÇÃO INVÁLIDA");
                            break;
                    // FINAL ALTERAÇÃO INFORMAÇÃO //
                
                }
            case 3:
                // COMEÇO DE EXCLUSÃO DE CONTATO //
                System.out.println("##### EXCLUSÃO DE CONTATO #####");
                System.out.println("ESCOLHA QUAL CONTATO VC DESEJA EXLUIR: ");
                System.out.println("1 - " + c1.getNome());
                System.out.println("2 - " + c2.getNome());
                System.out.println("3 - " + c3.getNome());
                switch (scanner.nextInt()) {
                    // COMEÇO ESCOLHA DO CONTATO //
                    case 1:
                        c1.setNome("");
                        c1.setSexo("");
                        c1.setTelefone("");
                        c1.setEmail("");
                        System.out.println("CONTATO EXCLUÍDO");
                        break;
                    case 2:
                        c2.setNome("");
                        c2.setSexo("");
                        c2.setTelefone("");
                        c2.setEmail("");
                        System.out.println("CONTATO EXCLUÍDO");
                        break;
                    case 3:
                        c3.setNome("");
                        c3.setSexo("");
                        c3.setTelefone("");
                        c3.setEmail("");
                        System.out.println("CONTATO EXCLUÍDO");
                
                    default:
                        System.out.println("OPERAÇÃO INVÁLIDA");
                        break;
                }
                // FINAL DE EXCLUSÃO DE CONTATO //
            case 4:
                // COMEÇO DA LISTA DE CONTATOS //
                System.out.println("      LISTA DE CONTATOS");
                System.out.println("ESCOLHA QUAL CONTATO VC DESEJA VER: ");
                System.out.println("1 - " + c1.getNome());
                System.out.println("2 - " + c2.getNome());
                System.out.println("3 - " + c3.getNome());

                switch (scanner.nextInt()) {
                    // COMEÇO ESCOLHA DO CONTATO //
                    case 1:
                        System.out.println("Nome: " + c1.getNome());
                        System.out.println("Sexo: " + c1.getSexo());
                        System.out.println("Telefone: " + c1.getTelefone());
                        System.out.println("E-mail: " + c1.getEmail());
                        break;
                    case 2:
                        System.out.println("Nome: " + c2.getNome());
                        System.out.println("Sexo: " + c2.getSexo());
                        System.out.println("Telefone: " + c2.getTelefone());
                        System.out.println("E-mail: " + c2.getEmail());
                        break;
                    case 3:
                        System.out.println("Nome: " + c3.getNome());
                        System.out.println("Sexo: " + c3.getSexo());
                        System.out.println("Telefone: " + c3.getTelefone());
                        System.out.println("E-mail: " + c3.getEmail());
                        break;
                
                    default:
                        System.out.println("OPERAÇÃO INVÁLIDA");
                        break;
                    // FINAL ESCOLHA DO CONTATO //
                }
            case 5:
                finaly = 1;
                System.out.println("PROGRAMA FINALIZADO!");
                break;
                // FINAL LISTA DE CONTATO //
        // FINAL INTERFACE //
        }}}