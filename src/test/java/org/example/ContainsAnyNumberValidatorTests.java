package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsAnyNumberValidatorTests {
    @Test
    public void password_is_valid_it_has_number(){
        var isValid = new ContainsAnyNumberValidator().validate("Password1_");
        Assertions.assertEquals(true, isValid);
    }

    @Test
    public void password_is_valid_it_has_no_number(){
        var isValid = new ContainsAnyNumberValidator().validate("Passworda_");
        Assertions.assertEquals(false, isValid);
    }
}
