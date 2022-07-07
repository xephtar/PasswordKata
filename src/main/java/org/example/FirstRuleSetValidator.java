package org.example;

import java.util.ArrayList;
import java.util.List;

public class FirstRuleSetValidator extends ValidatorSet {
    private List<Validator> validators = new ArrayList<>();
    public FirstRuleSetValidator() {
        validators.add(new LengthValidator(9));
        validators.add(new CaseSensitivityValidator());
        validators.add(new ContainsAnyNumberValidator());
        validators.add(new ContainsCharValidator("_"));
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
