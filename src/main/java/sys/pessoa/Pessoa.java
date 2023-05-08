package sys.pessoa;

import sys.endereco.Cidade;
import sys.endereco.Endereco;
import sys.endereco.UF;

public class Pessoa {
    private String nome;
    private String telefone;
    private Endereco endereco;

    public Pessoa(String nome, String telefone, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "  nome='" + nome + "'" +
                "  telefone='" + telefone + "'" +
                "  endereco=" + endereco +
                '}';
    }
}
