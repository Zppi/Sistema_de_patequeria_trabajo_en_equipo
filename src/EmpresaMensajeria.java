import java.util.ArrayList;

public class EmpresaMensajeria {
    ArrayList<Paquete>paquetes = new ArrayList<>();

    public void RegistrarPaquete(Paquete paquete){
        paquetes.add(paquete);
    }

    public void reporte (){
        double total =0;
        for (Paquete paquete : paquetes){
            double costo = paquete.costoEnvio();

            paquete.infoPaquete();
            total += paquete.costoEnvio();

        }

        System.out.println("TOTAL RECAURADO: $"+total);
    }
}
