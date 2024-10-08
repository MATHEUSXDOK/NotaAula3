import java.time.LocalDate;
import java.time.Period;

public class Funcionario {
    protected String nome;
    protected LocalDate nascimento;
    protected double salario;


    public Funcionario(String nome, LocalDate nascimento, double salario) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.salario = salario;
    }


    public void informarSalario() {
        System.out.printf("Salário de %s: R$ %.2f\n", nome, salario);
    }


    public int calcularIdade() {
        return Period.between(nascimento, LocalDate.now()).getYears();
    }
}
