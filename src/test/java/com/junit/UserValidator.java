package com.junit;

import org.junit.Test;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL_ADDRESS_PATTERN = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";


    public boolean validateFirstName(String deepak) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(deepak).matches();
    }

    public boolean validateEmailAddress(String s) {
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
        return  pattern.matcher(s).matches();
    }

    public boolean validateLastName(String jaiswal) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(jaiswal).matches();

    }
}
