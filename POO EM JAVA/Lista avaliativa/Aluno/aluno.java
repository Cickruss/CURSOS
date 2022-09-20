import javax.swing.JOptionPane;
import javax.swing.text.html.parser.Parser;

public class aluno{
    // nome, curso, tempoSemDormir 
    private String nome; 
    private String curso;
    private int tempoSemDormir = 0;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getTempoSemDormir() {
        return tempoSemDormir;
    }
    public void setTempoSemDormir(int tempoSemDormir) {
        this.tempoSemDormir = tempoSemDormir;
    }
    
    // estudar(que recebe como parâmetro	a quantidade de horas de estudo	e	acrescenta tempoSemDormir	)	
    public void estudar(){
        int tempoDeEstudo = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto tempo vc estudou?"));
        this.tempoSemDormir += tempoDeEstudo;
    }
    //Dormir(que recebe como parâmetro	a quantidade de horas de sono e reduz tempoSemDormir)
    public void dormir(){
        int horasDeSono = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto tempo vc dormiu?"));
        this.tempoSemDormir -= horasDeSono;
    }


}