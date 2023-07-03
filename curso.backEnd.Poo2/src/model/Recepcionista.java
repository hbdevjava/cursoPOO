package src.model;

import src.intercafes.IRecepcionista;

public class Recepcionista extends Pessoa implements IRecepcionista {

    public Recepcionista(String nome, String telefone, String cpf) {
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

}
