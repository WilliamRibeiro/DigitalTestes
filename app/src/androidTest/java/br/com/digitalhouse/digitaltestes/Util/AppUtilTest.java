package br.com.digitalhouse.digitaltestes.Util;

import org.junit.Test;

import static br.com.digitalhouse.digitaltestes.Util.AppUtil.validateEmail;
import static br.com.digitalhouse.digitaltestes.Util.AppUtil.validatePassword;
import static org.junit.Assert.*;

public class AppUtilTest {

    @Test
    public void validateEmailIsCorrect() {
        assertTrue(validateEmail("william@digital.com"));
    }


    @Test
    public void validateEmailIsWrong() {
        assertTrue(validateEmail("wiiama@digit.com"));

    }

    @Test
    public void validatePasswordIsCorrect() {
        assertTrue(validatePassword("123456"));
    }


    @Test
    public void validatePasswordIsWrong() {
        assertTrue(validatePassword("231456"));
    }

    @Test
    public void isValidEmailAddress() {
    }

    @Test
    public void isInvalidEmailAddress() {
    }
}