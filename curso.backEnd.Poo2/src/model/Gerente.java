package src.model;

import src.intercafes.ICamareira;
import src.intercafes.IRecepcionista;

public class Gerente extends Pessoa implements IRecepcionista, ICamareira {

    public Gerente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);

    }

    @Override
    public void atenderTelefone() {
        System.out.println("Bom dia posso te ajudar???");
    }

    @Override
    public void falarIngles() {
        System.out.println("I speak English ");
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
