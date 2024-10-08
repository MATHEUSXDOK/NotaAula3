import java.time.LocalDate;

public class Programador extends Funcionario {
    private String linguagem;


    public Programador(String nome, LocalDate nascimento, double salario, String linguagem) {
        super(nome, nascimento, salario);
        this.linguagem = linguagem;
    }


    public void informarLinguagem() {
        System.out.printf("Programador %s trabalha com a linguagem: %s\n", nome, linguagem);
    }
}
