public class Animal {
    protected String nome;
    protected String raca;


    public Animal() {
        this.nome = "";
        this.raca = "";
    }


    public Animal(String nome) {
        this.nome = nome;
        this.raca = "";
    }


    public void caminha() {
        System.out.println(nome + " está caminhando.");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
