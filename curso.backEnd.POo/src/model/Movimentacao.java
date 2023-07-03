package model;

import java.util.Date;

import uteis.DataUtil;

public class Movimentacao {

    private String operacao;
    private Date data;
    private Double valorMovimentacao;

    public Movimentacao(String descricao, Double valorMovimentacao) {
        this.operacao = descricao;
        this.data = new Date();
        this.valorMovimentacao = valorMovimentacao;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String descricao) {
        this.operacao = descricao;
    }

    public Date getData() {
        return data;
    }

    public Double getValorMovimentacao() {
        return valorMovimentacao;
    }

    @Override
    public String toString() {
        String dataFormatada = DataUtil.converterDataPraDataHora(data);
        return this.getOperacao() + ":\n" + dataFormatada + " - R$:" + this.valorMovimentacao;
    }

}
