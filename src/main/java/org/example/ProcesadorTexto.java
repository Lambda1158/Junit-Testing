package org.example;

public class ProcesadorTexto {
    public int contarCaracteres(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("El texto no puede ser nulo");
        }
        return texto.length();
    }
}