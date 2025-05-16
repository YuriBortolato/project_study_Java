package controller;

import model.Financeiro;

import java.util.ArrayList;

public class FinanceiroController {
    private ArrayList<Financeiro> financeiros = new ArrayList<>();

    public void adicionaFinanceiro(Financeiro financeiro) {
        financeiros.add(financeiro);
    }

    public ArrayList<Financeiro> getFinanceiros() {
        return financeiros;
    }
}
