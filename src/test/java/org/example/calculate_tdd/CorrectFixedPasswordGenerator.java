package org.example.calculate_tdd;

import org.example.password.PasswordGenerator;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "abcdefgh";  // 8글자
    }
}
