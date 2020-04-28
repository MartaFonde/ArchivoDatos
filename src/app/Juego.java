package app;
import java.util.Scanner;

public class Juego {
    private String titulo;
    private int ano;
    private String fabricante;
    
    /**
     * Pide título, año y fabricante al usuario e inicializa las propiedades
     */
    public Juego(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce título: ");
        setTitulo(sc.nextLine().trim());
        System.out.print("Introduce año: ");
        setAno(Integer.parseInt(sc.nextLine().trim()));
        System.out.print("Introduce fabricante: ");
        setFabricante(sc.nextLine().trim());
    }
    
    /**
     * Inicializa las propiedades titulo, año y fabricante
     * @param titulo titulo dado
     * @param ano año dado
     * @param fabricante fabricante dado
     */
    public Juego(String titulo, int ano, String fabricante) {
        setTitulo(titulo);
        setAno(ano);
        setFabricante(fabricante);   
    }
    
    /**
     * Establece el valor de la propiedad título pasándolo a mayúsculas
     * @param titulo título dado
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo.toUpperCase();
    }
    
    /**
     * Devuelve el valor de la propiedad título
     * @return título
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el valor de la propiedad año. Si es negativo le asigna el valor 2000
     * @param ano año dado
     */
    public void setAno(int ano) {
        if(ano<0){
            this.ano = 2000;
        }else{
            this.ano = ano;
        }
    }

    /**
     * Devuelve el valor de la propiedad año
     * @return año
     */
    public int getAno() {
        return ano;
    }

    /**
     * Establece el valor de la propiedad fabricante pasándolo a mayúsculas
     * @param fabricante
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante.toUpperCase();
    }
    
    /**
     * Devuelve el valor de la propiedad fabricante
     * @return fabricante
     */
    public String getFabricante() {
        return fabricante;
    }
    
}