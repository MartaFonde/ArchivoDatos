package app;
import java.util.Scanner;
import java.util.ArrayList;

public class VideojuegoMain {

    public static void juegosInicio(ArrayList<Juego> colecJuegos){
        Juego juego=new Juego("The Sims", 2000, "Maxis");
        colecJuegos.add(juego);
        juego=new Juego("Imperivm Civitas", 2006, "FX Interactive");
        colecJuegos.add(juego);
        juego=new Juego("GTA San Andreas", 2004, "Rockstar Games");
        colecJuegos.add(juego);
        juego=new Juego("GTA Vice city", 2001, "Rockstar Games");
        colecJuegos.add(juego);
    }

    public static void main(String[] args) {
        int opcion=0;
        Scanner sc=new Scanner(System.in);
        String archivo = System.getProperty("user.home")+"/coleccionJuegos.txt";
        ArrayList<Juego> colecJuegos=new ArrayList<Juego>();
        System.out.println("¿Quieres leer los datos del archivo?\n 1. Sí\n 2. No");
        opcion = sc.nextInt();
        if(opcion == 1){
            ArchivoTexto.leerDatos(colecJuegos, archivo);
        }
        JuegoMenu menu=new JuegoMenu();
        menu.mostrarMenu(colecJuegos, archivo);
    }         
}