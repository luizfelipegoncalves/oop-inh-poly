package sys.endereco;

import sys.validation.ValidationException;

public class Cidade {
    private String name;

    public Cidade(String name) throws ValidationException {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws ValidationException {
        if (name.isBlank()) {
            throw new ValidationException("`name` can't be blank");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cidade(" + name + ")";
    }
}
