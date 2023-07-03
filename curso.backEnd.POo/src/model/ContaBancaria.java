package model;

import java.util.ArrayList;
import java.util.Date;

public abstract class ContaBancaria {
    /**
     * TODA CLASSE ABSTRATA NAO PODE SER INSTANCIADA ELA SO SERVE DE MOLDE DE
     * CRIAÇAO,
     * NELA EU ENCAPULO TODA REGRA DE NEGOCIO E A PARTI DELA CRIO OS
     * OBJETOS(CLASSES)
     * POR MEIO DE HERANÇA (EXTENDS) EX: ContaPoupança extends ContaBancaria OU
     * ContaCorrente extends ContaBancaria ASSIM CLASSE FILHO HERA DA CLASSE PAI
     */

    // ATRIBUTOS
    protected String agencia;
    protected String conta;
    protected Integer digito;
    protected Double saldo;
    protected Date dataAbertura;
    protected double VALOR_MINIMO_DEPOSITO = 20.00;
    protected ArrayList<Movimentacao> movimentacoes;

    public void depositar(Double valorDeposito) {

        if (valorDeposito < VALOR_MINIMO_DEPOSITO) {
            System.out.println("O valor minimo R$ " + VALOR_MINIMO_DEPOSITO);
        } else {
            this.saldo += valorDeposito;
            Movimentacao movimentacao = new Movimentacao("DEPOSITO", valorDeposito);
            this.movimentacoes.add(movimentacao);
        }

    }

    public Double sacar(Double valorSaque) {
        if (valorSaque > saldo) {
            System.out.println("Saldo Insuficiente...");
        } else if (valorSaque < saldo) {
            this.saldo -= valorSaque;
            Movimentacao movimentacao = new Movimentacao("SAIDA DE VALORES", valorSaque);
            this.movimentacoes.add(movimentacao);
        }
        return saldo;

    }

    public void transferir(Double valorTransferencia, ContaBancaria contaDestino) {
        this.sacar(valorTransferencia);
        contaDestino.depositar(valorTransferencia);

    }

    public abstract void imprimirExtrato();

    /**
     * OS METODOS ABSTRATOS NAO PODEM SER IMPLEMETADOS, A CLASSE QUE HERDAR DE
     * CONTABANCARIA ESSE É QUE TEM O DEVER DE IMPLEMENTAR O METODO....
     */

    // CONTRUTORES
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();
        this.movimentacoes = new ArrayList<Movimentacao>();
        Movimentacao movimentacao = new Movimentacao("Abertura de conta", saldoInicial);
        this.movimentacoes.add(movimentacao);
        // AQUI ESTOU SALVANDO A MOVIMENTACOES DENTRO DO MEU ARRAY DE MOVIMENTACAO
        // new Date() NA HR QUE FOR ESTACIADO UMA CONTA ELA AUTOMATICAMENTE PEGA A HR
        // ATUAL DA
        // MAQUINA;
    }

    // METODOS DE ACESSO

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public Double getSaldo() {
        return saldo;
    }

}
