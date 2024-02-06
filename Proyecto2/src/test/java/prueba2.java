import org.example.Funcionalidades;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class prueba2 {
    Funcionalidades func;

    @Before
    public void setUp() {
        // si necesitara un login, se hace acá.
        func= new Funcionalidades("https://antel.com.uy");
    }

    @After
    public void tearDown() {
        // si necesito hacer un logout, se hace acá.
        func.close();
    }

    @Test
    public void test_BuscarTelefono() {
        //Initialize browser
        func.buscar_tel();
    }
}
