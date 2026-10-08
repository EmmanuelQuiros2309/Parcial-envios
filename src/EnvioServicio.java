import java.util.ArrayList;

public class EnvioServicio {

    private ArrayList<Envio> lista = new ArrayList<>();

    public void agregar(Envio e) {
        lista.add(e);
    }

    public boolean eliminar(String codigo) {
        for (Envio e : lista) {
            if (e.getCodigo().equals(codigo)) {
                lista.remove(e);
                return true;
            }
        }
        return false;
    }

    public String listar() {
        String resultado = "";
        for (Envio e : lista) {
            resultado += e.toString() + "\n";
        }
        return resultado;
    }
}