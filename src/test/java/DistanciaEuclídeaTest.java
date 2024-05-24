import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class DistanciaEuclideaTest {

    @Test
    public void testMedir() {
        DistanciaEuclídea distanciaEuclidea = new DistanciaEuclídea();
        Punto punto1 = new Punto(0, 0);
        Punto punto2 = new Punto(3, 4);
        double expected = 5.0;
        double actual = distanciaEuclidea.medir(punto1, punto2);
        assertEquals(expected, actual, "The distance should be 5.0");
    }
}