import java.util.ArrayList;

import src.model.Cliente;

public class teste {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("HB");
        nomes.add("vikav");
        nomes.add("son");
        nomes.add("dora");

        for (String listanomes : nomes) {
            System.out.println(listanomes);
        }
        System.out.println();
        System.out.println();

        Cliente cliente1 = new Cliente("Hb", "85999784512", "654.457.654.11", 42);
        Cliente cliente2 = new Cliente("Vikas", "859997845544", "654.457.654.01",
                21);
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        System.out.println(clientes.size());
        System.out.println(cliente1.getNome());
        System.out.println(cliente2.getNome());

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
        System.out.println();
        System.out.println();

        ArrayList<Object> lista = new ArrayList<>();
        lista.add("nomes");
        lista.add(true);
        lista.add(123456);

        for (Object object : lista) {
            System.out.println(object);
        }

    }
}
