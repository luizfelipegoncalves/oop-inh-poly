package sys.endereco;

import sys.common.Code;
import sys.validation.ValidationException;

public class CEP extends Code {
    public CEP(String code) throws ValidationException {
        super(code);
    }

    @Override
    protected int codeLen() {
        return 8;
    }
}
