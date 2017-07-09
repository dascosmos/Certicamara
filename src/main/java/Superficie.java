/**
 * Created by David on 7/5/2017.
 */
public class Superficie {

    int fila = 0;
    int columna = 0;

    int[][] superficie;

    //inicializar variables

    public Superficie(int fila, int columna) {
        this.columna = columna;
        this.fila = fila;
        this.superficie = new int[fila][columna];
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public int[][] getSuperficie() {
        return superficie;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public void setSuperficie(int[][] superficie) {
        this.superficie = superficie;
    }

    // calcula el limite de la superficie
    public boolean limite(int x, int y){
        if (x>=columna || x< 0 || y>=fila || y<0){
            return false;
        }else{
            return true;
        }
    }
     //imprime la superficie.
    public void imprimirSuperficie(int posx, int posy){
        try {
            for (int i = superficie.length - 1; i >= 0; i--) {
                System.out.print("|");
                for (int j = 0; j < superficie[i].length; j++) {
                    superficie[posy][posx] = 1;
                    System.out.print(superficie[i][j]);
                    if (j != superficie[i].length - 1) System.out.print("\t");
                }
                System.out.println("|");
            }
        }catch(ArrayIndexOutOfBoundsException e){

        }
    }

}
