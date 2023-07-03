package src.model;

import java.util.ArrayList;

public class Quarto {
    private String numero;
    private Double valor;
    protected EnumTipo tipo;
    

    // public Quarto(String numero, Double valor, String tipo) {
    // this.numero = numero;
    // this.valor = valor;
    // this.tipo = tipo;
    // }

    public String quartoOk(String livre) {
        
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public EnumTipo getTipo() {
        return tipo;
    }

    public void setTipo(EnumTipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Quarto numero=" + this.numero + ", valor = " + this.valor + ", tipo = " + this.tipo + "]";
    }

    

}
