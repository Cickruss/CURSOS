package Programas;
import java.util.Random;

public class Megasena {
    public static void main(String[] args) {
        
        for(int x = 0; x < 6; x++) {
            Random generate = new Random();
            int number = generate.nextInt(60);
            System.out.println(number);  
        }
    }
    



}
