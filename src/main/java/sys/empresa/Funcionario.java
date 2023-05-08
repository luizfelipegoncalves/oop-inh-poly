package sys.empresa;

import sys.pessoa.Pessoa;
import sys.validation.ValidationException;

import java.math.BigDecimal;

public class Funcionario {
    private Pessoa pessoa;
    private String cargo;
    private BigDecimal salario;

    public Funcionario(Pessoa pessoa, String cargo, BigDecimal salario) throws ValidationException {
        setPessoa(pessoa);
        setCargo(cargo);
        setSalario(salario);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) throws ValidationException {
        if (cargo.isBlank()) {
            throw new ValidationException("`cargo` can't be blank");
        }
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) throws ValidationException {
        if (salario.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ValidationException("`salario` must be greater or equal 0");
        }
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "  pessoa=" + pessoa +
                "  cargo='" + cargo + "'" +
                "  salario=" + salario +
                '}';
    }
}
