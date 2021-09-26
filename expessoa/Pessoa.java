package expessoa;

public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf){
        this.cpf = cpf;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public boolean equals(Object obj){
        Pessoa pessoa = (Pessoa) obj;
        return this.cpf == pessoa.cpf;
    }
}
