package funcionário;

import javax.swing.JOptionPane;

public class funcionario {
    private String nome;
    private double salario;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void boasVindas(){
        JOptionPane.showMessageDialog(null, "Aperte ok para prosseguir", "Bem vindo ao aumento salarial", JOptionPane.INFORMATION_MESSAGE);
    }
    public void pegarNome(){
        setNome(JOptionPane.showInputDialog(null, "Digite seu nome: "));
    }
    public void pegarsalario(){
        setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu salário: ")));
    }
    public void escolha(boolean exit){
        String esc = JOptionPane.showInputDialog(null, "Deseja pedir aumento? S/N", "Salário: " + this.salario, JOptionPane.INFORMATION_MESSAGE);

        if (esc == "s"|| esc == "S") {
            aumentarSalario();
        }else{
            JOptionPane.showMessageDialog(null, "Programa fechado!");
            exit = true;
        }
    }
    public void aumentarSalario(){
        double perc = Double.parseDouble(JOptionPane.showInputDialog(null, "Escolha o percentual do aumento do salário", "Aumento de salário", JOptionPane.INFORMATION_MESSAGE));

        this.salario += salario * (perc/100);

        JOptionPane.showMessageDialog(null, "Aumentado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }
}