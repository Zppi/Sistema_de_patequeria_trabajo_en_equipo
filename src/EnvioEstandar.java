public class EnvioEstandar implements EstrategiaEnvio {

    @Override
    public double calcularCosto(double pesoKG) {
        return pesoKG *2.00;
    }

    public String getTipo(){
        return "Estandar";
    }

}
