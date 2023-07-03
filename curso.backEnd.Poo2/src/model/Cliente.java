package src.model;

public class Cliente extends Pessoa {

    private Integer idade;

    public Cliente(String nome, String telefone, String cpf, Integer idade) {
        super(nome, telefone, cpf);
        this.idade = idade;
        // NAO PRECISA PASSAE IDADE PRO SUPER PQ IDADE É ATRIBUTO ESPECIFICO DO CLIENTE;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "|" + " CPF: " + this.cpf + "|" + " Telefone: " + this.telefone + "|" + " Idade: "
                + this.idade;
    }

}
