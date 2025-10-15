package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProcesadorTextoTest {

    @Test
    void testExcepcionPorValorNulo() {
        ProcesadorTexto p = new ProcesadorTexto();
        assertThrows(IllegalArgumentException.class, () -> p.contarCaracteres(null));
    }
}