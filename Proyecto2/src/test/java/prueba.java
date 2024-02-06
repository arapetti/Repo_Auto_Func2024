
import org.example.Funcionalidades;
import org.junit.*;


public class prueba {
    Funcionalidades func;
    @Before
    public void setUp() {
        // si necesitara un login, se hace acá.
        func= new Funcionalidades("https://www.musimundo.com/");
    }

    @After
    public void tearDown() {
        // si necesito hacer un logout, se hace acá.
        func.close();
    }

    @Test
    public void test1_Registrarusuario() {
        //Initialize browser
        func.crear_cuenta();
    }

}
