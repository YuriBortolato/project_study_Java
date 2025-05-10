package codigo.log;

public class Engenheiro extends Empregado implements Trabalhador {
    public Engenheiro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void realizarTarefa() {
        System.out.println(nome + " está projetando um sistema.");
        logTrabalho("Projetar sistema");
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está trabalhando como engenheiro.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("Cargo: Engenheiro");
    }
}
