package sys.empresa;

import sys.pessoa.Pessoa;
import sys.validation.ValidationException;

import java.math.BigDecimal;

public class Cliente {
    private Pessoa pessoa;
    private BigDecimal limiteCredito;

    public Cliente(Pessoa pessoa, BigDecimal limiteCredito) throws ValidationException {
        setPessoa(pessoa);
        setLimiteCredito(limiteCredito);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public BigDecimal getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(BigDecimal limiteCredito) throws ValidationException {
        if (limiteCredito.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ValidationException("`limiteCredito` must be greater or equal 0");
        }
        this.limiteCredito = limiteCredito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "  pessoa=" + pessoa +
                "  limiteCredito=" + limiteCredito +
                '}';
    }
}
