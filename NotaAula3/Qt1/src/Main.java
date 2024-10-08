import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o nome do Gerente:");
        String nomeGerente = scanner.nextLine();
        System.out.println("Digite a data de nascimento do Gerente (AAAA-MM-DD):");
        LocalDate nascimentoGerente = LocalDate.parse(scanner.nextLine());
        System.out.println("Digite o salário do Gerente:");
        double salarioGerente = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite o projeto do Gerente:");
        String projetoGerente = scanner.nextLine();

        Gerente gerente = new Gerente(nomeGerente, nascimentoGerente, salarioGerente, projetoGerente);


        System.out.println("Digite o nome do Programador:");
        String nomeProgramador = scanner.nextLine();
        System.out.println("Digite a data de nascimento do Programador (AAAA-MM-DD):");
        LocalDate nascimentoProgramador = LocalDate.parse(scanner.nextLine());
        System.out.println("Digite o salário do Programador:");
        double salarioProgramador = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite a linguagem de programação do Programador:");
        String linguagemProgramador = scanner.nextLine();

        Programador programador = new Programador(nomeProgramador, nascimentoProgramador, salarioProgramador, linguagemProgramador);


        gerente.informarSalario();
        System.out.printf("Idade do Gerente: %d anos\n", gerente.calcularIdade());
        gerente.informarProjeto();

        System.out.println();

        programador.informarSalario();
        System.out.printf("Idade do Programador: %d anos\n", programador.calcularIdade());
        programador.informarLinguagem();

        scanner.close();
    }
}


