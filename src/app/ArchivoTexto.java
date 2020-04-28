package app;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ArchivoTexto {
    public static boolean guardarDato(ArrayList<Juego> col, String archivo){
        try(PrintWriter f = new PrintWriter(new FileWriter(archivo, false))){
            for(Juego juego: col){
                f.println(juego.getTitulo());
                f.println(juego.getAno());
                f.println(juego.getFabricante());
            }
        }catch(Exception e){
            return false;
        }
        return true;
    }

    public static void leerDatos(ArrayList<Juego> col, String archivo){
        String titulo;
        int ano;
        String fabricante;
        Juego juego;
        try(Scanner f = new Scanner(new File(archivo))){
            while(f.hasNext()){
                titulo=f.nextLine();
                ano=f.nextInt();
                f.nextLine();
                fabricante=f.nextLine();
                juego = new Juego(titulo, ano, fabricante);
                col.add(juego);
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
