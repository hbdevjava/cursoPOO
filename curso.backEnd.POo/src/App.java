
import model.ContaCorrente;
import model.ContaPoupanca;
import model.Movimentacao;
import uteis.DataUtil;

public class App {
    public static void main(String[] args) {
        System.out.println("Criando Banco Digital");
        System.out.println();

        ContaCorrente contaCc = new ContaCorrente("001", "7548", 0, 300.00);

        ContaPoupanca contaCp = new ContaPoupanca("002", "7459", 1, 300.00);

        System.out.println(contaCc.getSaldo());
        System.out.println(contaCp.getSaldo());
        System.out.println();

        System.out.println("DEPOSITO....");
        contaCc.depositar(100.00);
        contaCp.depositar(100.00);
        System.out.println(contaCc.getSaldo());
        System.out.println(contaCp.getSaldo());
        contaCc.depositar(15.00);
        System.out.println();

        System.out.println("SAQUE....");
        contaCc.sacar(50.00);
        contaCp.sacar(100.00);
        System.out.println(contaCc.getSaldo());
        System.out.println(contaCp.getSaldo());
        contaCp.sacar(600.00);
        System.out.println();

        System.out.println("TRASFERENCIA....");
        contaCc.transferir(25.00, contaCp);
        contaCp.transferir(50.00, contaCc);
        System.out.println(contaCc.getSaldo());
        System.out.println(contaCp.getSaldo());

        System.out.println(contaCc.getDataAbertura());
        System.out.println();
        System.out.println("DATAS E HORAS");
        // DataUtil util = new DataUtil();
        // var forme = util.converterDataPraDataHora(contaCc.getDataAbertura());
        // System.out.println(forme);
        // var soData = util.converterParaData(contaCc.getDataAbertura());
        // System.out.println(soData);
        // var soHora = util.converterParaHora(contaCc.getDataAbertura());
        // System.out.println(soHora);
        System.out.println();
        System.out.println("DATE COM METODO STATIC");
        var forme = DataUtil.converterDataPraDataHora(contaCc.getDataAbertura());
        System.out.println(forme);
        var soData = DataUtil.converterParaData(contaCc.getDataAbertura());
        System.out.println(soData);
        var soHora = DataUtil.converterParaHora(contaCc.getDataAbertura());
        System.out.println(soHora);
        System.out.println();

        Movimentacao movimentacao = new Movimentacao("Deposito", 100.00);

        System.out.println(movimentacao.toString());

        contaCp.imprimirExtrato();
        contaCc.imprimirExtrato();

    }

}
