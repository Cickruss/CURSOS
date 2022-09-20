import java.util.ArrayList;
import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) {
        garagem garagem = new garagem();
        ArrayList<String> vagas = new ArrayList<String>();
        boolean rodar = true;

        while (rodar == true) {
            
        String escolha = JOptionPane.showInputDialog(null, "Qual veiculo vc deseja estacionar \n1 - Moto\n2 - Carro\n3 - Carro 4x4\n4 - Sair");

        switch (escolha) {
            case "1":
                garagem.estacionarMoto(vagas);
                break;
            case "2":
                garagem.estacionarCarro(vagas);
                break;
            case "3":
                garagem.estacionarCarro4x4(vagas);
                break;
            case "4":
                rodar = false;
                JOptionPane.showMessageDialog(null, "Programa fechado!", "Sair", JOptionPane.INFORMATION_MESSAGE);
                break;
        
            default:
            JOptionPane.showMessageDialog(null, "Opção inválida!", "ALERTA!", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
    }
}
