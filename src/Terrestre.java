public class Terrestre extends Envio {

    public Terrestre(String cliente, String codigo, double peso, double distancia) {
        super(cliente, codigo, peso, distancia);
    }

    @Override
    public double calcularTarifa() {
        return (1500 * distancia) + (2000 * peso);
    }
