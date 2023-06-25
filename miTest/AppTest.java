package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Matriz a;
    static Matriz b;
    static Matriz resSuma;
    static Matriz resMultiplica;

    @BeforeAll public static void setUp() {
        // Datos de la matriz A
        int [][] datosA = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // Datos de la matriz B
        int[][] datosB = {
            {9,8,7},
            {6,5,4},
            {3,2,1}
        };

        // Datos de la suma de A + B
        int[][] datosSuma = {
            {10, 10, 10},
            {10, 10, 10},
            {10, 10, 10}
        };

        // Datos de la multiplicación de A * B
        int[][] datosMultiplica = {
            {30, 24, 18},
            {84, 69, 54},
            {138,114,90}
        };

        a = new Matriz(3, 3, datosA);
        b = new Matriz(3, 3, datosB);
        resSuma = new Matriz(3, 3, datosSuma );
        resMultiplica = new Matriz(3, 3, datosMultiplica);
    }

    @Test public void testSuma() {
        assertTrue(a.suma(b).esIgualA(resSuma));
    }

    @Test public void testCondicion() {
        assertTrue(a.getColumnas() == b.getRenglones());
    }

    @Test public void testMultiplica() {
        assertTrue(a.multiplica(b).esIgualA(resMultiplica));
    }

}