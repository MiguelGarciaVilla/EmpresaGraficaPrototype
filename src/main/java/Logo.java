import java.util.ArrayList;
import java.util.List;

public class Logo implements Prototipo {
    private String       nombre;
    private List<String> colores;
    private int          ancho;
    private int          alto;
    private String       formato;
    private String       eslogan;

    public Logo(String nombre, List<String> colores,
                int ancho, int alto, String formato, String eslogan) {
        this.nombre   = nombre;
        this.colores  = colores;
        this.ancho    = ancho;
        this.alto     = alto;
        this.formato  = formato;
        this.eslogan  = eslogan;
    }
    @Override
    public Prototipo clonar() {
        return new Logo(
                this.nombre,
                new ArrayList<>(this.colores),  
                this.ancho,
                this.alto,
                this.formato,
                this.eslogan
        );
    }


    public void setColores(List<String> c) { this.colores  = c; }
    public void setEslogan(String e)       { this.eslogan  = e; }
    public void setFormato(String f)       { this.formato  = f; }

    public void imprimir() {
        System.out.println("Nombre:"+this.nombre);
        System.out.println("Colores:");
        colores.forEach(color -> System.out.println(color));
        System.out.println("Ancho:"+this.ancho);
        System.out.println("Alto:"+this.alto);
        System.out.println("Formato:"+this.formato);
        System.out.println("Eslogan:"+this.eslogan);

    }

}
