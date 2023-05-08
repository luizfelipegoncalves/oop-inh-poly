package sys.common;

import sys.validation.ValidationException;

public abstract class Code {
    protected String code;

    protected abstract int codeLen();

    public Code(String code) throws ValidationException {
        setCode(code);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) throws ValidationException {
        int len = codeLen();
        if (code.length() != len) {
            throw new ValidationException("`code` must have " + len + " digits");
        }
        this.code = code;
    }

    @Override
    public String toString() {
        String className = this.getClass().getName();
        return className + "(" + code + ")";
    }
}
