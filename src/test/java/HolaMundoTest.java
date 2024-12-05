import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.

public class HolaMundoTest {
    @Test
    public void testHolaMundoCasi() {
        // salvaguarda
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // acción
        HolaMundo.main(new String[] {});
        String salida = bos.toString();

        // pruebas
        assertTrue(salida.toUpperCase().contains("HOLA"));
        assertTrue(salida.toUpperCase().contains("MUNDO"));

        // restauración
        System.setOut(originalOut);
    }

    @Test
    public void testHolaMundoExacto() {
        // salvaguarda
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // acción
        HolaMundo.main(new String[] {});

        // pruebas
        assertEquals("Hola mundo!" + System.lineSeparator(), bos.toString());

        // restauración
        System.setOut(originalOut);
    }
}
