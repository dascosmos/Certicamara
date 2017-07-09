/**
 * Created by David on 7/5/2017.
 */
public class Carro {
    private int posicion_x;
    private int posicion_y;
    private Superficie superficie;
    private Comandos comando = new Comandos();
    public void crearSuperficie(int x, int y){
        superficie = new Superficie(x,y);
    }

    public int getPosicion_x() {
        return posicion_x;
    }

    public int getPosicion_y() {
        return posicion_y;
    }

    public Superficie getSuperficie() {
        return superficie;
    }

    public void setPosicion_x(int posicion_x) {
        this.posicion_x = posicion_x;
    }

    public void setPosicion_y(int posicion_y) {
        this.posicion_y = posicion_y;
    }

    public void setSuperficie(Superficie superficie) {
        this.superficie = superficie;
    }

    public Comandos getComando() {
        return comando;
    }

    public void setComando(Comandos comando) {
        this.comando = comando;
    }
}
