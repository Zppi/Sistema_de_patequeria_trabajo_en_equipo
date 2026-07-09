public class EnvioExpress implements EstrategiaEnvio{

    @Override
    public double calcularCosto(double pesoKG) {
        return pesoKG *4.50;
    }

    public String getTipo(){
        return  "Express";
    }

}
