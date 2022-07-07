package org.example;

public class ValidatorSetManager {
    public ValidatorSetManager() {
    }

    public ValidatorSet createManager(String version){
        if(version.equals("Validation 1")){
            return new FirstRuleSetValidator();
        }

        if (version.equals("Validation 2")){
            return new SecondRuleSetValidator();
        }

        if (version.equals("Validation 3")){
            return new ThirdRuleSetValidator();
        }

        return null;
    }
}
