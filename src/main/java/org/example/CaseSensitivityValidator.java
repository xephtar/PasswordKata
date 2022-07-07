package org.example;

public class CaseSensitivityValidator extends Validator {
    public boolean validate(String password) {
        return !password.toLowerCase().equals(password) && !password.toUpperCase().equals(password);
    }
}
