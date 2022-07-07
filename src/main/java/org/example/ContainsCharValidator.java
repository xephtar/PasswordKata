package org.example;

public class ContainsCharValidator extends Validator {
    private final String character;

    public ContainsCharValidator(String character) {
        this.character = character;
    }

    public boolean validate(String password) {
        return password.contains(character);
    }

}
