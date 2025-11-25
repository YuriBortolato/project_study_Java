package model;


public class Cliente { private String nome; private String cpf; private Emprestimo emprestimo;

public Cliente(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
}

public String getNome() {
    return nome;
}

public String getCpf() {
    return cpf;
}

public Emprestimo getEmprestimo() {
    return emprestimo;
}

public void setEmprestimo(Emprestimo emprestimo) {
    this.emprestimo = emprestimo;
}

}
