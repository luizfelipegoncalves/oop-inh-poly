# oop-inh-poly

## Requisitos

- Implemente uma classe pessoa que irá armazenar dados pessoais: nome, endereço,
  telefone, cep, cidade e uf.
- Crie subclasses PessoaFisica e PessoaJuridica, que especificam o comportamento
  de Pessoa.
- Crie uma classe Empresa que armazena uma lista de Clientes e de Funcionários.
  Clientes podem ser pessoas físicas ou jurídicas, mas funcionários podem ser
  apenas pessoas físicas. Clientes possuem um limite de crédito, enquanto
  funcionários possuem cargo e salário.
- Suponha agora que a Empresa deseje armazenar em atributo próprio o seu
  Presidente, sendo que o Presidente da empresa é também um Funcionário.

## Solução

Classes:

- `Pessoa`
  - `PessoaFísica`
  - `PessoaJurídica`
- `Empresa`
  - `Cliente`
    - possui `Pessoa` (já que pode ser tanto PF quanto PJ)
  - `Funcionário`
    - possui `PessoaFísica`

Na lista acima, a hierarquia por padrão indica uma relação de herança. Quando o
termo "possui" é utilizado, adota-e a abordagem de composição.

Optei por fazer com que, por exemplo, `Cliente` _componha_ uma `Pessoa` para não
introduzir uma relação de herança entre duas partes diferentes do sistema.
`Cliente` está mais ligado ao domínio de uma `Empresa` do que de uma `Pessoa`.

Implementou-se a classe abstrata `Code` para representar `CPF`, `CNPJ` e `CEP`,
já que a lógica de validação deles era comum.
