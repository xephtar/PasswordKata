package org.example;

public class ContainsAnyNumberValidator extends Validator {
    public boolean validate(String password) {
        return password.matches("(.*)\\d(.*)");
    }
}
