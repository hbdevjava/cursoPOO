package model;

import java.util.Date;

import uteis.DataUtil;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String agencia, String conta, Integer digito, Double saldoInicial) {
        super(agencia, conta, digito, saldoInicial);

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("***************************************");
        System.out.println("****** EXTRATO CONTA POUPANÇA *********");
        System.out.println("***************************************");
        System.out.println();
        System.out.println("Gerado em: " + DataUtil.converterDataPraDataHora(new Date()));
        System.out.println();
        // PRA CADA MOVIMENTACAO DENTRO DE MOVIMENTACOES PRINT...
        for (Movimentacao mov : movimentacoes) {
            System.out.println(mov.toString());
        }
        System.out.println();
        System.out.println("***************************************");
        System.out.println("***************************************");
        System.out.println("***************************************");
        System.out.println();
    }

}
