package sys.endereco;

import sys.validation.ValidationException;

public class UF {
    private String uf;

    public UF(String uf) throws ValidationException {
        setUf(uf);
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) throws ValidationException {
        if (uf.length() != 2) {
            throw new ValidationException("`uf` must be two digits");
        }
        this.uf = uf.toUpperCase();
    }

    @Override
    public String toString() {
        return "UF(" + uf + ")";
    }
}
