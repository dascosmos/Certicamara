

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ControlRemoto obj = new ControlRemoto();
        Scanner entrada = new Scanner(System.in);
        System.out.println("\t\t CARRO A CONTROL REMOTO \t\t\n");
        System.out.println("INSTRUCCIONES:\n " +
                "1. Elija el tamaño de la superficie en filas y columnas\n" +
                "2. De la orden al carro en el formato <desplazamiento>,<direccion>; el ';' es necesario al final del comando.\n" +
                "3. Puede enviar varios comandos siempre y cuando se respete el punto anterior. Ejemplo, 3,N;2,O;1,S;\n" +
                "4. para la dirección se usa las letras N,S,O,E no escribir minusculas.\n");
        System.out.println("Ingrese el tamaño de las filas: ");
        int a = entrada.nextInt();
        System.out.println("Ingrese el tamaño de las columnas: ");
        int b = entrada.nextInt();
        obj.createElements(a,b);

        System.out.println("Ingrese el comando en el formato <desplazamiento>,<direccion>;");
        String comand = entrada.next();

        String resultado = obj.movimiento(comand);
        System.out.println(resultado);
    }
}
