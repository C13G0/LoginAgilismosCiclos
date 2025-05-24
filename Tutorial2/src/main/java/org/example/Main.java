package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //entradas

        Scanner leerTeclado = new Scanner(System.in);
        String usuario;
        String usuarioBD = "cristiano777";
        String contraseña;
        String contraseñaBD = "admin123*";


        int numeroDeIntentos = 0;

        while(numeroDeIntentos < 3){
            System.out.println("********** LOGIN ***********");
            System.out.print("\n Digita tu nombre de ususario: ");
            usuario = leerTeclado.nextLine();

            System.out.println("\n Digita tu contraseña: ");
            contraseña = leerTeclado.nextLine();

            if (usuario.equals(usuarioBD) && contraseña.equals(contraseñaBD)){
                System.out.println("Apreciado usuario bienvenido");
                break;

            }else{
                System.out.println("Apreciado usuario, revisa tus datos por favor");
                numeroDeIntentos++;

            }


        }


      //  ARRANCARIA LA LOGICA DEL PROGRAMA
                

        //procesos
        //ELPROCESO ES COMPARAR LAS 4 ENTRADAS

       /* System.out.println("********** LOGIN ***********");
        System.out.print("\n Digita tu nombre de ususario: ");
        usuario = leerTeclado.nextLine();

        System.out.println("\n Digita tu contraseña: ");
        contraseña = leerTeclado.nextLine();

        if (usuario.equals(usuarioBD) && contraseña.equals(contraseñaBD)){
            System.out.println("Apreciado usuario bienvenido");

        }else{
            System.out.println("Apreciado usuario, revisa tus datos por favor");

        }
*/
        //salidas


    }
}