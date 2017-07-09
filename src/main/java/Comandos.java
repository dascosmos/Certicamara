import java.util.StringTokenizer;

/**
 * Created by David on 7/5/2017.
 */
public class Comandos {

    private int posx = 0;
    private int posy = 0;

    //Evalua el comando recibido y retorna la posicion nueva;
    public void movimiento(String comando){

        StringTokenizer token = new StringTokenizer(comando,",");
        int pos = Integer.parseInt(token.nextToken());
        String dir = token.nextToken();

        switch(dir){
            case "N": posy += pos;
                        break;
            case "S": posy -= pos;
                        break;
            case "E": posx -= pos;
                        break;
            case "O": posx += pos;
                        break;
            default: posx = 0;
                     posy = 0;
                        break;
        }
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }
}
