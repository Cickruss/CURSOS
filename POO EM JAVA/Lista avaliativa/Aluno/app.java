import javax.swing.JOptionPane;

public class app {
    public static void main(String[] args) {
        aluno aluno = new aluno();
        boolean exit = false;

        JOptionPane.showMessageDialog(null, "Tempo inicial sem dormir: 0 horas", "Bem vindo ao organizador de sono!", JOptionPane.INFORMATION_MESSAGE);

        while (exit == false) {
            
        

        int escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção: \n1 - Dormir\n2 - Estudar\n3 - Sair \n"+ aluno.getTempoSemDormir()+ " horas sem dormir", "Organizador de sono", JOptionPane.INFORMATION_MESSAGE));

        switch (escolha) {
            case 1:
                aluno.dormir();
                break;
            case 2:
                aluno.estudar();
                break;
        
            case 3:
            JOptionPane.showMessageDialog(null, "Bye bye!", "Programa fechado", JOptionPane.INFORMATION_MESSAGE);
            exit = true;
                break;
        
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }
}
