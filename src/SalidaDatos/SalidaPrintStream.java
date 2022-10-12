package SalidaDatos;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class SalidaPrintStream {
    public static void main(String[] args) {
        //Copiando ficheros

        try {
            InputStream in = new FileInputStream("C:\\Users\\kevin\\Desktop\\fichero.txt");
            byte []datos = in.readAllBytes();
            in.close();// cerrando fichero origen
            PrintStream out = new PrintStream("C:\\Users\\kevin\\Desktop\\fichero - copia.txt");
            out.write(datos);
            out.close(); // cerrando fichero destino

        }catch (Exception e){
            System.out.println("Excepcion: " + e.getMessage());
        }

    }
}
