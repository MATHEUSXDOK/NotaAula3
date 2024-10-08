public class Cachorro extends Animal {


    public Cachorro(String nome) {
        super(nome);  // Chama o construtor da superclasse (Animal)
    }


    public void late() {
        System.out.println(nome + " está latindo.");
    }
}
