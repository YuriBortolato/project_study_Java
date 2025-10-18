package codigo.log;

import java.util.logging.Level;
import java.util.logging.Logger;

abstract class Empregado {

    protected String nome;
    protected int idade;
    
    private static final Logger logger = Logger.getLogger(Empregado.class.getName());

    public Empregado(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void realizarTarefa();

    public void mostrarInfo() {
        logger.log(Level.WARNING, "Exibindo informações do empregado: " + nome);
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }

    public void logTrabalho(String tarefa) {
        logger.log(Level.WARNING, "Trabalho realizado: " + tarefa);
    }
}