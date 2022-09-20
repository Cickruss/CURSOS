
import java.util.Scanner;

public class livraria {
    public static void main(String[] args){
        
        //  INTERFACE //
        System.out.println("********** LIVRARIA DE CRIA **********");
        System.out.println("          ESCOLHA UMA OPÇÃO:");
        System.out.println("      1 - LIVROS EM ESTOQUE");
        System.out.println("      2 - BANCO DE CLIENTES");
        System.out.println("**************************************");
        
        Scanner scanner = new Scanner(System.in);
        int escolha;
        escolha = scanner.nextInt();
        
        
        switch (escolha) {
            case 1:
                        // LIVROS //

                back l1 = new back();
            
                l1.setTitle("Harry Potter");
                l1.setYer_released(1997);
                l1.setPage_number(999);
                l1.setPrice(35.99);
                
                back l2 = new back();
            
                l2.setTitle("Senhor dos Aneis");
                l2.setYer_released(1985);
                l2.setPage_number(1225);
                l2.setPrice(60.00);
        
                back l3 = new back();
            
                l3.setTitle("Diário de um Banana");
                l3.setYer_released(2001);
                l3.setPage_number(250);
                l3.setPrice(24.99);
        
                back l4 = new back();
            
                l4.setTitle("5 Linguagens do Amor");
                l4.setYer_released(1992);
                l4.setPage_number(	216);
                l4.setPrice(29.90);
        
                back l5 = new back();
            
                l5.setTitle("As Crônicas De Nárnia");
                l5.setYer_released(2009);
                l5.setPage_number(	752);
                l5.setPrice(49.90);
        
                System.out.println("Titulo: " + l1.getTitle());
                System.out.println("Ano de Publicação: " + l1.getYer_released());
                System.out.println("Numero de paginas: " + l1.getPage_number());
                System.out.println("Valor: " + l1.getPrice());
                
                System.out.println("**************************************");
                
                System.out.println("Titulo: " + l2.getTitle());
                System.out.println("Ano de Publicação: " + l2.getYer_released());
                System.out.println("Numero de paginas: " + l2.getPage_number());
                System.out.println("Valor: " + l3.getPrice());
                
                System.out.println("**************************************");
                
                System.out.println("Titulo: " + l3.getTitle());
                System.out.println("Ano de Publicação: " + l3.getYer_released());
                System.out.println("Numero de paginas: " + l3.getPage_number());
                System.out.println("Valor: " + l3.getPrice());
                
                System.out.println("**************************************");
                
                System.out.println("Titulo: " + l4.getTitle());
                System.out.println("Ano de Publicação: " + l4.getYer_released());
                System.out.println("Numero de paginas: " + l4.getPage_number());
                System.out.println("Valor: " + l4.getPrice());
                
                System.out.println("**************************************");
                
                System.out.println("Titulo: " + l5.getTitle());
                System.out.println("Ano de Publicação: " + l5.getYer_released());
                System.out.println("Numero de paginas: " + l5.getPage_number());
                System.out.println("Valor: " + l5.getPrice());
                
                System.out.println("");
            case 2:
                        // BANCO DE CLIENTES //

                clientes c1 = new clientes();
                
                c1.setNome("Ícaro Macedo");
                c1.setEmail("icaro_matadordeporco@gmail.com");
                c1.setIdade(18);
                c1.setAlugueis(2);

                clientes c2 = new clientes();

                c2.setNome("Guilherme Tadayuki");
                c2.setEmail("gui_noia@gmail.com");
                c2.setIdade(19);
                c2.setAlugueis(1);

                clientes c3 = new clientes();

                c3.setNome("Gustavo Rendeiro");
                c3.setEmail("buga_tampico@gmail.com");
                c3.setIdade(20);
                c3.setAlugueis(3);

                System.out.println("Nome: " + c1.getNome());
                System.out.println("E-mail: " + c1.getEmail());
                System.out.println("Idade: " + c1.getIdade());
                System.out.println("Alugueis pendentes: " + c1.getAlugueis());

                System.out.println("**************************************");
                
                System.out.println("Nome: " + c2.getNome());
                System.out.println("E-mail: " + c2.getEmail());
                System.out.println("Idade: " + c2.getIdade());
                System.out.println("Alugueis pendentes: " + c2.getAlugueis());
                
                System.out.println("**************************************");
                
                System.out.println("Nome: " + c3.getNome());
                System.out.println("E-mail: " + c3.getEmail());
                System.out.println("Idade: " + c3.getIdade());
                System.out.println("Alugueis pendentes: " + c3.getAlugueis());

                System.out.println("");
                
                System.out.println("1 - EDITAR");
                System.out.println("2 - FINALIZAR");
                
                int escolha_aba_clientes = scanner.nextInt();

                switch (escolha_aba_clientes) {
                    case 1:
                        System.out.println("");
                        System.out.println("ESCOLHA QUAL CLIENTE VC DESEJA ALTERAR: ");
                        System.out.println("1 - " + c1.getNome());
                        System.out.println("2 - " + c2.getNome());
                        System.out.println("3 - " + c3.getNome());

                        escolha_aba_clientes = scanner.nextInt();

                        switch (escolha_aba_clientes) {
                            case 1:
                                System.out.println("ESCOLHA QUAL INFORMAÇÃO VC DESEJA ALTERAR: ");
                                System.out.println("1 - Nome: " + c1.getNome());
                                System.out.println("2 - E-mail: " + c1.getEmail());
                                System.out.println("3 - Idade: " + c1.getIdade());
                                System.out.println("4 - Alugueis pendentes: " + c1.getAlugueis());

                                int escolha_info_clientes = scanner.nextInt();

                                switch (escolha_info_clientes) {
                                    case 1:
                                        c1.setNome(scanner.nextLine());
                                        System.out.println("INFORMAÇÃO ALTERADA COM SUCESSO!");
                                        break;
                                    case 2:
                                        c1.setEmail(scanner.nextLine());
                                        System.out.println("INFORMAÇÃO ALTERADA COM SUCESSO!");
                                        break;
                                    case 3:
                                        c1.setIdade(scanner.nextInt());
                                        System.out.println("INFORMAÇÃO ALTERADA COM SUCESSO!");
                                        break;
                                    case 4:
                                        c1.setAlugueis(scanner.nextInt());
                                        System.out.println("INFORMAÇÃO ALTERADA COM SUCESSO!");
                                        break;
                                
                                    default:
                                        System.out.println("**************************");
                                        System.out.println("    OPERAÇÃO INVÁLIDA");
                                        System.out.println("**************************");
                                        break;
                                }

                                break;
                            case 2:
                                System.out.println("ESCOLHA QUAL INFORMAÇÃO VC DESEJA ALTERAR: ");
                                System.out.println("1 - Nome: " + c2.getNome());
                                System.out.println("2 - E-mail: " + c2.getEmail());
                                System.out.println("3 - Idade: " + c2.getIdade());
                                System.out.println("4 - Alugueis pendentes: " + c2.getAlugueis());

                                escolha_info_clientes = scanner.nextInt();

                                switch (escolha_info_clientes) {
                                    case 1:
                                        c2.setNome(scanner.nextLine());
                                        System.out.println("INFORMAÇÃO ALTERADA COM SUCESSO!");
                                        break;
                                    case 2:
                                        c2.setEmail(scanner.nextLine());
                                        System.out.println("INFORMAÇÃO ALTERADA COM SUCESSO!");
                                        break;
                                    case 3:
                                        c2.setIdade(scanner.nextInt());
                                        System.out.println("INFORMAÇÃO ALTERADA COM SUCESSO!");
                                        break;
                                    case 4:
                                        c2.setAlugueis(scanner.nextInt());
                                        System.out.println("INFORMAÇÃO ALTERADA COM SUCESSO!");
                                        break;
                                    default:
                                        System.out.println("**************************");
                                        System.out.println("    OPERAÇÃO INVÁLIDA");
                                        System.out.println("**************************");
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("ESCOLHA QUAL INFORMAÇÃO VC DESEJA ALTERAR: ");
                                System.out.println("1 - Nome: " + c3.getNome());
                                System.out.println("2 - E-mail: " + c3.getEmail());
                                System.out.println("3 - Idade: " + c3.getIdade());
                                System.out.println("4 - Alugueis pendentes: " + c3.getAlugueis());

                                escolha_info_clientes = scanner.nextInt();

                                switch (escolha_info_clientes) {
                                    case 1:
                                        c3.setNome(scanner.nextLine());
                                        System.out.println("INFORMAÇÃO ALTERADA COM SUCESSO!");
                                        break;
                                    case 2:
                                        c3.setEmail(scanner.nextLine());
                                        System.out.println("INFORMAÇÃO ALTERADA COM SUCESSO!");
                                        break;
                                    case 3:
                                        c3.setIdade(scanner.nextInt());
                                        System.out.println("INFORMAÇÃO ALTERADA COM SUCESSO!");
                                        break;
                                    case 4:
                                        c3.setAlugueis(scanner.nextInt());
                                        System.out.println("INFORMAÇÃO ALTERADA COM SUCESSO!");
                                        break;
                                    default:
                                        System.out.println("**************************");
                                        System.out.println("    OPERAÇÃO INVÁLIDA");
                                        System.out.println("**************************");
                                        break;
                                }
                                break;
                            
                        
                            default:
                                System.out.println("**************************");
                                System.out.println("    OPERAÇÃO INVÁLIDA");
                                System.out.println("**************************");
                                break;
                        }
                        break;
                        
                    default:
                        
                    System.out.println("");
                    System.out.println("SESSÃO FINALIZADA");
                        break;
                }
                break;
                
                default:
                System.out.println("**************************");
                System.out.println("    OPERAÇÃO INVÁLIDA");
                System.out.println("**************************");

                break;
            }}}