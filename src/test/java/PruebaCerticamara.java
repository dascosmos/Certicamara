import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by david on 6/07/2017.
 */
public class PruebaCerticamara {


    private ControlRemoto obj;
    private int x;
    private int y;

    @Before
    public void setup(){
        obj = new ControlRemoto();
        x = 10;
        y = 10;
    }


    @Test
    public void MoverNorteCincoTest(){
        String comando = "5,N;";
        obj.createElements(x,y);
        String resultado = obj.movimiento(comando);

        assertEquals("Posicion final: 0,5",resultado);

    }

    @Test
    public void MoverOeste7(){
        String comando = "7,O;";
        obj.createElements(x,y);
        String resultado = obj.movimiento(comando);

        assertEquals("Posicion final: 7,0",resultado);
    }

    @Test
    public void VariosComandos(){
        String comando = "7,O;5,N;3,E;2,S;2,S;";
        obj.createElements(x,y);
        String resultado = obj.movimiento(comando);

        assertEquals("Posicion final: 4,1",resultado);
    }

    @After
    public void fin(){
        System.out.println("Ambos tests funcionando");
    }
}
