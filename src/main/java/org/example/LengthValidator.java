package org.example;

public class LengthValidator extends Validator {
    private final int MAX_LENGTH;

    public LengthValidator(int length) {
        this.MAX_LENGTH = length;
    }

    public boolean validate(String password) {
        if(password.length() < this.MAX_LENGTH){
            return false;
        }

        return true;
    }
}
