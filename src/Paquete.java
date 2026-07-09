public abstract class Paquete {
    String destinatario;
    double peso;
    EstrategiaEnvio estrategiaEnvio;

    public Paquete(String destinatario, double peso, EstrategiaEnvio estrategiaEnvio) {
        this.destinatario = destinatario;
        this.peso = peso;
        this.estrategiaEnvio = estrategiaEnvio;
    }

    public double costoEnvio (){
        return estrategiaEnvio.calcularCosto(peso);
    }

    public void infoPaquete(){
        System.out.println("-------------------------------");
        System.out.println("DESTINATARIO: "+  destinatario  );
        System.out.println("PESO: "+peso+" kg");
        System.out.println("ENVIO: "+estrategiaEnvio.getTipo());
        System.out.println("COSTO: $"+costoEnvio());
    }

}
