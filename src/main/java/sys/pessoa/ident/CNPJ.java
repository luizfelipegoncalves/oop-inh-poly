package sys.pessoa.ident;

import sys.common.Code;
import sys.validation.ValidationException;

public class CNPJ extends Code {
    public CNPJ(String code) throws ValidationException {
        super(code);
    }

    @Override
    protected int codeLen() {
        return 14;
    }
}
