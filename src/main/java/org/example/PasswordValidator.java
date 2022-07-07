package org.example;

public class PasswordValidator {
    public ValidatorSet validatorManager;

    public PasswordValidator() {
        this("Validation 1");
    }

    public PasswordValidator(String version) {
        validatorManager = new ValidatorSetManager().createManager(version);
    }

    public boolean validate(String password) {
        return validatorManager.check(password);
    }
}
