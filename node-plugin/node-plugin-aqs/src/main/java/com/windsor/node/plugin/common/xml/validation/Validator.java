package com.windsor.node.plugin.common.xml.validation;

import java.io.InputStream;

public abstract interface Validator
{
  public abstract ValidationResult validate(InputStream paramInputStream)
    throws ValidationException;
}


/* Location:              C:\Users\cmiles\Documents\Java Projects\AQS\AQS\_25C455FD-A159-4216-8911-704D52B3739C\aqs.jar!\com\windsor\node\plugin\common\xml\validation\Validator.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */