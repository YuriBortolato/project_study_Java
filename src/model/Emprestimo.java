package model;

public class Emprestimo { private double capital; private double taxa; private int tempo;

public Emprestimo(double capital, double taxa, int tempo) {
    this.capital = capital;
    this.taxa = taxa;
    this.tempo = tempo;
}

public double calcularJurosSimples() {
    return capital * taxa * tempo;
}

public double calcularMontanteComposto() {
    return capital * Math.pow(1 + taxa, tempo);
}

public double getCapital() {
    return capital;
}

public double getTaxa() {
    return taxa;
}

public int getTempo() {
    return tempo;
}

}

