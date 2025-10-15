package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConversorTemperaturaTest {

    @Test
    void testConversionCelsiusAFahrenheit() {
        ConversorTemperatura conversor = new ConversorTemperatura();
        assertEquals(32, conversor.celsiusAFahrenheit(0));     // 0°C = 32°F
        assertEquals(212, conversor.celsiusAFahrenheit(100));   // 100°C = 212°F
    }
}