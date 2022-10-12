package EntradaDatos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDato {
    public static void main(String[] args) {
        // FileInputStream = devuelve una secuencia de bytes por eso se debe guardar en el tipo de datos acorde
        try{
            InputStream fichero = new FileInputStream("C:\\Users\\kevin\\Desktop\\fichero.txt");

            try{
                byte[] datos = fichero.readAllBytes();

                //mostrando los datos del fichero con For
                for(byte dato : datos){
                    System.out.print((char)dato);
                }
                //mostrando los datos del fichero con While
                int dato = fichero.read(datos);
                //-1 para leer hasta el [ultimo caracter
                while(dato != -1){
                    System.out.print(datos.toString());
                    //actualizando la variable
                    dato = fichero.read(datos);
                }


            }catch (IOException e){
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }

        }catch(FileNotFoundException e){
            System.out.println("Oye, que el programa da error: " + e.getMessage());
        }
    }
}
