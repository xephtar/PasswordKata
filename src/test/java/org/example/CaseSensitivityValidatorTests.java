package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaseSensitivityValidatorTests {
    @Test
    public void password_is_valid_if_contains_upper_and_lowercase(){
        var isValid = new CaseSensitivityValidator().validate("Password1_");
        Assertions.assertEquals(true, isValid);
    }

    @Test
    public void password_is_not_valid_it_has_no_lowercase(){
        var isValid = new CaseSensitivityValidator().validate("PASSWORD1_");
        Assertions.assertEquals(false, isValid);
    }

    @Test
    public void password_is_not_valid_it_has_no_uppercase(){
        var isValid = new CaseSensitivityValidator().validate("password1_");
        Assertions.assertEquals(false, isValid);
    }
}
