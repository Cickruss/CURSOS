import java.util.Scanner;

public class contatos {
    private String nome;
    private String sexo;
    private String telefone;
    private String email;

    public String getNome() {
        return nome;
    }
    public String getSexo() {
        return sexo;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }

public static void CadastroNovoContato(){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("NOME: ");
    String nome = scan.nextLine();   
    
    System.out.println("SEXO: ");
    String sexo = scan.nextLine();
    
    System.out.println("TELEFONE: ");
    String telefone = scan.nextLine();
    
    System.out.println("E-MAIL");
    String email = scan.nextLine();
    
    System.out.println("CADASTRO EFETUADO!");
    System.out.println("NOME: " + nome);
    System.out.println("SEXO: " + sexo);
    System.out.println("TELEFONE: " + telefone);
    System.out.println("E-MAIL: " + email);
    
    System.out.println("\n\nDeseja cadastrar um novo Contato? [S/N]:");
    String decisao = scan.next();
    
    if ("s".equals(decisao)) CadastroNovoContato();
    if (!"s".equals(decisao)) System.out.println("Bye! fim do Programa");
}
}
