package sys.pessoa.ident;

import sys.common.Code;
import sys.validation.ValidationException;

public class CPF extends Code {
    public CPF(String code) throws ValidationException {
        super(code);
    }

    @Override
    protected int codeLen() {
        return 11;
    }
}
