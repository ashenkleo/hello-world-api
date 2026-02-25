package com.typeb.helloworldapi.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    /**
     * Check whether the name is valid
     * Validate the empty name, non letter first character and the first letter is in between A and M
     */
    public boolean isValidName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return false;
        }

        char firstChar = Character.toUpperCase(name.trim().charAt(0));

        if (!Character.isLetter(firstChar)) {
            return false;
        }

        return firstChar >= 'A' && firstChar <= 'M';
    }

    /**
     * Format the name to have first character in uppercase and the rest in lowercase
     */
    public String formatName(String name) {
        String trimmedName = name.trim();
        return trimmedName.substring(0, 1).toUpperCase() + trimmedName.substring(1).toLowerCase();
    }
}
