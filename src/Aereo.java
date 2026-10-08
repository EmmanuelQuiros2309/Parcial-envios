public class Aereo extends Envio {

    public Aereo(String cliente, String codigo, double peso, double distancia) {
        super(cliente, codigo, peso, distancia);
    }

    @Override
    public double calcularTarifa() {
        return (5000 * distancia) + (4000 * peso);
    }
}