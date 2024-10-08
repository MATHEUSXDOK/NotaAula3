import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o nome do Cachorro:");
        String nomeCachorro = scanner.nextLine();
        Cachorro cachorro = new Cachorro(nomeCachorro);
        System.out.println("Digite a raça do Cachorro:");
        cachorro.setRaca(scanner.nextLine());


        System.out.println("Digite o nome do Gato:");
        String nomeGato = scanner.nextLine();
        Gato gato = new Gato(nomeGato);
        System.out.println("Digite a raça do Gato:");
        gato.setRaca(scanner.nextLine());


        System.out.println("\n Ações dos Animais:");
        cachorro.caminha();
        cachorro.late();

        gato.caminha();
        gato.mia();

        scanner.close();
    }
}
