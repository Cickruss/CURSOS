package Desafiio_isaac;

import java.util.Scanner;

public class desafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String naipes[] = {"copas","paus","espadas","ouros"};
        String respNP = "";
        
        System.out.println("Digite o numero da sua carta: ");
        String escolha = scanner.nextLine();
        int validade = Integer.parseInt(escolha);

        System.out.println("Digite a colocação do seu naipe: ");
        String escolhaNP = scanner.nextLine();
        int escolhaNPP = Integer.parseInt(escolhaNP);
        
        if (validade <= 12 && validade >= 2 && escolhaNPP >= 0 && escolhaNPP <= 3) {

        for(int p = 0; p < naipes.length; p++){
            if(escolhaNPP == p){
                respNP = naipes[p]; 
            }
        }
            
            switch (escolha) {
                case "11":
                escolha = "Valete";
                break;
            case "12":
                escolha = "Dama";
                break;
            case "13":
                escolha = "Rei";
                break;
            default:
                break;
        }

        
        System.out.println("#### SUA CARTA É: " + escolha + " de " + respNP + " ####");
        System.out.println("Numero: " + escolha);
        System.out.println("Naipe: " + respNP);
    }
    else{
        System.out.println("Dados inválidos");
    }
    }}
