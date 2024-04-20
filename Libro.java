public class Libro {
    String titulo;
    String autor;
    int añoPublicacion;
    String editorial;
    String refBibliografica;
    public Libro(String titulo, String autor, int añoPublicacion, String editorial, String refBibliografica) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.editorial = editorial;
        this.refBibliografica = refBibliografica;
    }
    void imprimir(){
        System.out.println("Titulo del libro = "+titulo);
        System.out.println("Autor = "+autor);
        System.out.println("Año de publicación = "+añoPublicacion);
        System.out.println("Editorial = " +editorial);
        System.out.println("Referencia bibliográfica = " +refBibliografica);
        System.out.println();
    }
    

    
}