package sys.pessoa;

import sys.endereco.Endereco;
import sys.pessoa.ident.CNPJ;

public class PessoaJuridica extends Pessoa {
    private CNPJ cnpj;

    public PessoaJuridica(String nome, String telefone, Endereco endereco, CNPJ cnpj) {
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "  cnpj=" + cnpj +
                "  pessoa=" + super.toString() +
                "}";
    }
}
