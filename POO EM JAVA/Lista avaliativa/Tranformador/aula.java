package Tranformador;

import java.util.Scanner;

public class aula {
    public static void main(String[] args) {
        boolean finaly = false;
        while (finaly == false) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("#### BEM VINDO AO CONVERSOR ####");
        System.out.println("1 - °C PARA °F");
        System.out.println("2 - °F PARA °C");
        System.out.println("3 - °C PARA °K");
        System.out.println("4 - °K PARA °C");
        System.out.println("5 - °C PARA Re");
        System.out.println("6 -  Re PARA °C");
        System.out.println("7 - °K PARA R");
        System.out.println("8 -  R PARA °K");
        System.out.println("9 -  SAIR");
        System.out.println("ESCOLHA UMA OPÇÃO: ");
        
        int esc = scanner.nextInt();

        switch (esc) {
            case 1:
                c_f();
                break;
            case 2:
                f_c();
                break;
            case 3:
                c_k();
                break;
            case 4:
                k_c();
                break;
            case 5:
                c_Re();
                break;
            case 6:
                Re_c();
                break;
            case 7:
                k_r();
                break;
            case 8:
                r_k();
                break;
            case 9:
                finaly = true;
                System.out.println("PROGRAMA FINALIZADO");
                break;
        
            default:
                System.out.println("OPÇÃO INVÁLIDA");
                break;
        }     
    }

    }

    public static void c_f() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE O VALOR A SE TRANSFORMADO: ");
        int c = scanner.nextInt();
        int f = (9 * c/5) + 32;

        System.out.println(c + " °C = " + f + " °F");
        System.out.println("");
        System.out.println("DIGITE ALGO PARA CONTINUAR: ");
        String enter = scanner.next();
        
    }

    public static void f_c() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE O VALOR A SE TRANSFORMADO: ");
        int f = scanner.nextInt();
        int c = (f - 32) * + 5/9;

        System.out.println(f + " °F = " + c + " °C");
        System.out.println("");
        System.out.println("DIGITE ALGO PARA CONTINUAR: ");
        String enter = scanner.next();

    }
    public static void c_k() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE O VALOR A SE TRANSFORMADO: ");
        int c = scanner.nextInt();
        double k = c + 273.15;

        System.out.println(c + " °C = " + k + " °K");
        System.out.println("");
        System.out.println("DIGITE ALGO PARA CONTINUAR: ");
        String enter = scanner.next();

    }
    public static void k_c() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE O VALOR A SE TRANSFORMADO: ");
        double k = scanner.nextDouble();
        double c = k - 273.15;

        System.out.println(k + " °K = " + c + " °C");
        System.out.println("");
        System.out.println("DIGITE ALGO PARA CONTINUAR: ");
        String enter = scanner.next();

    }
    public static void c_Re() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE O VALOR A SE TRANSFORMADO: ");
        int c = scanner.nextInt();
        double Re =  c * 4/5;

        System.out.println(c + " °C = " + Re + " Re");
        System.out.println("");
        System.out.println("DIGITE ALGO PARA CONTINUAR: ");
        String enter = scanner.next();

    }
    public static void Re_c() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE O VALOR A SE TRANSFORMADO: ");
        double Re = scanner.nextDouble();
        double c =  Re * 5/4;

        System.out.println(Re + " Re = " + c + " °C");
        System.out.println("");
        System.out.println("DIGITE ALGO PARA CONTINUAR: ");
        String enter = scanner.next();

    }
    public static void k_r() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE O VALOR A SE TRANSFORMADO: ");
        double k = scanner.nextDouble();
        double r =  k * 1.8;

        System.out.println(k + " °K = " + r + " R");

        System.out.println("");
        System.out.println("DIGITE ALGO PARA CONTINUAR: ");
        String enter = scanner.next();

    }
    public static void r_k() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE O VALOR A SE TRANSFORMADO: ");
        double r = scanner.nextDouble();
        double k =  r/1.8;

        System.out.println(r + " R = " + k + " °K");

        System.out.println("");
        System.out.println("DIGITE ALGO PARA CONTINUAR: ");
        String enter = scanner.next();


    }
}
