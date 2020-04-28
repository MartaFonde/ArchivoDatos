package app;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ArchivoTexto {
    public static void guardarDato(ArrayList<Juego> col, String archivo){
        boolean correcto=true;
        try(PrintWriter f = new PrintWriter(new FileWriter(archivo, false))){
            for(Juego juego: col){
                correcto=true;
                f.println(juego.getTitulo());
                f.println(juego.getAno());
                f.println(juego.getFabricante());
            }
        }catch(Exception e){
            correcto=false;
            System.out.println("Error al guardar los datos: "+e.getMessage());
        }
        if(correcto){
            System.out.println("Datos guardados");
        }
    }

    public static void leerDatos(ArrayList<Juego> col, String archivo){
        String titulo;
        int ano;
        String fabricante;
        Juego juego;
        boolean correcto=true;
        try(Scanner f = new Scanner(new File(archivo))){
            while(f.hasNext()){
                correcto=true;
                titulo=f.nextLine();
                ano=f.nextInt();
                f.nextLine();
                fabricante=f.nextLine();
                juego = new Juego(titulo, ano, fabricante);
                col.add(juego);
            }
        }catch(Exception e){
            correcto=false;
            System.out.println("Error al cargar los datos: "+e.getMessage());
        }
        if(correcto){
            System.out.println("Datos cargados");
        }
    }
}
