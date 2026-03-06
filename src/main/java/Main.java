import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RegistroLogos reg= new RegistroLogos();

        ArrayList<String> coloresCorporativo= new ArrayList<>();
        coloresCorporativo.add("rojo");
        coloresCorporativo.add("verde");
        coloresCorporativo.add("amarillo");

        ArrayList<String> coloresMinimalista= new ArrayList<>();
        coloresMinimalista.add("azul");
        coloresMinimalista.add("negro");
        coloresMinimalista.add("blanco");

        Logo corporativo= new Logo (
                "Logo Corporativo",
               coloresCorporativo,
                800,
                400,
                "SVG",
                "Innovación con propósito"
        );

        Logo minimalista= new Logo (
                "Logo Minimalista",
                coloresMinimalista,
                480,
                400,
                "PNG",
                "Menos es más"
        );

        reg.registrar("corporativo", corporativo);
        reg.registrar("minimalista", minimalista);

        Logo logoClonCliente= (Logo) reg.obtener("corporativo");
        logoClonCliente.setColores (List.of("azul","rojo","rosa"));
        logoClonCliente.setEslogan ("Sabores auténticos");
        logoClonCliente.setFormato ("PDF");


        System.out.println("Logo Original:");
        corporativo.imprimir();
        System.out.println();
        System.out.println("Logo Cliente:");
        logoClonCliente.imprimir();

    }
}
