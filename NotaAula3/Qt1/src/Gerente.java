import java.time.LocalDate;

public class Gerente extends Funcionario {
    private String projeto;


    public Gerente(String nome, LocalDate nascimento, double salario, String projeto) {
        super(nome, nascimento, salario);
        this.projeto = projeto;
    }


    public void informarProjeto() {
        System.out.printf("Gerente %s está gerenciando o projeto: %s\n", nome, projeto);
    }
}
