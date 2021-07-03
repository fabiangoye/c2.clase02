package co.edu.utp.misiontic2022.c2.fgoye;

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;*/
import java.util.Scanner;

//import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
    /*    var nombre = "Fabian";
        System.out.println(saludo(nombre));*/

    /*    var numero = 0;
        System.out.println(numDigitos(numero));*/

    var input = new Scanner(System.in);
    //var input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print( "por favor ingrese un nùmero: ");
     var numero = input.nextInt();    // usado con Scanner
       //var entrada = input.readLine();  usado con Buffered
       //var entrada = JOptionPane.showInputDialog(null, "Por favor ingrese un nùmero");
       //var numero = Integer.parseInt(entrada);
       System.out.printf("El nùmero tiene %d cifras \n", numDigitos(numero));  //usado con Scanner  y Buffered
    
       //JOptionPane.showMessageDialog(null, String.format("El nùmero tiene %d cifras \n", numDigitos(numero)));

    input.close();
    }

public static String saludo(String nombre) {
    return "Hola " + nombre + "!";
}

public static int numDigitos(int numero) {
    var contador = 0;
    while(numero != 0) {
        numero /= 10;
        contador++;
    }
    return contador;
}

}
