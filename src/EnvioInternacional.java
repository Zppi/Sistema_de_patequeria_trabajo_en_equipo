public class EnvioInternacional implements EstrategiaEnvio{

    @Override
    public double calcularCosto(double pesoKG) {
        return pesoKG *6.00;
    }

    public String getTipo(){
        return "Internacional";
    }

}
