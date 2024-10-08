public class Gato extends Animal {


    public Gato(String nome) {
        super(nome);  // Chama o construtor da superclasse (Animal)
    }


    public void mia() {
        System.out.println(nome + " está miando.");
    }
}
