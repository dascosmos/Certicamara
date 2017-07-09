/**
 * Created by David on 7/07/2017.
 */
public class Formato {

    private String pattern1 ="([0-9],[NSOE];)+";

    public boolean RevisionNumero(String comando){
        boolean valido = false;
        for(int i = 0; i<comando.length();i++){
            if (comando.matches(pattern1)){
                valido = true;
            }else{
                valido = false;
            }
        }
        return valido;
    }

}
