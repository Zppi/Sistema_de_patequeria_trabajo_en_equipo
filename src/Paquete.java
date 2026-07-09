public abstract class Paquete {
    String destinatario;
    double peso;

    public Paquete(String destinatario, double peso) {
        this.destinatario = destinatario;
        this.peso = peso;
        if(peso <= 0) {
            System.out.println("El peso debe ser mayor");
        }
    }

    public String getNombre(){
        return destinatario;
    }

    public double getPeso() {
        return peso;
    }

    //public double costoEnvio (){



}
