package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsCharValidatorTests {
    @Test
    public void password_is_valid_it_has_given_char(){
        var isValid = new ContainsCharValidator("_").validate("Password1_");
        Assertions.assertEquals(true, isValid);
    }

    @Test
    public void password_is_not_valid_it_has_not_given_char(){
        var isValid = new ContainsCharValidator("_").validate("Password12");
        Assertions.assertEquals(false, isValid);
    }
}
