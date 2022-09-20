import javax.swing.JOptionPane;

public class app {
    public static void main(String[] args) {

        boolean exit = false;
        while (exit == false) {
            
            String inp = JOptionPane.showInputDialog(null, "Digite uma data: ", "Analisador de datas", JOptionPane.INFORMATION_MESSAGE);
            
            switch (inp) {
                case "11/09/2022":
                JOptionPane.showMessageDialog(null, "Essa é a data onde vc fez a sua melhor escolha", "Inicio de tudo", JOptionPane.INFORMATION_MESSAGE);
                break;
                case "21/10/2022":
                JOptionPane.showMessageDialog(null, "Essa é a data do amor da sua vida", "Feliz vida, amor", JOptionPane.INFORMATION_MESSAGE);
                break;
                default:
                JOptionPane.showMessageDialog(null, "Coloquei qualquer coisa só pra dizer que TE AMO! \n Você é tudo pra mim.", "Com amor, do seu amor", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
}
}
