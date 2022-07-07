package org.example;

import java.util.ArrayList;
import java.util.List;

public class SecondRuleSetValidator extends ValidatorSet {
    private List<Validator> validators = new ArrayList<>();

    public SecondRuleSetValidator() {
        validators.add(new LengthValidator(6));
        validators.add(new CaseSensitivityValidator());
        validators.add(new ContainsAnyNumberValidator());
    }

    @Override
    public boolean check(String password) {
        for(Validator validator: validators){
            if(!validator.validate(password)){
                return false;
            }
        }
        return true;
    }
}
