package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthValidatorTests {
    @Test
    public void password_is_valid_it_has_ten_characters(){
        var isValid = new LengthValidator(9).validate("Password1_");
        Assertions.assertEquals(true, isValid);
    }

    @Test
    public void password_is_not_valid_it_has_4_characters(){
        var isValid = new LengthValidator(9).validate("Pass");
        Assertions.assertEquals(false, isValid);
    }
}
