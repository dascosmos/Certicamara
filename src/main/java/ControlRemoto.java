import Mongo.MongoConnection;

import java.util.ArrayList;

/**
 * Created by David on 7/5/2017.
 */
public class ControlRemoto {

    private Carro carro = new Carro();
    private Formato formato = new Formato();
    private MongoConnection mongo = new MongoConnection();
    public void createElements(int x, int y){
        carro.crearSuperficie(x,y);
        mongo.createConnection();
        mongo.createDatabase();
    }

    public String movimiento(String comando){
        String[] listaComandos;
        int posx = 0;
        int posy = 0;
        String sol="";

            if (formato.RevisionNumero(comando)) {
                    listaComandos = comando.split(";");
                    for (int i = 0; i < listaComandos.length; i++) {
                        carro.getComando().movimiento(listaComandos[i]);
                        carro.setPosicion_x(carro.getComando().getPosx());
                        carro.setPosicion_y(carro.getComando().getPosy());
                        posx = carro.getPosicion_x();
                        posy = carro.getPosicion_y();

                        if(carro.getSuperficie().limite(posx, posy)) {
                            sol += "Posicion: " + posx + "," + posy+" ";
                            System.out.println("\n");
                        }else{
                            sol = "Está fuera de los limites";
                        }

                    }

                carro.getSuperficie().imprimirSuperficie(posx,posy);

            } else {
                sol= "Formato Erroneo";
            }
        mongo.createComand(sol);
        return sol;
    }

    public ArrayList imprimirHistorial(){
       return mongo.printHistory();
    }


}
