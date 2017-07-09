import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ProbarComando {

    private ControlRemoto obj;
    private int x;
    private int y;
    private int val1 = 5;
    private int val2 = 9;

    @Before
    public void setup(){
        obj = new ControlRemoto();
        x = 5;
        y = 6;
    }

    @Test
    public void MoveraF(){
        String comando = "5,F;";
        obj.createElements(x,y);
        val1 = obj.carro.getPosicion_x();
        val2 = obj.carro.getPosicion_y();

        assertNotEquals(5,val1);
    }

    @After
    public void fin(){
        System.out.println("Test MoveraF funcionando.");

    }

}
