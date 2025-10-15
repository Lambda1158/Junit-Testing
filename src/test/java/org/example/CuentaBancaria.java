package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CuentaBancariaTest {

    @Test
    void testDeposito() {
        CuentaBancaria cuenta = new CuentaBancaria(100);
        cuenta.depositar(50);
        assertEquals(150, cuenta.getSaldo());
    }

    @Test
    void testRetiroValido() {
        CuentaBancaria cuenta = new CuentaBancaria(100);
        cuenta.retirar(50);
        assertEquals(50, cuenta.getSaldo());
    }

    @Test
    void testRetiroExcedeSaldo() {
        CuentaBancaria cuenta = new CuentaBancaria(100);
        assertThrows(IllegalArgumentException.class, () -> cuenta.retirar(200));
    }
}