import java.util.ArrayList;

import src.model.Agendamento;
import src.model.Camareira;
import src.model.Cliente;
import src.model.EnumTipo;
import src.model.Gerente;
import src.model.Quarto;
import src.model.Recepcionista;

public class App {
        public static void main(String[] args) {
                System.out.println("-HB Hotel-");

                Recepcionista recepcionista1 = new Recepcionista("Ana", "85987412658",
                                "789.456.123.00");
                Camareira camareira1 = new Camareira("Joana", "85992457856",
                                "123.456.789.22");
                Gerente gerente1 = new Gerente("Jose", "85991445578", "456.789.123.88");
                Quarto quarto1 = new Quarto();
                quarto1.setNumero("32A");
                quarto1.setValor(125.22);
                quarto1.setTipo(EnumTipo.BASICO);
                Quarto quarto2 = new Quarto();
                quarto2.setNumero("33A");
                quarto2.setValor(452.55);
                quarto2.setTipo(EnumTipo.PRESIDENCIAL);
                ArrayList<Quarto> listaQuarto = new ArrayList<>();
                listaQuarto.add(quarto1);
                listaQuarto.add(quarto2);

                for (Quarto quarto : listaQuarto) {
                        System.out.println(quarto.toString());
                }

                recepcionista1.atenderTelefone();
                recepcionista1.falarIngles();
                System.out.println();
                gerente1.arrumarCama();
                gerente1.limparQuarto();
                gerente1.atenderTelefone();
                gerente1.falarIngles();
                System.out.println();
                camareira1.arrumarCama();
                camareira1.limparQuarto();

                System.out.println(quarto1.getTipo().getValor());
                System.out.println(quarto2.getTipo());
                System.out.println(quarto2.getValor());

                // PRA CADA CLIENTE DENTRO DA LISTA DE CLIENTE MOSTRE OS CLIENTES
                // for (Cliente cliente : listaClientes) {
                // System.out.println(cliente);
                // }

                Cliente cliente1 = new Cliente("Vikas", "85991547845", "45789903311", 21);
                Cliente cliente2 = new Cliente("Hebert", "85991541212", "45789901212", 42);
                Cliente cliente3 = new Cliente("Son", "85991547412", "63215903311", 25);
                Cliente cliente4 = new Cliente("Dora", "85992667477", "65415903311", 03);

                ArrayList<Cliente> clientes = new ArrayList<>();
                clientes.add(cliente1);
                clientes.add(cliente2);
                clientes.add(cliente3);
                clientes.add(cliente4);

                System.out.println(cliente1.getNome());
                System.out.println(cliente2.getNome());
                System.out.println(cliente3.getNome());
                System.out.println(cliente4.getNome());

                for (Cliente cliente : clientes) {
                        System.out.println(cliente);
                }

                System.out.println(clientes.size() + " clientes na lista");
                // SEMPRE USAR count() QUANDO FOR IMPRIMIR RESULTADO DO stream()
                var result1 = clientes.stream().filter(c -> c.getIdade() > 20);
                System.out.println(result1.count());
                System.out.println("PRINTA NA TELA COM LAMBDA CADA CLIENTE");
                clientes.stream().forEach(c -> System.out.println(c.getNome()));
                System.out.println("ENCONTRAR DADOS DENTRO DA LISTA USANDO STREAM");
                clientes.stream()
                                .filter(c -> c.getNome()
                                                .contains("Hebert"))
                                .forEach(c -> System.out.println(c.getNome()));
                System.out.println("ENCONTRAR 2 DADOS DENTRO DA LISTA USANDO STREAM");
                clientes.stream()
                                .filter(c -> c.getNome()
                                                .startsWith("V"))
                                .forEach(c -> System.out.println(c.getNome()));

                Agendamento agendamento1 = new Agendamento(quarto1, cliente1);
                Agendamento agendamento2 = new Agendamento(quarto2, cliente2);

                // System.out.println(quarto1.quartoLivre());

        }

}
