package sys.pessoa;

import sys.endereco.Endereco;
import sys.pessoa.ident.CPF;

public class PessoaFisica extends Pessoa {
    private CPF cpf;

    public PessoaFisica(String nome, String telefone, Endereco endereco, CPF cpf) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "  cpf=" + cpf +
                "  pessoa=" + super.toString() +
                "}";
    }
}
