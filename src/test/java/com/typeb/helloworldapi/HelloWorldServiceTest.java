package com.typeb.helloworldapi;

import com.typeb.helloworldapi.service.HelloWorldService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HelloWorldServiceTest {
    private final HelloWorldService service = new HelloWorldService();

    @Test
    void isValidName_whenFirstLetterBetweenAAndM_shouldReturnTrue() {
        assertTrue(service.isValidName("Alice"));
    }

    @Test
    void isValidName_whenFirstLetterBetweenNAndZ_shouldReturnFalse() {
        assertFalse(service.isValidName("Nick"));
    }

    @Test
    void isValidName_whenTheNameIsNullOrEmplty_shouldReturnFalse() {
        assertFalse(service.isValidName(null));
    }
}
