package sys.empresa;

import java.util.List;

public class Empresa {
    private List<Cliente> clientes;
    private List<Funcionario> funcionarios;
    private Funcionario presidente;

    public Empresa(List<Cliente> clientes, List<Funcionario> funcionarios, Funcionario presidente) {
        this.clientes = clientes;
        this.funcionarios = funcionarios;
        this.presidente = presidente;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public Funcionario getPresidente() {
        return presidente;
    }

    public void setPresidente(Funcionario presidente) {
        this.presidente = presidente;
    }
}
