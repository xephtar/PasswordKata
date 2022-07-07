package org.example;

import java.util.ArrayList;
import java.util.List;

public class ThirdRuleSetValidator extends ValidatorSet {
    private List<Validator> validators = new ArrayList<>();

    public ThirdRuleSetValidator() {
        validators.add(new LengthValidator(17));
        validators.add(new CaseSensitivityValidator());
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
