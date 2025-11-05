package com.campusdual.classroom;

import java.io.IOException;

public class Exercise {
    public static void main(String[] args) {
        try {
            System.out.println("Intentando una operación que puede fallar.");

            throw new IOException("Simulación de error de entrada/salida: no se pudo leer el archivo.");

        }

        catch (IOException e) {
            System.err.println("\n*** Excepción Controlada ***");

        }

    }
}
