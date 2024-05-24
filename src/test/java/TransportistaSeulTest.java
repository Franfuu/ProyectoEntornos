import org.junit.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
 class TransportistaSeulTest {

    @Test
    public void testPresupuestar() {
        TransportistaSeul transportistaSeul = new TransportistaSeul();
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(3, 4);
        double peso = 10.0;
        double expected = 50.0;
        double actual = transportistaSeul.presupuestar(origen, destino, peso);
        assertEquals(expected, actual, "The cost should be 50.0");
    }

}