import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testArea() {
        Main retangulo = new Main();

        int resultadoArea = retangulo.area(3, 5);
        assertEquals(15, resultadoArea);
    }

    @Test
    public void testPerimetro() {
        Main retangulo = new Main();

        int resultadoPerimetro = retangulo.perimetro(5, 4);
        assertEquals(18, resultadoPerimetro);
    }

    @Test
    public void testIsTriangle() {
        Main retangulo = new Main();

        // Teste 1: Triângulo possível (3, 4, 5) - Este é um triângulo válido
        int resultado1 = retangulo.isTriangle(3, 4, 5);
        assertEquals(1, resultado1);
        }
}
