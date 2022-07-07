package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTests {
    @Test
    public void password_is_valid(){
        var isValid = new PasswordValidator().validate("Password1_");
        Assertions.assertEquals(true, isValid);
    }

    @Test
    public void password_is_invalid_if_it_has_less_than_nine_characters(){
        var isValid = new PasswordValidator().validate("Passwo1_");
        Assertions.assertEquals(false, isValid);
    }

    @Test
    public void password_is_invalid_if_it_has_no_capital_letter(){
        var isValid = new PasswordValidator().validate("password1_");
        Assertions.assertEquals(false, isValid);
    }

    @Test
    public void password_is_invalid_if_it_has_no_lowercase_letter(){
        var isValid = new PasswordValidator().validate("PASSWORD1_");
        Assertions.assertEquals(false, isValid);
    }

    @Test
    public void password_is_invalid_if_it_has_no_number(){
        var isValid = new PasswordValidator().validate("Passworda_");
        Assertions.assertEquals(false, isValid);
    }

    @Test
    public void password_is_invalid_if_it_has_underscore(){
        var isValid = new PasswordValidator().validate("Password12");
        Assertions.assertEquals(false, isValid);
    }

    @Test
    public void password_is_valid_if_it_has_no_underscore_for_second_ruleset(){
        var isValid = new PasswordValidator("Validation 2").validate("Password12");
        Assertions.assertEquals(true, isValid);
    }

    @Test
    public void password_is_valid_if_it_has_no_number_for_third_ruleset(){
        var isValid = new PasswordValidator("Validation 3").validate("PasswordPassword_a");
        Assertions.assertEquals(true, isValid);
    }
}
