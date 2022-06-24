package org.owasp.safetypes.types.integer;

import org.owasp.safetypes.exception.TypeValidationException;

public class Integer0_N extends AbstractSafeLimitedInteger {

    public Integer0_N(Integer value) throws TypeValidationException {
        super(value);
    }

    public Integer0_N(String value) throws TypeValidationException {
        super(Integer.parseInt(value));
    }

    @Override
    protected final Integer low() {
        return 0;
    }

    @Override
    protected final Integer high() {
        return null;
    }
}
