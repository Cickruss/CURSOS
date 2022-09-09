import java.util.ArrayList;

import javax.swing.JOptionPane;

public class garagem {
    private String moto = "moto";    
    private String carro = "carro";    
    private String carro4x4 = "4x4";
    int contagemDeVagas = 20;

    public String getMoto() {
        return moto;
    }
    public void setMoto(String moto) {
        this.moto = moto;
    }
    public String getCarro() {
        return carro;
    }
    public void setCarro(String carro) {
        this.carro = carro;
    }
    public String getCarro4x4() {
        return carro4x4;
    }
    public void setCarro4x4(String carro4x4) {
        this.carro4x4 = carro4x4;
    }    

    void estacionarMoto(ArrayList<String> vagas){
        if (contagemDeVagas > 0) {   
            vagas.add(moto);
            contagemDeVagas--;
            JOptionPane.showMessageDialog(null, "Estacionado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "O numero de vagas acabaram!", "ALERTA!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    void estacionarCarro(ArrayList<String> vagas){
        if (contagemDeVagas > 0) {
            vagas.add(carro);
            vagas.add(carro);
            contagemDeVagas = contagemDeVagas - 2;
            JOptionPane.showMessageDialog(null, "Estacionado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "O numero de vagas acabaram!", "ALERTA!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    void estacionarCarro4x4(ArrayList<String> vagas){
        if (contagemDeVagas > 0) {
            vagas.add(carro4x4);
            vagas.add(carro4x4);
            vagas.add(carro4x4);
            vagas.add(carro4x4);
            contagemDeVagas = contagemDeVagas - 4;   
            JOptionPane.showMessageDialog(null, "Estacionado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "O numero de vagas acabaram!", "ALERTA!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
