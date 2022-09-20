package Desafiio_isaac;

public class desafio2 {
    public static void main(String[] args) {
        String[] cartas = new String[52];
        String numeros[] = {"1","2","3","4","5","6","7","8","9","10","valete","dama","rei"};
        String naipes[] = {"copas", "paus", "espadas", "ouros"};
        criandoArray(cartas, numeros, naipes);
        System.out.println(cartas);
    }

    //ESSA VOID VAI SER MELHORADA BREVEMENTE PARA UTILIZAR APENAS 2 FOR //
    static void criandoArray(String cartas[],String numeros[],String naipes[]){
        for(int i = 0; i < numeros.length; i++){
            cartas[cartas.length] = numeros[i] + " de " + naipes[0]; 
        }
        for(int y = 0; y < numeros.length; y++){
            cartas[cartas.length] = numeros[y] + " de " + naipes[1]; 
        }
        for(int x = 0; x < numeros.length; x++){
            cartas[cartas.length] = numeros[x] + " de " + naipes[2]; 
        }
        for(int z = 0; z < numeros.length; z++){
            cartas[cartas.length] = numeros[z] + " de " + naipes[3]; 
        }
    }
}
