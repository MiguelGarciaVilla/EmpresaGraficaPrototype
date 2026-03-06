import java.util.HashMap;
import java.util.Map;

public class RegistroPlantillas {
    private Map<String, Prototipo> cache= new HashMap<>();

    public void registrar(String clave, Prototipo prototipo){
        cache.put(clave, prototipo);
    }

    public Prototipo obtener(String clave){
        Prototipo prototipo = cache.get(clave);
        if(prototipo == null){
            throw new RuntimeException("No se encontro el prototipo de clave:"+clave);
        }
        return prototipo.clonar();
    }

}
