package funcionário;

public class app {
    public static void main(String[] args) {
        funcionario fun = new funcionario();
        boolean exit = false;
        
        fun.boasVindas();
        fun.pegarNome();
        fun.pegarsalario();
        
        while (exit == false) {
            fun.escolha(exit);
        }
    }
}
