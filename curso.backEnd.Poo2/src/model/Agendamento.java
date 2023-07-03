package src.model;

public class Agendamento {
    private Quarto quarto;
    private Cliente cliente;

    // Injeçao de Dependencia -> (String quarto, String cliente)
    public Agendamento(Quarto quarto, Cliente cliente) {
        this.quarto = quarto;
        this.cliente = cliente;
    }

    public boolean quartoLivre() {

        return false;
    }

}
