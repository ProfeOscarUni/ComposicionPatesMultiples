import java.util.Vector;

public class Biblioteca {
    String nombre;
    Vector coleccionLibros;
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        coleccionLibros = new Vector<>();
    }
    void añadirLibro(Libro libro){
        coleccionLibros.add(libro);
    }
    void listarLibros(){
        for (int i = 0; i < coleccionLibros.size(); i++) {
            Libro libro = (Libro) coleccionLibros.elementAt(i);
            libro.imprimir();
            
        }
    }
    
}
