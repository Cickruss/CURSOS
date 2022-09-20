import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double saldo =  1000.0;
        double limite = 500.0;
        String status = "Especial";
        boolean finaly = false;
        
        while (finaly == false) {
            
        
        System.out.println("===== BEM VINDO AO BANCO =====");
        System.out.println("1 - SAQUE");
        System.out.println("2 - DEPOSITO");
        System.out.println("3 - CONSULTAR SALDO");
        System.out.println("4 - STATUS DE CHEQUE");
        System.out.println("ESCOLHA UMA OPÇÃO: ");
    
        int esc = scan.nextInt();

        switch (esc) {
            case 1:
                saque(saldo);
                System.out.println("Deseja continuar S/N? ");
                String escfinal1 = scan.next();

                if (escfinal1 == "N" || escfinal1 == "n") {
                    finaly = true;
                }
                break;
            case 2:
                deposito(saldo);
                System.out.println("Deseja continuar S/N? ");
                String escfinal2 = scan.next();

                if (escfinal2 == "N" || escfinal2 == "n") {
                    finaly = true;
                }
                break;
            case 3:
                consultar(saldo);
                System.out.println("Deseja continuar S/N? ");
                String escfinal3 = scan.next();

                if (escfinal3 == "N" || escfinal3 == "n") {
                    finaly = true;
                }
                break;
            case 4:
                cheque(status);
                System.out.println("Deseja continuar S/N? ");
                String escfinal4 = scan.next();

                if (escfinal4 == "N" || escfinal4 == "n") {
                    finaly = true;
                }
                break;
        
            default:
            System.out.println("OPÇÃO INVÁLIDA");
                break;
        }
    }}
    public static void saque(double saldo) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor para saque: ");
        double saque = scan.nextDouble();
        
        if (saque <= saldo) {
            
            saldo = saldo - saque;
            
            System.out.println("Você sacou: " + saque);
            System.out.println("Seu saldo atual: " + saldo);
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
    public static void deposito(double saldo){
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor para deposito: ");
        double deposito = scan.nextDouble();
        
        saldo = saldo + deposito;
        
        System.out.println("Você depositou: " + deposito);
        System.out.println("Saldo atual: " + saldo);
    }
    public static void consultar(double saldo){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Saldo atual: " + saldo);
    }
    public static void cheque(String status){
        System.out.println("Status: " + status);
    }

}
