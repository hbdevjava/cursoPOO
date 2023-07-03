package src.model;

import src.intercafes.ICamareira;

public class Camareira extends Pessoa implements ICamareira {

    public Camareira(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);

    }

    @Override
    public void arrumarCama() {
        System.out.println("Deixarei a cama arrumada...");
    }

    @Override
    public void limparQuarto() {
        System.out.println("Deixarei o quarto bem limpo...");

    }

}
