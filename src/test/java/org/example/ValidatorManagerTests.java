package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorManagerTests {
    @Test
    public void password_is_invalid_if_has_no_lowercase_for_first_ruleset(){
        var isValid = new ValidatorSetManager().createManager("Validation 1").check("PASSWORD1_");
        Assertions.assertEquals(false, isValid);
    }
}
