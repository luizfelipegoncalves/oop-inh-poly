package sys.endereco;

import sys.validation.ValidationException;

public class Endereco {
    private String endereco;
    private CEP cep;
    private Cidade cidade;
    private UF uf;

    public Endereco(String endereco, CEP cep, Cidade cidade, UF uf) throws ValidationException {
        setEndereco(endereco);
        setCep(cep);
        setCidade(cidade);
        setUf(uf);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) throws ValidationException {
        if (endereco.isBlank()) {
            throw new ValidationException("`endereco` can't be blank");
        }
        this.endereco = endereco;
    }

    public CEP getCep() {
        return cep;
    }

    public void setCep(CEP cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "endereco='" + endereco + "'" +
                "  cep=" + cep +
                "  cidade=" + cidade +
                "  uf=" + uf +
                '}';
    }
}
