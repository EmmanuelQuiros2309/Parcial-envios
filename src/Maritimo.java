public class Maritimo extends Envio {

    public Maritimo(String cliente, String codigo, double peso, double distancia) {
        super(cliente, codigo, peso, distancia);
    }

    @Override
    public double calcularTarifa() {
        return (800 * distancia) + (1000 * peso);
    }
}